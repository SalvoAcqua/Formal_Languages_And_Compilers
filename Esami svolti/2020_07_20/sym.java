
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int BC = 14;
  public static final int PLUS = 7;
  public static final int STAR = 9;
  public static final int S = 5;
  public static final int RO = 11;
  public static final int END = 19;
  public static final int WITH = 18;
  public static final int ID = 16;
  public static final int RC = 12;
  public static final int uminus = 15;
  public static final int COMPARE = 17;
  public static final int EOF = 0;
  public static final int DIV = 10;
  public static final int SEP = 2;
  public static final int MINUS = 8;
  public static final int PRINT = 20;
  public static final int error = 1;
  public static final int EQ = 6;
  public static final int BO = 13;
  public static final int UINT = 21;
  public static final int TK2 = 4;
  public static final int TK1 = 3;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "SEP",
  "TK1",
  "TK2",
  "S",
  "EQ",
  "PLUS",
  "MINUS",
  "STAR",
  "DIV",
  "RO",
  "RC",
  "BO",
  "BC",
  "uminus",
  "ID",
  "COMPARE",
  "WITH",
  "END",
  "PRINT",
  "UINT"
  };
public String[] TT;
	public sym(){
		TT = new String[100];
		TT[14]=new String("BC");
		TT[7]=new String("PLUS");
		TT[9]=new String("STAR");
		TT[5]=new String("S");
		TT[11]=new String("RO");
		TT[19]=new String("END");
		TT[18]=new String("WITH");
		TT[16]=new String("ID");
		TT[12]=new String("RC");
		TT[15]=new String("uminus");
		TT[17]=new String("COMPARE");
		TT[0]=new String("EOF");
		TT[10]=new String("DIV");
		TT[2]=new String("SEP");
		TT[8]=new String("MINUS");
		TT[20]=new String("PRINT");
		TT[1]=new String("error");
		TT[6]=new String("EQ");
		TT[13]=new String("BO");
		TT[21]=new String("UINT");
		TT[4]=new String("TK2");
		TT[3]=new String("TK1");
	}
public String getTT(int i){return TT[i];}
}

