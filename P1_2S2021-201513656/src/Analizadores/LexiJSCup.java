/* The following code was generated by JFlex 1.4.3 on 31/08/21 15:05 */

package Analizadores;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 31/08/21 15:05 from the specification file
 * <tt>src/Analizadores/LexiJSCup.flex</tt>
 */
class LexiJSCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  9,  7,  0,  0,  9,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     9, 32,  4,  0,  0, 35, 31,  8, 38, 39,  6, 33, 44, 34,  3,  5, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 43, 42, 37, 36, 37,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0,  0,  1, 
     0, 12, 26, 10, 14, 19, 20, 30, 17, 18,  1, 27, 11, 25, 24, 15, 
     1, 28, 22, 13, 23, 29, 21, 16,  1,  1,  1, 40,  9, 41,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\2\5\1\1"+
    "\1\6\14\2\1\1\1\7\2\5\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\2\0\1\21"+
    "\1\22\2\0\7\2\1\23\2\2\1\24\7\2\1\7"+
    "\1\11\1\25\1\3\1\0\5\2\1\26\1\27\5\2"+
    "\1\30\3\2\1\22\1\2\1\31\5\2\1\32\1\2"+
    "\1\33\1\2\1\34\4\2\1\35\1\2\1\36\2\2"+
    "\1\37\2\2\1\40\1\2\1\41\1\42\1\43";

  private static int [] zzUnpackAction() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\132\0\207\0\55\0\264\0\341\0\55"+
    "\0\u010e\0\u013b\0\u0168\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249"+
    "\0\u0276\0\u02a3\0\u02d0\0\u02fd\0\u032a\0\u0357\0\u0384\0\u03b1"+
    "\0\u03de\0\u040b\0\u03b1\0\u03b1\0\55\0\55\0\55\0\55"+
    "\0\55\0\55\0\55\0\u0438\0\264\0\55\0\u0465\0\u0492"+
    "\0\u04bf\0\u04ec\0\u0519\0\u0546\0\u0573\0\u05a0\0\u05cd\0\u05fa"+
    "\0\132\0\u0627\0\u0654\0\132\0\u0681\0\u06ae\0\u06db\0\u0708"+
    "\0\u0735\0\u0762\0\u078f\0\55\0\55\0\55\0\u0438\0\u07bc"+
    "\0\55\0\u07e9\0\u0816\0\u0843\0\u0870\0\132\0\132\0\u089d"+
    "\0\u08ca\0\u08f7\0\u0924\0\u0951\0\132\0\u097e\0\u09ab\0\u09d8"+
    "\0\u0492\0\u0a05\0\132\0\u0a32\0\u0a5f\0\u0a8c\0\u0ab9\0\u0ae6"+
    "\0\132\0\u0b13\0\132\0\u0b40\0\132\0\u0b6d\0\u0b9a\0\u0bc7"+
    "\0\u0bf4\0\132\0\u0c21\0\132\0\u0c4e\0\u0c7b\0\132\0\u0ca8"+
    "\0\u0cd5\0\132\0\u0d02\0\132\0\132\0\u0d02";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\2"+
    "\1\11\1\12\1\13\1\14\1\3\1\15\1\16\1\3"+
    "\1\17\1\3\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\2\3\1\26\4\3\1\27\1\30\1\31\1\32\1\10"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\56\0\2\3\7\0\25\3\20\0\1\4\1\44"+
    "\51\0\4\45\1\46\50\45\5\0\1\47\1\50\46\0"+
    "\7\51\1\0\45\51\11\0\1\12\44\0\2\3\7\0"+
    "\1\3\1\52\1\53\2\3\1\54\17\3\17\0\2\3"+
    "\7\0\1\3\1\55\3\3\1\56\3\3\1\57\13\3"+
    "\17\0\2\3\7\0\6\3\1\60\16\3\17\0\2\3"+
    "\7\0\5\3\1\61\3\3\1\62\13\3\17\0\2\3"+
    "\7\0\7\3\1\63\15\3\17\0\2\3\7\0\12\3"+
    "\1\64\12\3\17\0\2\3\7\0\1\3\1\65\23\3"+
    "\17\0\2\3\7\0\2\3\1\66\2\3\1\67\17\3"+
    "\17\0\2\3\7\0\2\3\1\70\22\3\17\0\2\3"+
    "\7\0\11\3\1\71\13\3\17\0\2\3\7\0\14\3"+
    "\1\72\10\3\17\0\2\3\7\0\14\3\1\73\10\3"+
    "\55\0\1\74\61\0\1\75\51\0\1\76\55\0\1\76"+
    "\14\0\1\77\52\0\7\47\1\0\45\47\6\50\1\100"+
    "\46\50\10\0\1\101\45\0\2\3\7\0\2\3\1\102"+
    "\22\3\17\0\2\3\7\0\3\3\1\103\21\3\17\0"+
    "\2\3\7\0\16\3\1\104\6\3\17\0\2\3\7\0"+
    "\2\3\1\105\22\3\17\0\2\3\7\0\24\3\1\106"+
    "\17\0\2\3\7\0\15\3\1\107\7\3\17\0\2\3"+
    "\7\0\10\3\1\110\14\3\17\0\2\3\7\0\12\3"+
    "\1\111\12\3\17\0\2\3\7\0\10\3\1\112\14\3"+
    "\17\0\2\3\7\0\3\3\1\113\21\3\17\0\2\3"+
    "\7\0\1\3\1\114\23\3\17\0\2\3\7\0\14\3"+
    "\1\115\10\3\17\0\2\3\7\0\14\3\1\107\10\3"+
    "\17\0\2\3\7\0\22\3\1\116\2\3\17\0\2\3"+
    "\7\0\23\3\1\117\1\3\17\0\2\3\7\0\11\3"+
    "\1\120\13\3\16\0\5\50\1\121\1\100\46\50\1\0"+
    "\2\3\7\0\3\3\1\122\21\3\17\0\2\3\7\0"+
    "\11\3\1\123\13\3\17\0\2\3\7\0\3\3\1\124"+
    "\21\3\17\0\2\3\7\0\17\3\1\125\5\3\17\0"+
    "\2\3\7\0\15\3\1\126\7\3\17\0\2\3\7\0"+
    "\2\3\1\127\22\3\17\0\2\3\7\0\1\3\1\130"+
    "\23\3\17\0\2\3\7\0\11\3\1\131\13\3\17\0"+
    "\2\3\7\0\3\3\1\117\21\3\17\0\2\3\7\0"+
    "\23\3\1\132\1\3\17\0\2\3\7\0\11\3\1\133"+
    "\13\3\17\0\2\3\7\0\2\3\1\134\22\3\17\0"+
    "\2\3\7\0\3\3\1\135\21\3\17\0\2\3\7\0"+
    "\5\3\1\136\7\3\1\107\7\3\17\0\2\3\7\0"+
    "\2\3\1\137\22\3\17\0\2\3\7\0\1\140\24\3"+
    "\17\0\2\3\7\0\23\3\1\141\1\3\17\0\2\3"+
    "\7\0\11\3\1\142\13\3\17\0\2\3\7\0\10\3"+
    "\1\143\14\3\17\0\2\3\7\0\21\3\1\144\3\3"+
    "\17\0\2\3\7\0\1\3\1\145\23\3\17\0\2\3"+
    "\7\0\4\3\1\146\20\3\17\0\2\3\7\0\7\3"+
    "\1\147\15\3\17\0\2\3\7\0\1\3\1\150\23\3"+
    "\17\0\2\3\7\0\14\3\1\151\10\3\17\0\2\3"+
    "\7\0\11\3\1\152\13\3\17\0\2\3\7\0\2\3"+
    "\1\153\22\3\17\0\2\3\7\0\15\3\1\154\7\3"+
    "\17\0\2\3\7\0\11\3\1\155\13\3\17\0\1\3"+
    "\1\156\7\0\25\3\16\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3375];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\2\1\1\11\24\1\7\11"+
    "\2\0\1\11\1\1\2\0\22\1\3\11\1\1\1\0"+
    "\1\11\55\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexiJSCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexiJSCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 33: 
          { return new Symbol(sym.Default, yycolumn, yyline, yytext());
          }
        case 36: break;
        case 27: 
          { return new Symbol(sym.Bool, yycolumn, yyline, yytext());
          }
        case 37: break;
        case 19: 
          { return new Symbol(sym.Do, yycolumn, yyline, yytext());
          }
        case 38: break;
        case 9: 
          { return new Symbol(sym.Relacionales, yycolumn, yyline, yytext());
          }
        case 39: break;
        case 16: 
          { return new Symbol(sym.Coma, yycolumn, yyline, yytext());
          }
        case 40: break;
        case 10: 
          { return new Symbol(sym.ParenA, yycolumn, yyline, yytext());
          }
        case 41: break;
        case 24: 
          { return new Symbol(sym.For, yycolumn, yyline, yytext());
          }
        case 42: break;
        case 29: 
          { return new Symbol(sym.While, yycolumn, yyline, yytext());
          }
        case 43: break;
        case 18: 
          { /* Comentario */
          }
        case 44: break;
        case 22: 
          { return new Symbol(sym.Log, yycolumn, yyline, yytext());
          }
        case 45: break;
        case 13: 
          { return new Symbol(sym.LlaveC, yycolumn, yyline, yytext());
          }
        case 46: break;
        case 34: 
          { return new Symbol(sym.Require, yycolumn, yyline, yytext());
          }
        case 47: break;
        case 23: 
          { return new Symbol(sym.Variable, yycolumn, yyline, yytext());
          }
        case 48: break;
        case 17: 
          { return new Symbol(sym.Cadena, yycolumn, yyline, yytext());
          }
        case 49: break;
        case 14: 
          { return new Symbol(sym.PComa, yycolumn, yyline, yytext());
          }
        case 50: break;
        case 25: 
          { return new Symbol(sym.Case, yycolumn, yyline, yytext());
          }
        case 51: break;
        case 28: 
          { return new Symbol(sym.Clase, yycolumn, yyline, yytext());
          }
        case 52: break;
        case 4: 
          { return new Symbol(sym.Punto, yycolumn, yyline, yytext());
          }
        case 53: break;
        case 7: 
          { return new Symbol(sym.Logico, yycolumn, yyline, yytext());
          }
        case 54: break;
        case 32: 
          { return new Symbol(sym.Console, yycolumn, yyline, yytext());
          }
        case 55: break;
        case 3: 
          { return new Symbol(sym.Numero, yycolumn, yyline, yytext());
          }
        case 56: break;
        case 31: 
          { return new Symbol(sym.Switch, yycolumn, yyline, yytext());
          }
        case 57: break;
        case 20: 
          { return new Symbol(sym.If, yycolumn, yyline, yytext());
          }
        case 58: break;
        case 2: 
          { return new Symbol(sym.Identificador, yycolumn, yyline, yytext());
          }
        case 59: break;
        case 12: 
          { return new Symbol(sym.LlaveA, yycolumn, yyline, yytext());
          }
        case 60: break;
        case 11: 
          { return new Symbol(sym.ParenC, yycolumn, yyline, yytext());
          }
        case 61: break;
        case 26: 
          { return new Symbol(sym.Else, yycolumn, yyline, yytext());
          }
        case 62: break;
        case 5: 
          { return new Symbol(sym.Matematico, yycolumn, yyline, yytext());
          }
        case 63: break;
        case 21: 
          { return new Symbol(sym.Incremento, yycolumn, yyline, yytext());
          }
        case 64: break;
        case 15: 
          { return new Symbol(sym.DPuntos, yycolumn, yyline, yytext());
          }
        case 65: break;
        case 6: 
          { /*Ignore*/
          }
        case 66: break;
        case 35: 
          { return new Symbol(sym.Llamada, yycolumn, yyline, yytext());
          }
        case 67: break;
        case 8: 
          { return new Symbol(sym.Igual, yycolumn, yyline, yytext());
          }
        case 68: break;
        case 30: 
          { return new Symbol(sym.Break, yycolumn, yyline, yytext());
          }
        case 69: break;
        case 1: 
          { 
          }
        case 70: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
