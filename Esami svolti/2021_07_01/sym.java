
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int TK1 = 7;
  public static final int BC = 6;
  public static final int EUROKG = 9;
  public static final int CM = 4;
  public static final int S = 3;
  public static final int EOF = 0;
  public static final int EURO = 10;
  public static final int SEP = 2;
  public static final int BO = 5;
  public static final int REAL = 15;
  public static final int error = 1;
  public static final int COL = 11;
  public static final int KG = 12;
  public static final int UINT = 14;
  public static final int NAME = 13;
  public static final int TK2 = 8;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "SEP",
  "S",
  "CM",
  "BO",
  "BC",
  "TK1",
  "TK2",
  "EUROKG",
  "EURO",
  "COL",
  "KG",
  "NAME",
  "UINT",
  "REAL"
  };
public String[] TT;
	public sym(){
		TT = new String[100];
		TT[7]=new String("TK1");
		TT[6]=new String("BC");
		TT[9]=new String("EUROKG");
		TT[4]=new String("CM");
		TT[3]=new String("S");
		TT[0]=new String("EOF");
		TT[10]=new String("EURO");
		TT[2]=new String("SEP");
		TT[5]=new String("BO");
		TT[15]=new String("REAL");
		TT[1]=new String("error");
		TT[11]=new String("COL");
		TT[12]=new String("KG");
		TT[14]=new String("UINT");
		TT[13]=new String("NAME");
		TT[8]=new String("TK2");
	}
public String getTT(int i){return TT[i];}
}

