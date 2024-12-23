/* The following code was generated by JFlex 1.4.3 on 12/09/21 19:16 */

package Analizadores;
import static Analizadores.Tokenjs.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/09/21 19:16 from the specification file
 * <tt>src/Analizadores/LexiJS.flex</tt>
 */
class LexiJS {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\11\1\7\2\0\1\11\22\0\1\11\1\51\1\4\2\0"+
    "\1\42\1\47\1\10\1\43\1\44\1\6\1\40\1\55\1\41\1\3"+
    "\1\5\12\2\1\56\1\54\1\53\1\37\1\52\2\0\32\1\4\0"+
    "\1\1\1\0\1\14\1\32\1\12\1\16\1\23\1\24\1\36\1\21"+
    "\1\22\1\1\1\33\1\13\1\31\1\30\1\17\1\1\1\34\1\26"+
    "\1\15\1\27\1\35\1\25\1\20\3\1\1\45\1\50\1\46\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\5\1\6"+
    "\1\7\1\1\1\10\14\2\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\2\1\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\2\0\1\27\1\30\2\0\7\2"+
    "\1\31\2\2\1\32\7\2\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\3\1\0\1\43\4\2"+
    "\1\44\1\45\5\2\1\46\3\2\1\47\1\2\1\50"+
    "\5\2\1\51\2\2\1\52\1\2\1\53\4\2\1\54"+
    "\1\55\1\2\1\56\2\2\1\57\2\2\1\60\1\2"+
    "\1\61\1\62\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[121];
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
    "\0\0\0\57\0\136\0\215\0\57\0\274\0\353\0\57"+
    "\0\57\0\u011a\0\u0149\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234"+
    "\0\u0263\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac"+
    "\0\u03db\0\u040a\0\57\0\57\0\57\0\57\0\57\0\u0439"+
    "\0\u0468\0\u0497\0\u04c6\0\u04f5\0\57\0\57\0\57\0\u0524"+
    "\0\274\0\57\0\u0553\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e"+
    "\0\u066d\0\u069c\0\u06cb\0\u06fa\0\136\0\u0729\0\u0758\0\136"+
    "\0\u0787\0\u07b6\0\u07e5\0\u0814\0\u0843\0\u0872\0\u08a1\0\57"+
    "\0\57\0\57\0\57\0\57\0\57\0\57\0\57\0\u0524"+
    "\0\u08d0\0\57\0\u08ff\0\u092e\0\u095d\0\u098c\0\136\0\136"+
    "\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\136\0\u0aa6\0\u0ad5"+
    "\0\u0b04\0\u0582\0\u0b33\0\136\0\u0b62\0\u0b91\0\u0bc0\0\u0bef"+
    "\0\u0c1e\0\136\0\u0c4d\0\u0c7c\0\136\0\u0cab\0\136\0\u0cda"+
    "\0\u0d09\0\u0d38\0\u0d67\0\136\0\136\0\u0d96\0\136\0\u0dc5"+
    "\0\u0df4\0\136\0\u0e23\0\u0e52\0\136\0\u0e81\0\136\0\136"+
    "\0\u0e81";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[121];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\3\1\16\1\17\1\3"+
    "\1\20\1\3\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\2\3\1\27\4\3\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\60\0\2\3\7\0\25\3\22\0"+
    "\1\4\1\50\53\0\4\51\1\52\52\51\5\0\1\53"+
    "\1\54\50\0\7\55\1\0\47\55\11\0\1\13\46\0"+
    "\2\3\7\0\1\3\1\56\1\57\2\3\1\60\17\3"+
    "\21\0\2\3\7\0\1\3\1\61\3\3\1\62\3\3"+
    "\1\63\13\3\21\0\2\3\7\0\6\3\1\64\16\3"+
    "\21\0\2\3\7\0\5\3\1\65\3\3\1\66\13\3"+
    "\21\0\2\3\7\0\7\3\1\67\15\3\21\0\2\3"+
    "\7\0\12\3\1\70\12\3\21\0\2\3\7\0\1\3"+
    "\1\71\23\3\21\0\2\3\7\0\2\3\1\72\2\3"+
    "\1\73\17\3\21\0\2\3\7\0\2\3\1\74\22\3"+
    "\21\0\2\3\7\0\11\3\1\75\13\3\21\0\2\3"+
    "\7\0\14\3\1\76\10\3\21\0\2\3\7\0\14\3"+
    "\1\77\10\3\57\0\1\100\57\0\1\101\57\0\1\102"+
    "\64\0\1\103\57\0\1\104\45\0\1\105\56\0\1\106"+
    "\56\0\1\107\21\0\1\110\54\0\7\53\1\0\47\53"+
    "\6\54\1\111\50\54\10\0\1\112\47\0\2\3\7\0"+
    "\2\3\1\113\22\3\21\0\2\3\7\0\3\3\1\114"+
    "\21\3\21\0\2\3\7\0\16\3\1\115\6\3\21\0"+
    "\2\3\7\0\2\3\1\116\22\3\21\0\2\3\7\0"+
    "\24\3\1\117\21\0\2\3\7\0\15\3\1\120\7\3"+
    "\21\0\2\3\7\0\10\3\1\121\14\3\21\0\2\3"+
    "\7\0\12\3\1\122\12\3\21\0\2\3\7\0\10\3"+
    "\1\123\14\3\21\0\2\3\7\0\3\3\1\124\21\3"+
    "\21\0\2\3\7\0\1\3\1\125\23\3\21\0\2\3"+
    "\7\0\14\3\1\126\10\3\21\0\2\3\7\0\14\3"+
    "\1\120\10\3\21\0\2\3\7\0\22\3\1\127\2\3"+
    "\21\0\2\3\7\0\23\3\1\130\1\3\21\0\2\3"+
    "\7\0\11\3\1\131\13\3\20\0\5\54\1\132\1\111"+
    "\50\54\1\0\2\3\7\0\3\3\1\133\21\3\21\0"+
    "\2\3\7\0\11\3\1\134\13\3\21\0\2\3\7\0"+
    "\3\3\1\135\21\3\21\0\2\3\7\0\17\3\1\136"+
    "\5\3\21\0\2\3\7\0\15\3\1\137\7\3\21\0"+
    "\2\3\7\0\2\3\1\140\22\3\21\0\2\3\7\0"+
    "\1\3\1\141\23\3\21\0\2\3\7\0\11\3\1\142"+
    "\13\3\21\0\2\3\7\0\3\3\1\143\21\3\21\0"+
    "\2\3\7\0\23\3\1\144\1\3\21\0\2\3\7\0"+
    "\11\3\1\145\13\3\21\0\2\3\7\0\2\3\1\146"+
    "\22\3\21\0\2\3\7\0\3\3\1\147\21\3\21\0"+
    "\2\3\7\0\5\3\1\150\7\3\1\120\7\3\21\0"+
    "\2\3\7\0\2\3\1\151\22\3\21\0\2\3\7\0"+
    "\1\152\24\3\21\0\2\3\7\0\23\3\1\153\1\3"+
    "\21\0\2\3\7\0\11\3\1\154\13\3\21\0\2\3"+
    "\7\0\11\3\1\155\13\3\21\0\2\3\7\0\10\3"+
    "\1\156\14\3\21\0\2\3\7\0\21\3\1\157\3\3"+
    "\21\0\2\3\7\0\1\3\1\160\23\3\21\0\2\3"+
    "\7\0\4\3\1\161\20\3\21\0\2\3\7\0\7\3"+
    "\1\162\15\3\21\0\2\3\7\0\1\3\1\163\23\3"+
    "\21\0\2\3\7\0\14\3\1\164\10\3\21\0\2\3"+
    "\7\0\11\3\1\165\13\3\21\0\2\3\7\0\2\3"+
    "\1\166\22\3\21\0\2\3\7\0\15\3\1\167\7\3"+
    "\21\0\2\3\7\0\11\3\1\170\13\3\21\0\1\3"+
    "\1\171\7\0\25\3\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3760];
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
    "\1\0\1\11\2\1\1\11\2\1\2\11\21\1\5\11"+
    "\5\1\3\11\2\0\1\11\1\1\2\0\22\1\10\11"+
    "\1\1\1\0\1\11\57\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[121];
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
    public String Lexejs;
    public int Lineajs;
    public int Colujs;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexiJS(java.io.Reader in) {
      yyline = 1;
    yycolumn = 1;
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexiJS(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 120) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokenjs yylex() throws java.io.IOException {
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
        case 48: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Console;
          }
        case 52: break;
        case 3: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Numero;
          }
        case 53: break;
        case 50: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Require;
          }
        case 54: break;
        case 24: 
          { Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn;  return Comentario;
          }
        case 55: break;
        case 13: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Parentesis_Apertura;
          }
        case 56: break;
        case 30: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return And;
          }
        case 57: break;
        case 17: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Not;
          }
        case 58: break;
        case 14: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Parentesis_Cierre;
          }
        case 59: break;
        case 4: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Punto;
          }
        case 60: break;
        case 36: 
          { Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return Log;
          }
        case 61: break;
        case 11: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Resta;
          }
        case 62: break;
        case 23: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Cadena;
          }
        case 63: break;
        case 18: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Mayor;
          }
        case 64: break;
        case 16: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Llave_Cierre;
          }
        case 65: break;
        case 51: 
          { Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return Llamada;
          }
        case 66: break;
        case 43: 
          { Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return Clase;
          }
        case 67: break;
        case 41: 
          { Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return Else;
          }
        case 68: break;
        case 1: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return ERROR;
          }
        case 69: break;
        case 26: 
          { Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return If;
          }
        case 70: break;
        case 47: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Switch;
          }
        case 71: break;
        case 40: 
          { Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return Case;
          }
        case 72: break;
        case 39: 
          { Lexejs= yytext(); Lineajs =yyline; Colujs=yycolumn; return Comentario_Multilinea;
          }
        case 73: break;
        case 33: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Mayor_Igual;
          }
        case 74: break;
        case 9: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Igual;
          }
        case 75: break;
        case 22: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Dos_Puntos;
          }
        case 76: break;
        case 2: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Identificador;
          }
        case 77: break;
        case 49: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Default;
          }
        case 78: break;
        case 7: 
          { yycolumn = 1;
          }
        case 79: break;
        case 38: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return For;
          }
        case 80: break;
        case 20: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Punto_y_coma;
          }
        case 81: break;
        case 46: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Break;
          }
        case 82: break;
        case 35: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Char;
          }
        case 83: break;
        case 19: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Menor;
          }
        case 84: break;
        case 6: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Multiplicacion;
          }
        case 85: break;
        case 31: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Or;
          }
        case 86: break;
        case 21: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Coma;
          }
        case 87: break;
        case 42: 
          { Lexejs = yytext();Lineajs =yyline; Colujs=yycolumn; return True;
          }
        case 88: break;
        case 29: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Decremento;
          }
        case 89: break;
        case 12: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Modulo;
          }
        case 90: break;
        case 5: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Division;
          }
        case 91: break;
        case 15: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Llave_Apertura;
          }
        case 92: break;
        case 10: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Suma;
          }
        case 93: break;
        case 44: 
          { Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return While;
          }
        case 94: break;
        case 27: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Igualacion;
          }
        case 95: break;
        case 32: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Negacion;
          }
        case 96: break;
        case 34: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Menor_Igual;
          }
        case 97: break;
        case 8: 
          { /*Ignore*/
          }
        case 98: break;
        case 25: 
          { Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return Do;
          }
        case 99: break;
        case 37: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn;  return Variable;
          }
        case 100: break;
        case 45: 
          { Lexejs = yytext();Lineajs =yyline; Colujs=yycolumn; return False;
          }
        case 101: break;
        case 28: 
          { Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Incremente;
          }
        case 102: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
