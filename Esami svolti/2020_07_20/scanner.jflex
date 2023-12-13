/**************************
 Scanner
***************************/

import java_cup.runtime.*;

%%

%unicode
%cup
%line
%column

%{
	private Symbol sym(int type) {
		return new Symbol(type, yyline, yycolumn);
	}
	
	private Symbol sym(int type, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}
	
%}

//ws = [\t]

idCStyle = [a-zA-Z_][a-zA-Z0-9_]*

//number = [0-9]+
//numberNonZero = [1-9][0-9]*
//sign = ("+"|"-")
//realNumber = ("+"|"-")?([1-9][0-9]*\.[0-9]*) | (\.[0-9]+) | (0\.[0-9]*)
uint = 0 | [1-9][0-9]*
//hexnum = [0-9a-fA-F]

//date = ((0[1-9])|([1-2][0-9])|(3(0|1)))"/"((0[1-9])|(1(0|1|2)))"/"(2[0-9][0-9][0-9])
//hour = (((0|1)[0-9])|(2[0-3]))":"([0-5][0-9])
//timeAmPm = ((0[0-9])|(1[0-2]))":"([0-5][0-9]) ("am"|"pm")?

//ip_num = (2(([0-4][0-9])|(5[0-5])))|(1[0-9][0-9])|([1-9][0-9])|([0-9])
//ip = {ip_num}"."{ip_num}"."{ip_num}"."{ip_num}

//doubleExpNotation = (([0-9]+\.[0-9]*) | ([0-9]*\.[0-9]+)) (e|E('+'|'-')?[0-9]+)?

//qstring = \" ~ \"
//email = ([a-zA-Z0-9_\.])+"@"([a-zA-Z])+"."([a-zA-Z])+
//file = [a-zA-Z][a-zA-Z0-9]*"."[a-zA-Z]{3}
sep = \$\$

/*TOKEN1*/

token1 = [a-c]{7}([a-c]{2})*\#{evenHex}?

evenHex = (\-(([5][02468acAC]) | ([1-4][02468aceACE]) | ([2468aceACE])))   |    (([02468aceACE]) | ([1-9a-fA-F][02468aceACE]) | ([1-9][0-9a-fA-F][02468aceACE]) | ([aA][0-9aA][02468aceACE]) | ([aA][bB][0246]))

/*TOKEN2 ----- hour from 07:13:24 to 17:37:43 ----- binary from 101 to 11010 ------*/

token2 = {hour}\:{binary}

hour = (((0[8-9])|(1[0-6]))\:[0-5][0-9]\:[0-5][0-9])      |         (07\:[2-5][0-9]\:[0-5][0-9]) | (07\:1[4-9]\:[0-5][0-9]) | (07\:13\:[3-5][0-9]) | (07\:13\:2[4-9])        |           (17\:[0-2][0-9]\:[0-5][0-9]) | (17\:3[0-6]\:[0-5][0-9]) | (17\:37\:[0-3][0-9]) | (17\:37\:4[0-3])

binary = ((101) | (11[0-1]) | (1[0-1][0-1][0-1]) | (10[0-1][0-1][0-1]) | (1100[0-1]) | (11010))


/*TOKEN3*/


nl = \r | \n | \r\n
comment = (\(\+\+) ~ (\+\+\))
//comment = "(++" ~ "++)"

%%

{sep}					{return sym(sym.SEP);}

{token1}				{return sym(sym.TK1);}
{token2}				{return sym(sym.TK2);}
//{token3}				{return sym(sym.TK3);}

"compare"				{return sym(sym.COMPARE, new String(yytext()));}
"with"					{return sym(sym.WITH, new String(yytext()));}
"end"					{return sym(sym.END, new String(yytext()));}
"print"					{return sym(sym.PRINT, new String(yytext()));}

{idCStyle}				{return sym(sym.ID, new String(yytext()));}

//{qstring}				{return sym(sym.QSTRING, new String(yytext()));}
{uint}					{return sym(sym.UINT, new Integer(yytext()));}
//{realNumber}			{return sym(sym.REAL, new Double(yytext()));}

//"."					{return sym(sym.DOT);}
//","					{return sym(sym.CM);}
";"						{return sym(sym.S);}
//":"					{return sym(sym.COL);}
"("						{return sym(sym.RO);}
")"						{return sym(sym.RC);}
//"["					{return sym(sym.SO);}
//"]"					{return sym(sym.SC);}
"{"						{return sym(sym.BO);}
"}"						{return sym(sym.BC);}
"="						{return sym(sym.EQ);}
//"=="					{return sym(sym.EQEQ);}
//"!="					{return sym(sym.NEQ);}
//"&&"					{return sym(sym.AND);}
//"||"					{return sym(sym.OR);}
//"!"					{return sym(sym.NOT);}
//"|"					{return sym(sym.PIPE);}
"+"						{return sym(sym.PLUS);}
"-"						{return sym(sym.MINUS);}
"*"						{return sym(sym.STAR);}
"/"						{return sym(sym.DIV);}
//"^"					{return sym(sym.PWR);}
//"<"					{return sym(sym.MIN);}
//">"					{return sym(sym.MAJ);}
//"`"					{return sym(sym.BACKTICK);}
//"~"					{return sym(sym.TILDE);}
//"->"					{return sym(sym.ARROW);}



{comment}					{;}
\r | \n | \r\n | " " | \t	{;}

.				{ System.out.println("Scanner Error: " + yytext()); }
