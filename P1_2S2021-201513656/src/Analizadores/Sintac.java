
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Aug 31 14:38:50 CST 2021
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Aug 31 14:38:50 CST 2021
  */
public class Sintac extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintac() {super();}

  /** Constructor which sets the default scanner. */
  public Sintac(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintac(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\004\000\002\002\006\000\002\002" +
    "\007\000\002\005\004\000\002\005\003\000\002\003\010" +
    "\000\002\003\011\000\002\003\010\000\002\003\012\000" +
    "\002\003\007\000\002\004\011\000\002\004\005\000\002" +
    "\004\002\000\002\006\003\000\002\006\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\004\004\004\001\002\000\004\043\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\004\033\010\001\002\000\016\005\013\006\015\007" +
    "\020\013\016\014\012\034\011\001\002\000\004\002\000" +
    "\001\002\000\004\031\064\001\002\000\004\033\055\001" +
    "\002\000\016\005\013\006\015\007\020\013\016\014\012" +
    "\034\ufffd\001\002\000\004\031\047\001\002\000\004\031" +
    "\042\001\002\000\004\034\041\001\002\000\004\031\021" +
    "\001\002\000\004\032\022\001\002\000\004\033\023\001" +
    "\002\000\016\005\013\006\015\007\020\013\016\014\012" +
    "\034\ufff3\001\002\000\004\034\026\001\002\000\004\034" +
    "\ufff4\001\002\000\020\005\ufff5\006\ufff5\007\ufff5\010\030" +
    "\013\ufff5\014\ufff5\034\ufff5\001\002\000\016\005\ufffb\006" +
    "\ufffb\007\ufffb\013\ufffb\014\ufffb\034\ufffb\001\002\000\006" +
    "\007\032\033\031\001\002\000\004\034\040\001\002\000" +
    "\004\031\033\001\002\000\004\032\034\001\002\000\004" +
    "\033\035\001\002\000\004\034\036\001\002\000\020\005" +
    "\ufff5\006\ufff5\007\ufff5\010\030\013\ufff5\014\ufff5\034\ufff5" +
    "\001\002\000\016\005\ufff7\006\ufff7\007\ufff7\013\ufff7\014" +
    "\ufff7\034\ufff7\001\002\000\016\005\ufff6\006\ufff6\007\ufff6" +
    "\013\ufff6\014\ufff6\034\ufff6\001\002\000\004\002\uffff\001" +
    "\002\000\004\032\043\001\002\000\004\033\044\001\002" +
    "\000\016\005\013\006\015\007\020\013\016\014\012\034" +
    "\ufff3\001\002\000\004\034\046\001\002\000\016\005\ufffc" +
    "\006\ufffc\007\ufffc\013\ufffc\014\ufffc\034\ufffc\001\002\000" +
    "\004\032\050\001\002\000\004\033\051\001\002\000\016" +
    "\005\013\006\015\007\020\013\016\014\012\034\ufff3\001" +
    "\002\000\004\034\053\001\002\000\016\005\ufffa\006\ufffa" +
    "\007\ufffa\013\ufffa\014\ufffa\034\ufffa\001\002\000\004\034" +
    "\ufffe\001\002\000\016\005\013\006\015\007\020\013\016" +
    "\014\012\034\ufff3\001\002\000\004\034\057\001\002\000" +
    "\004\006\060\001\002\000\004\031\061\001\002\000\004" +
    "\032\062\001\002\000\004\037\063\001\002\000\016\005" +
    "\ufff9\006\ufff9\007\ufff9\013\ufff9\014\ufff9\034\ufff9\001\002" +
    "\000\004\032\065\001\002\000\004\033\066\001\002\000" +
    "\004\034\067\001\002\000\016\005\ufff8\006\ufff8\007\ufff8" +
    "\013\ufff8\014\ufff8\034\ufff8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\013\005\016\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\003\013\005\053\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\003\013\005\024\006\023\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\004\026\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\036\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\003\013\005\024\006\044\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\003\013\005\024\006\051\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\003\013\005\024" +
    "\006\055\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintac$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintac$actions(this);
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
    return action_obj.CUP$Sintac$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintac$actions {
  private final Sintac parser;

  /** Constructor */
  CUP$Sintac$actions(Sintac parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintac$do_action(
    int                        CUP$Sintac$act_num,
    java_cup.runtime.lr_parser CUP$Sintac$parser,
    java.util.Stack            CUP$Sintac$stack,
    int                        CUP$Sintac$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintac$result;

      /* select the action based on the action number */
      switch (CUP$Sintac$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // INSTRUCCIONES ::= 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONES",4, ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // INSTRUCCIONES ::= SENTENCIAS 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONES",4, ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // ELSE ::= 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("ELSE",2, ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // ELSE ::= Else LlaveA LlaveC 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("ELSE",2, ((java_cup.runtime.Symbol)CUP$Sintac$stack.elementAt(CUP$Sintac$top-2)), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // ELSE ::= Else If ParenA ParenC LlaveA LlaveC ELSE 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("ELSE",2, ((java_cup.runtime.Symbol)CUP$Sintac$stack.elementAt(CUP$Sintac$top-6)), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= Switch ParenA ParenC LlaveA LlaveC 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintac$stack.elementAt(CUP$Sintac$top-4)), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= Do LlaveA INSTRUCCIONES LlaveC While ParenA ParenC PComa 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintac$stack.elementAt(CUP$Sintac$top-7)), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= While ParenA ParenC LlaveA INSTRUCCIONES LlaveC 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintac$stack.elementAt(CUP$Sintac$top-5)), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= If ParenA ParenC LlaveA INSTRUCCIONES LlaveC ELSE 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintac$stack.elementAt(CUP$Sintac$top-6)), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= For ParenA ParenC LlaveA INSTRUCCIONES LlaveC 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintac$stack.elementAt(CUP$Sintac$top-5)), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIAS ::= SENTENCIA 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("SENTENCIAS",3, ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCIAS ::= SENTENCIA SENTENCIAS 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("SENTENCIAS",3, ((java_cup.runtime.Symbol)CUP$Sintac$stack.elementAt(CUP$Sintac$top-1)), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INI ::= Clase Identificador LlaveA SENTENCIAS LlaveC 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("INI",0, ((java_cup.runtime.Symbol)CUP$Sintac$stack.elementAt(CUP$Sintac$top-4)), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INI ::= Clase Identificador LlaveA LlaveC 
            {
              Object RESULT =null;

              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("INI",0, ((java_cup.runtime.Symbol)CUP$Sintac$stack.elementAt(CUP$Sintac$top-3)), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          return CUP$Sintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INI EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintac$stack.elementAt(CUP$Sintac$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintac$stack.elementAt(CUP$Sintac$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintac$stack.elementAt(CUP$Sintac$top-1)).value;
		RESULT = start_val;
              CUP$Sintac$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintac$stack.elementAt(CUP$Sintac$top-1)), ((java_cup.runtime.Symbol)CUP$Sintac$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintac$parser.done_parsing();
          return CUP$Sintac$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

