
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int AND = 14;
  public static final int OR = 15;
  public static final int CM = 10;
  public static final int THEN = 12;
  public static final int RO = 17;
  public static final int S = 6;
  public static final int NOT = 16;
  public static final int END = 9;
  public static final int FI = 13;
  public static final int IF = 11;
  public static final int RC = 18;
  public static final int EOF = 0;
  public static final int SEP = 2;
  public static final int PRINT = 21;
  public static final int DOT = 20;
  public static final int error = 1;
  public static final int UINT = 23;
  public static final int QSTRING = 22;
  public static final int START = 8;
  public static final int EQEQ = 19;
  public static final int TK3 = 5;
  public static final int TK2 = 4;
  public static final int TK1 = 3;
  public static final int HOUSE = 7;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "SEP",
  "TK1",
  "TK2",
  "TK3",
  "S",
  "HOUSE",
  "START",
  "END",
  "CM",
  "IF",
  "THEN",
  "FI",
  "AND",
  "OR",
  "NOT",
  "RO",
  "RC",
  "EQEQ",
  "DOT",
  "PRINT",
  "QSTRING",
  "UINT"
  };
public String[] TT;
	public sym(){
		TT = new String[100];
		TT[14]=new String("AND");
		TT[15]=new String("OR");
		TT[10]=new String("CM");
		TT[12]=new String("THEN");
		TT[17]=new String("RO");
		TT[6]=new String("S");
		TT[16]=new String("NOT");
		TT[9]=new String("END");
		TT[13]=new String("FI");
		TT[11]=new String("IF");
		TT[18]=new String("RC");
		TT[0]=new String("EOF");
		TT[2]=new String("SEP");
		TT[21]=new String("PRINT");
		TT[20]=new String("DOT");
		TT[1]=new String("error");
		TT[23]=new String("UINT");
		TT[22]=new String("QSTRING");
		TT[8]=new String("START");
		TT[19]=new String("EQEQ");
		TT[5]=new String("TK3");
		TT[4]=new String("TK2");
		TT[3]=new String("TK1");
		TT[7]=new String("HOUSE");
	}
public String getTT(int i){return TT[i];}
}

