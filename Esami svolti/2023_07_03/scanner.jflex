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

//idCStyle = [a-zA-Z_][a-zA-Z0-9_]*

//number = [0-9]+
//numberNonZero = [1-9][0-9]*
//sign = ("+"|"-")
//realNumber = ("+"|"-")?([1-9][0-9]*\.[0-9]*) | (\.[0-9]+) | (0\.[0-9]*)
uint = 0 | [1-9][0-9]*
//hexnum = 0 | [1-9a-fA-F][0-9a-fA-F]*

//date = ((0[1-9])|([1-2][0-9])|(3(0|1)))"/"((0[1-9])|(1(0|1|2)))"/"(2[0-9][0-9][0-9])
//hour = (((0|1)[0-9])|(2[0-3]))":"([0-5][0-9])
//timeAmPm = ((0[0-9])|(1[0-2]))":"([0-5][0-9]) ("am"|"pm")?

//ip_num = (2(([0-4][0-9])|(5[0-5])))|(1[0-9][0-9])|([1-9][0-9])|([0-9])
//ip = {ip_num}"."{ip_num}"."{ip_num}"."{ip_num}

//doubleExpNotation = (([0-9]+\.[0-9]*) | ([0-9]*\.[0-9]+)) (e|E('+'|'-')?[0-9]+)?

qstring = \" ~ \"
//email = ([a-zA-Z0-9_\.])+"@"([a-zA-Z])+"."([a-zA-Z])+
//file = [a-zA-Z][a-zA-Z0-9]*"."[a-zA-Z]{3}


/*Ciascun token termina con ... Questo deve essere gestito nel parser*/
/* TOKEN1 -                                                                                         from 03:51:47 to 23:45:34 */

token1 = "!!!!"("!!")*({numberA}|("?????"("??")*))

numberA = ((\-1[02468]) | (\-[2468]) | ([02468]) | ([1-9][02468]) | (1[0-9][02468]) | (2[0-7][02468]) | (28[0246]) )


/* TOKEN2 -  101 1010001*/

token2 = ((0[2-9]\/07\/2023) | ([1-2][0-9]\/0[7-9]\/2023) | (3[0-1]\/0[7-8]\/2023) | (0[1-9]\/0[8-9]\/2023) | (30\/09\/2023) | (0[1-6]\/10\/2023) | (2023\/07\/0[2-9]) | (2023\/0[7-9]\/[1-2][0-9]) | (2023\/0[7-8]\/3[0-1]) | (2023\/0[8-9]\/0[1-9]) | (2023\/09\/30) | (2023\/10\/0[1-6]) )

//binary = ((101) | (11[01]) | (1[01][01][01]) | (1[01][01][01][01]) | (1[01][01][01][01][01]) | (100[01][01][01][01]) | (101000[01]))


/*TOKEN3*/

token3 = ((0[8-9]:[0-5][0-9]:[0-5][0-9])    |    (1[0-9]:[0-5][0-9]:[0-5][0-9]) | (2[01]:[0-5][0-9]:[0-5][0-9]) | (07:[4-9][0-9]:[0-5][0-9]) | (07:3[8-9]:[0-5][0-9]) | (07:37:[2-5][0-9]) | (07:37:19) | (22:[0-2][0-9]:[0-5][0-9]) | (22:3[0-8]:[0-5][0-9]) | (22:39:[0-1][0-9]) | (22:39:2[0-3]) | (07:3[7-9]) | (07:[4-5][0-9]) | (0[8-9]:[0-5][0-9]) | (1[0-9]:[0-5][0-9]) | (2[0-1]:[0-5][0-9]) | (22:[0-2][0-9]) | (22:3[0-9]) )

//token3 = B\_{wordB}({wordBDashed}){min-1}({wordBDashed}{wordBDashed})*
//wordBDashed = {sepWB}{wordB}
//wordB =
//sepWB = 

sep = "$$$"("$$")*


nl = \r | \n | \r\n
comment = "<*" ~ "*>"

%%

{sep}					{return sym(sym.SEP);}

{token1}				{return sym(sym.TK1);}
{token2}				{return sym(sym.TK2);}
{token3}				{return sym(sym.TK3);}

"house"				{return sym(sym.HOUSE);}
"start"				{return sym(sym.START);}
"end"					{return sym(sym.END);}
"if"                    {return sym(sym.IF);}
"then"                  {return sym(sym.THEN);}
"fi"                    {return sym(sym.FI);}
"and"                   {return sym(sym.AND);}
"or"                    {return sym(sym.OR);}
"not"                   {return sym(sym.NOT);}
"print"                 {return sym(sym.PRINT);}

//{idCStyle}			{return sym(sym.ID, new String(yytext()));}

{qstring}				{return sym(sym.QSTRING, new String(yytext()));}
{uint}				{return sym(sym.UINT, new Integer(yytext()));}
//{realNumber}			{return sym(sym.REAL, new Double(yytext()));}

"."					{return sym(sym.DOT);}
","					{return sym(sym.CM);}
";"					{return sym(sym.S);}
//":"					{return sym(sym.COL);}
"("					{return sym(sym.RO);}
")"					{return sym(sym.RC);}
//"["					{return sym(sym.SO);}
//"]"					{return sym(sym.SC);}
//"{"					{return sym(sym.BO);}
//"}"					{return sym(sym.BC);}
//"="					{return sym(sym.EQ);}
"=="					{return sym(sym.EQEQ);}
//"!="					{return sym(sym.NEQ);}
//"&&"					{return sym(sym.AND);}
//"||"					{return sym(sym.OR);}
//"!"					{return sym(sym.NOT);}
//"|"					{return sym(sym.PIPE);}
//"+"					{return sym(sym.PLUS);}
//"-"					{return sym(sym.MINUS);}
//"*"					{return sym(sym.STAR);}
//"/"					{return sym(sym.DIV);}
//"^"					{return sym(sym.PWR);}
//"<"					{return sym(sym.MIN);}
//">"					{return sym(sym.MAJ);}
//"=<"					{return sym(sym.EQ_MIN);}
//"=>"					{return sym(sym.EQ_MAJ);}
//"<="					{return sym(sym.MIN_EQ);}
//">="					{return sym(sym.MAJ_EQ);}
//"`"					{return sym(sym.BACKTICK);}
//"~"					{return sym(sym.TILDE);}
//"->"					{return sym(sym.ARROW);}



{comment}					{;}
\r | \n | \r\n | " " | \t	{;}

.				{ System.out.println("Scanner Error: " + yytext()); }
