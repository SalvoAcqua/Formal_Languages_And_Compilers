
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int BC = 13;
  public static final int PLUS = 16;
  public static final int STAR = 18;
  public static final int S = 9;
  public static final int RO = 14;
  public static final int END = 7;
  public static final int ID = 20;
  public static final int WITH = 6;
  public static final int RC = 15;
  public static final int uminus = 11;
  public static final int COMPARE = 5;
  public static final int EOF = 0;
  public static final int DIV = 19;
  public static final int MINUS = 17;
  public static final int SEP = 2;
  public static final int PRINT = 8;
  public static final int error = 1;
  public static final int EQ = 10;
  public static final int BO = 12;
  public static final int UINT = 21;
  public static final int TK2 = 4;
  public static final int TK1 = 3;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "SEP",
  "TK1",
  "TK2",
  "COMPARE",
  "WITH",
  "END",
  "PRINT",
  "S",
  "EQ",
  "uminus",
  "BO",
  "BC",
  "RO",
  "RC",
  "PLUS",
  "MINUS",
  "STAR",
  "DIV",
  "ID",
  "UINT"
  };
public String[] TT;
	public sym(){
		TT = new String[100];
		TT[13]=new String("BC");
		TT[16]=new String("PLUS");
		TT[18]=new String("STAR");
		TT[9]=new String("S");
		TT[14]=new String("RO");
		TT[7]=new String("END");
		TT[20]=new String("ID");
		TT[6]=new String("WITH");
		TT[15]=new String("RC");
		TT[11]=new String("uminus");
		TT[5]=new String("COMPARE");
		TT[0]=new String("EOF");
		TT[19]=new String("DIV");
		TT[17]=new String("MINUS");
		TT[2]=new String("SEP");
		TT[8]=new String("PRINT");
		TT[1]=new String("error");
		TT[10]=new String("EQ");
		TT[12]=new String("BO");
		TT[21]=new String("UINT");
		TT[4]=new String("TK2");
		TT[3]=new String("TK1");
	}
public String getTT(int i){return TT[i];}
}
