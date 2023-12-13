
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;
import java.io.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b beta 20140226 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\004\000\002\002\007\000\002\003" +
    "\003\000\002\003\003\000\002\004\011\000\002\004\025" +
    "\000\002\004\027\000\002\006\007\000\002\006\010\000" +
    "\002\005\005\000\002\005\010\000\002\007\005\000\002" +
    "\007\005\000\002\007\002\000\002\010\003\000\002\011" +
    "\005\000\002\011\005\000\002\012\006\000\002\016\010" +
    "\000\002\016\006\000\002\013\003\000\002\017\002\000" +
    "\002\014\012\000\002\020\002\000\002\014\011\000\002" +
    "\015\006\000\002\015\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\132\000\006\006\005\007\004\001\002\000\004\004" +
    "\124\001\002\000\004\004\117\001\002\000\004\002\116" +
    "\001\002\000\004\005\ufffe\001\002\000\004\005\uffff\001" +
    "\002\000\006\006\067\007\066\001\002\000\004\005\013" +
    "\001\002\000\004\015\017\001\002\000\004\015\017\001" +
    "\002\000\004\005\036\001\002\000\006\005\ufff3\015\017" +
    "\001\002\000\004\011\020\001\002\000\004\016\021\001" +
    "\002\000\004\015\031\001\002\000\006\004\024\012\023" +
    "\001\002\000\004\016\025\001\002\000\006\005\ufff0\015" +
    "\ufff0\001\002\000\004\015\026\001\002\000\004\017\027" +
    "\001\002\000\004\013\030\001\002\000\006\004\uffef\012" +
    "\uffef\001\002\000\004\017\032\001\002\000\004\013\033" +
    "\001\002\000\006\004\uffee\012\uffee\001\002\000\004\015" +
    "\017\001\002\000\006\005\ufff2\015\ufff2\001\002\000\004" +
    "\015\041\001\002\000\004\002\000\001\002\000\006\002" +
    "\uffed\015\055\001\002\000\004\016\uffea\001\002\000\004" +
    "\016\043\001\002\000\004\014\044\001\002\000\004\011" +
    "\045\001\002\000\004\015\047\001\002\000\006\004\052" +
    "\012\051\001\002\000\004\016\050\001\002\000\006\004" +
    "\uffe7\012\uffe7\001\002\000\004\015\053\001\002\000\006" +
    "\002\uffe9\015\uffe9\001\002\000\004\016\054\001\002\000" +
    "\006\004\uffe8\012\uffe8\001\002\000\004\016\uffec\001\002" +
    "\000\004\016\057\001\002\000\004\014\060\001\002\000" +
    "\004\011\061\001\002\000\004\015\047\001\002\000\006" +
    "\004\063\012\051\001\002\000\006\002\uffeb\015\uffeb\001" +
    "\002\000\004\015\017\001\002\000\006\005\ufff1\015\ufff1" +
    "\001\002\000\004\004\073\001\002\000\004\004\070\001" +
    "\002\000\004\006\071\001\002\000\004\004\072\001\002" +
    "\000\006\006\ufffa\007\ufffa\001\002\000\004\007\074\001" +
    "\002\000\004\004\075\001\002\000\004\007\076\001\002" +
    "\000\004\004\077\001\002\000\006\005\ufffd\007\100\001" +
    "\002\000\004\004\101\001\002\000\004\007\102\001\002" +
    "\000\004\004\103\001\002\000\004\007\104\001\002\000" +
    "\004\004\105\001\002\000\004\007\106\001\002\000\004" +
    "\004\107\001\002\000\004\007\110\001\002\000\004\004" +
    "\111\001\002\000\004\007\112\001\002\000\004\004\113" +
    "\001\002\000\006\005\ufffc\007\114\001\002\000\004\004" +
    "\115\001\002\000\004\005\ufffb\001\002\000\004\002\001" +
    "\001\002\000\004\006\120\001\002\000\004\004\121\001" +
    "\002\000\004\006\122\001\002\000\004\004\123\001\002" +
    "\000\006\006\ufff9\007\ufff9\001\002\000\012\005\ufff4\006" +
    "\ufff4\007\ufff4\010\ufff4\001\002\000\012\005\ufff8\006\130" +
    "\007\127\010\126\001\002\000\004\004\134\001\002\000" +
    "\004\004\132\001\002\000\004\004\131\001\002\000\012" +
    "\005\ufff6\006\ufff6\007\ufff6\010\ufff6\001\002\000\010\005" +
    "\ufff4\006\ufff4\010\ufff4\001\002\000\010\005\ufff7\006\130" +
    "\010\126\001\002\000\012\005\ufff5\006\ufff5\007\ufff5\010" +
    "\ufff5\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\132\000\014\002\005\003\011\004\007\005\006\006" +
    "\010\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\010\014\011\015\012\013" +
    "\001\001\000\004\012\063\001\001\000\002\001\001\000" +
    "\004\012\033\001\001\000\002\001\001\000\004\016\021" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\012\034\001\001" +
    "\000\002\001\001\000\006\013\036\014\037\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\020\041\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\015\045\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\017\055\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\015\061\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\012\064\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\007\124\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\007\132\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

    table = new HashMap<String, HashMap<String, Double>>();

 Tree = new DisegnaAlbero();   }public static DisegnaAlbero Tree;

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 Symbol s=_scanner.next_token(); Tree.push(s.toString(), 0); return s;   }



    public HashMap<String, HashMap<String, Double>> table;
    
    public void report_error(String message, Object info) {
        StringBuffer m = new StringBuffer(message);
        if (info instanceof Symbol) {
            if (((Symbol)info).left != 1 && ((Symbol)info).right != 1) {
                if (((Symbol)info).left != -1 && ((Symbol)info).right != -1) {
                    int line = (((Symbol)info).left) + 1;
                    int column = (((Symbol)info).right) + 1;
                    m.append(" (line " + line + " column " + column + ")");
                }
            }
            System.err.println(m);
        }
    }
    
    public Object stack(int position) {
        return (((Symbol)stack.elementAt(tos + position)).value);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


    class MyObj {
        public Double tot;
        public Integer nProd;

        MyObj(Double tot, Integer nProd){
            this.tot = tot;
            this.nProd = nProd;
        }
    };

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= prog EOF 
            { 
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // prog ::= header SEP dressSec SEP shoppingSec 
            { parser.Tree.reduce(5,"prog",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // header ::= header1 
            { parser.Tree.reduce(1,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // header ::= header2 
            { parser.Tree.reduce(1,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // header1 ::= TK1l TK2 S TK2 S TK2 S 
            { parser.Tree.reduce(7,"header1",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header1",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // header1 ::= TK1l TK2 S TK2 S TK2 S TK2 S TK2 S TK2 S TK2 S TK2 S TK2 S 
            { parser.Tree.reduce(19,"header1",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header1",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-18)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // header1 ::= TK1l TK2 S TK2 S TK2 S TK2 S TK2 S TK2 S TK2 S TK2 S TK2 S TK2 S 
            { parser.Tree.reduce(21,"header1",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header1",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-20)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // TK1l ::= TK1l TK1 S TK1 S 
            { parser.Tree.reduce(5,"TK1l",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TK1l",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // TK1l ::= TK1 S TK1 S TK1 S 
            { parser.Tree.reduce(6,"TK1l",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TK1l",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // header2 ::= TK2 S TK13l 
            { parser.Tree.reduce(3,"header2",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header2",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // header2 ::= TK2 S TK13l TK2 S TK13l 
            { parser.Tree.reduce(6,"header2",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header2",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TK13l ::= TK13l TK1 S 
            { parser.Tree.reduce(3,"TK13l",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TK13l",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // TK13l ::= TK13l TK3 S 
            { parser.Tree.reduce(3,"TK13l",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TK13l",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // TK13l ::= 
            { parser.Tree.reduce(0,"TK13l",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TK13l",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // dressSec ::= clothesL 
            { parser.Tree.reduce(1,"dressSec",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dressSec",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // clothesL ::= clothesL dress dress 
            { parser.Tree.reduce(3,"clothesL",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("clothesL",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // clothesL ::= dress dress dress 
            { parser.Tree.reduce(3,"clothesL",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("clothesL",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // dress ::= QSTRING MINUS prodL S 
            { parser.Tree.reduce(4,"dress",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int innerleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int innerright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		HashMap inner = (HashMap)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 parser.table.put(x, inner); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("dress",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // prodL ::= prodL CM UINT QSTRING REAL EURO 
            { parser.Tree.reduce(6,"prodL",0);
              HashMap RESULT =null;
		int innerleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int innerright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		HashMap inner = (HashMap)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double y = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 
                                            inner.put(x,y);
                                            RESULT = inner;
                                        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("prodL",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // prodL ::= UINT QSTRING REAL EURO 
            { parser.Tree.reduce(4,"prodL",0);
              HashMap RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double y = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 
                                HashMap inner = new HashMap<String,Double>();
                                inner.put(x,y);
                                RESULT = inner;
                            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("prodL",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // shoppingSec ::= purchList 
            { parser.Tree.reduce(1,"shoppingSec",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("shoppingSec",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // NT$0 ::= 
            { parser.Tree.reduce(0,"NT$0",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 System.out.println(x); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // purchList ::= purchList QSTRING NT$0 UINT PERC MINUS purchProdL S 
            { parser.Tree.reduce(8,"purchList",0);
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int objleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int objright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		MyObj obj = (MyObj)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		System.out.println("TOTAL: " + obj.tot + " euro N_PROD: " + obj.nProd); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("purchList",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // NT$1 ::= 
            { parser.Tree.reduce(0,"NT$1",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 System.out.println(x); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // purchList ::= QSTRING NT$1 UINT PERC MINUS purchProdL S 
            { parser.Tree.reduce(7,"purchList",0);
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int objleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int objright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		MyObj obj = (MyObj)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		System.out.println("TOTAL: " + obj.tot + " euro N_PROD: " + obj.nProd); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("purchList",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // purchProdL ::= purchProdL CM QSTRING UINT 
            { parser.Tree.reduce(4,"purchProdL",0);
              MyObj RESULT =null;
		int objleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int objright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		MyObj obj = (MyObj)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer y = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                                                Double res = y*parser.table.get((String)parser.stack(-8)).get(x)*(Integer)parser.stack(-6)/100;
                                                System.out.println(x + " " + res + " euro");
                                                obj.tot += res;
                                                obj.nProd += y;
                                                RESULT = obj;
                                             
              CUP$parser$result = parser.getSymbolFactory().newSymbol("purchProdL",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // purchProdL ::= QSTRING UINT 
            { parser.Tree.reduce(2,"purchProdL",0);
              MyObj RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer y = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        Double res = y*parser.table.get((String)parser.stack(-6)).get(x)*(Integer)parser.stack(-4)/100;
                        System.out.println(x + " " + res + " euro");
                        RESULT = new MyObj(res, y);
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("purchProdL",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}