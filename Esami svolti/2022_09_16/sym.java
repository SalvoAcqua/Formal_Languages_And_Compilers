
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int CM = 7;
  public static final int S = 2;
  public static final int COL = 10;
  public static final int M = 12;
  public static final int ROUTE = 13;
  public static final int EOF = 0;
  public static final int SEP = 3;
  public static final int error = 1;
  public static final int KCAL = 14;
  public static final int UINT = 16;
  public static final int QSTRING = 15;
  public static final int ELEVATION = 11;
  public static final int REAL = 17;
  public static final int KM = 8;
  public static final int TK3 = 6;
  public static final int TO = 9;
  public static final int TK2 = 5;
  public static final int TK1 = 4;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "S",
  "SEP",
  "TK1",
  "TK2",
  "TK3",
  "CM",
  "KM",
  "TO",
  "COL",
  "ELEVATION",
  "M",
  "ROUTE",
  "KCAL",
  "QSTRING",
  "UINT",
  "REAL"
  };
public String[] TT;
	public sym(){
		TT = new String[100];
		TT[7]=new String("CM");
		TT[2]=new String("S");
		TT[10]=new String("COL");
		TT[12]=new String("M");
		TT[13]=new String("ROUTE");
		TT[0]=new String("EOF");
		TT[3]=new String("SEP");
		TT[1]=new String("error");
		TT[14]=new String("KCAL");
		TT[16]=new String("UINT");
		TT[15]=new String("QSTRING");
		TT[11]=new String("ELEVATION");
		TT[17]=new String("REAL");
		TT[8]=new String("KM");
		TT[6]=new String("TK3");
		TT[9]=new String("TO");
		TT[5]=new String("TK2");
		TT[4]=new String("TK1");
	}
public String getTT(int i){return TT[i];}
}

