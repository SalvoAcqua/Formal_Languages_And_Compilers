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

token1 = X\_(({binarySep}{3}) | ({binarySep}{12}) | ({binarySep}{15}) )

binary = ((101) | (11[01]) | (1[01][01]([01]{1, 3})) | (100[01][01][01][01]) | (1010[01][01][01]) | (10110[01][01]))

binarySep = {binary}((\*)|(\+))


/* TOKEN2 -  101 1010001*/

token2 = Y\_(({word}{sep2}{word}) | ({word}{sep2}{word}{sep2}{word}{sep2}{word}{sep2}{word}))

sep2 = ((\$)|(\#))

word = (x|y|z){6}((x|y|z){2})*

/*TOKEN3*/

token3 = Z\_((2022\/09\/[12][0-9]) | (2022\/09\/30) | (2022\/1[012]\/0[1-9]) | (2022\/1[012]\/[12][0-9]) | (2022\/1[02]\/3[01]) | (2022\/11\/30) | (2023\/0[12]\/0[1-9]) | (2023\/0[12]\/1[0-9]) | (2023\/01\/2[0-9]) | (2023\/02\/2[0-8]) | (2023\/01\/3[01]) | (2023\/03\/0[1-9]) | (2023\/03\/1[0-5]))

//wordBDashed = {sepWB}{wordB}
//wordB =
//sepWB = 

//myDate = ((0[2-9]\/07\/2023) | ([1-2][0-9]\/0[7-9]\/2023) | (3[0-1]\/0[7-8]\/2023) | (0[1-9]\/0[8-9]\/2023) | (30\/09\/2023) | (0[1-6]\/10\/2023) )

//myHour = ((1[0-9]:[0-5][0-9]:[0-5][0-9])    |    (0 (([4-9]:[0-5][0-9]:[0-5][0-9]) | (3:5[2-9]:[0-5][0-9]) | (3:51:5[0-9]) | (3:51:4[789])) )    |     (2 (([0-2]:[0-5][0-9]:[0-5][0-9]) | (3:[0-3][0-9]:[0-5][0-9]) | (3:4[0-4]:[0-5][0-9]) | (3:45:2[0-9]) | (3:45:3[01234])) ))

//binary = ((101) | (11[01]) | (1[01][01][01]) | (1[01][01][01][01]) | (1[01][01][01][01][01]) | (100[01][01][01][01]) | (101000[01]))


sep = "===="

nl = \r | \n | \r\n
comment = "(+-" ~ "-+)"

%%

{sep}					{return sym(sym.SEP);}

{token1}				{return sym(sym.TK1);}
{token2}				{return sym(sym.TK2);}
{token3}				{return sym(sym.TK3);}

"m"				{return sym(sym.M);}
"ELEVATION"				{return sym(sym.ELEVATION);}
"km"					{return sym(sym.KM);}
"TO"					{return sym(sym.TO);}
"ROUTE"					{return sym(sym.ROUTE);}
"kcal/km"				{return sym(sym.KCAL);}

//{idCStyle}			{return sym(sym.ID, new String(yytext()));}

{qstring}				{return sym(sym.QSTRING, new String(yytext()));}
{uint}				{return sym(sym.UINT, new Integer(yytext()));}
{realNumber}			{return sym(sym.REAL, new Double(yytext()));}

//"."					{return sym(sym.DOT);}
","					{return sym(sym.CM);}
";"						{return sym(sym.S);}
":"					{return sym(sym.COL);}
//"("					{return sym(sym.RO);}
//")"					{return sym(sym.RC);}
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
