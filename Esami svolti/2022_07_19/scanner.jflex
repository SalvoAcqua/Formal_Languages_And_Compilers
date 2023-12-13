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
realNumber = ("+"|"-")?([1-9][0-9]*\.[0-9]*) | (\.[0-9]+) | (0\.[0-9]*)
//uint = 0 | [1-9][0-9]*
//hexnum = 0 | [1-9a-fA-F][0-9a-fA-F]*

//date = ((0[1-9])|([1-2][0-9])|(3(0|1)))"/"((0[1-9])|(1(0|1|2)))"/"(2[0-9][0-9][0-9])
//hour = (((0|1)[0-9])|(2[0-3]))":"([0-5][0-9])
//timeAmPm = ((0[0-9])|(1[0-2]))":"([0-5][0-9]) ("am"|"pm")?

//ip_num = (2(([0-4][0-9])|(5[0-5])))|(1[0-9][0-9])|([1-9][0-9])|([0-9])
//ip = {ip_num}"."{ip_num}"."{ip_num}"."{ip_num}

//doubleExpNotation = (([0-9]+\.[0-9]*) | ([0-9]*\.[0-9]+)) (e|E('+'|'-')?[0-9]+)?

//qstring = \" ~ \"
//email = ([a-zA-Z0-9_\.])+"@"([a-zA-Z])+"."([a-zA-Z])+
//file = [a-zA-Z][a-zA-Z0-9]*"."[a-zA-Z]{3}


/* TOKEN1 */

token1 = A\_({binary}|{word})

binary = ((1*01*01*) | (1*01*01*01*01*01*))

word = ((\+((\*)(\+))*\*?)| (\*((\+)(\*))*\+?))

/* TOKEN2 -  101 1010001*/

token2 = B\_{wordB}({wordBDashed}){3}({wordBDashed}{wordBDashed})*

wordBDashed = ((\*)|(\$)|(\+)){wordB}

wordB = ( (\-3[02]) | (\-[1-2][02468]) | (\-[02468]) | ([02468]) | ([1-9][02468]) | ([1-9][0-9][02468]) | (1[01][0-9][02468]) | (12[0-3][02468]) | (124[0246]) )

//binary = ((101) | (11[01]) | (1[01][01][01]) | (1[01][01][01][01]) | (1[01][01][01][01][01]) | (100[01][01][01][01]) | (101000[01]))


/*TOKEN3*/


sep = "%%%%"("%%")*

nl = \r | \n | \r\n
comment1 = "(((-" ~ "-)))"
comment2 = "---".*

%%

{sep}					{return sym(sym.SEP);}

{token1}				{return sym(sym.TK1);}
{token2}				{return sym(sym.TK2);}
//{token3}				{return sym(sym.TK3);}

"START"					{return sym(sym.START);}
"BATTERY"				{return sym(sym.BATTERY, new String(yytext()));}
"kWh"					{return sym(sym.KWH);}
"FUEL"					{return sym(sym.FUEL, new String(yytext()));}
"liters"				{return sym(sym.LITERS);}
"PLUS"					{return sym(sym.PLUS);}
"STAR"					{return sym(sym.STAR);}
"MAX"					{return sym(sym.MAX);}
"MOD"					{return sym(sym.MOD);}
"USE"					{return sym(sym.USE);}
"DO"					{return sym(sym.DO);}
"DONE"					{return sym(sym.DONE);}
"km"					{return sym(sym.KM);}
"units/km"				{return sym(sym.UNITS);}


//{idCStyle}			{return sym(sym.ID, new String(yytext()));}

//{qstring}				{return sym(sym.QSTRING, new String(yytext()));}
//{uint}				{return sym(sym.UINT, new Integer(yytext()));}
{realNumber}			{return sym(sym.REAL, new Double(yytext()));}

//"."					{return sym(sym.DOT);}
","						{return sym(sym.CM);}
";"						{return sym(sym.S);}
//":"					{return sym(sym.COL);}
"("						{return sym(sym.RO);}
")"						{return sym(sym.RC);}
//"["					{return sym(sym.SO);}
//"]"					{return sym(sym.SC);}
//"{"					{return sym(sym.BO);}
//"}"					{return sym(sym.BC);}
//"="					{return sym(sym.EQ);}
//"=="					{return sym(sym.EQEQ);}
//"!="					{return sym(sym.NEQ);}
//"&&"					{return sym(sym.AND);}
//"||"					{return sym(sym.OR);}
//"!"					{return sym(sym.NOT);}
//"|"					{return sym(sym.PIPE);}
//"+"						{return sym(sym.PLUS);}
"-"						{return sym(sym.MINUS);}
//"*"						{return sym(sym.STAR);}
//"/"						{return sym(sym.DIV);}
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



{comment1}					{;}
{comment2}					{;}
\r | \n | \r\n | " " | \t	{;}

.				{ System.out.println("Scanner Error: " + yytext()); }
