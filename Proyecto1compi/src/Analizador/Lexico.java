/* The following code was generated by JFlex 1.6.1 */


package Analizador;
import java_cup.runtime.Symbol;
import proyecto1compi.*;
import Listas.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/Jacky Montenegro/Desktop/moshocompi/Primero/Proyecto1compi/src/Analizador/AnalisisLexico.jflex</tt>
 */
public class Lexico implements java_cup.runtime.Scanner {

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
     0,  0,  0,  0,  0,  0,  0,  0, 43, 43, 20, 44, 43, 43,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    43,  0, 19, 22, 31, 21,  0,  0, 36, 37, 42, 41, 34, 32, 18, 40, 
     2, 17,  2,  2,  2,  2,  2,  2,  2,  2,  0, 35,  0, 33,  0,  0, 
     3, 11,  1,  4, 12, 14, 27, 28,  1,  9,  1,  1, 10,  6, 26,  5, 
     7, 23, 13, 16, 25, 24,  1,  1, 30, 29,  1,  0,  0,  0,  0,  1, 
     0, 11,  1,  4, 12, 14, 27, 28,  1,  9,  1,  1, 10,  6, 26,  5, 
     7, 23, 13, 16, 25, 24,  1,  1, 30, 29,  1, 38,  0, 39,  0,  0, 
     0,  0,  0,  0,  0, 44,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\2\1\1\4\2\1\1"+
    "\1\4\2\1\3\2\1\5\2\2\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\2\0\3\2\1\0\2\2\1\22\1\2\1\23"+
    "\1\2\1\0\1\24\1\25\1\26\1\2\1\0\1\2"+
    "\1\0\4\2\1\0\2\2\1\27\1\0\5\2\1\0"+
    "\1\2\1\0\3\2\1\30\1\0\2\2\1\0\5\2"+
    "\1\0\1\2\1\0\1\2\1\31\1\0\1\2\1\0"+
    "\2\2\1\0\1\2\1\32\2\2\1\33\1\0\1\2"+
    "\1\0\1\2\2\34\1\0\2\2\1\0\1\2\1\0"+
    "\2\2\1\0\1\2\2\35\2\0\2\2\1\0\1\2"+
    "\2\36\1\37\2\40\2\0\1\2\1\41\1\0\1\2"+
    "\2\0\1\2\1\0\1\2\2\0\1\2\1\0\1\2"+
    "\2\0\1\2\1\0\1\2\1\0\2\42\1\0\1\2"+
    "\1\0\2\43\5\0\1\44";

  private static int [] zzUnpackAction() {
    int [] result = new int[163];
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
    "\0\0\0\55\0\132\0\207\0\264\0\341\0\u010e\0\u013b"+
    "\0\u0168\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249\0\u0276\0\u02a3"+
    "\0\u02d0\0\u02fd\0\132\0\u032a\0\u0357\0\55\0\55\0\55"+
    "\0\55\0\55\0\55\0\55\0\55\0\55\0\55\0\55"+
    "\0\55\0\u0384\0\u03b1\0\u03de\0\u040b\0\u0438\0\u0465\0\u0492"+
    "\0\u04bf\0\132\0\u04ec\0\132\0\u0519\0\u01ef\0\55\0\55"+
    "\0\55\0\u0546\0\u0573\0\u05a0\0\u05cd\0\u05fa\0\u0627\0\u0654"+
    "\0\u0681\0\u06ae\0\u06db\0\u0708\0\132\0\u0735\0\u0762\0\u078f"+
    "\0\u07bc\0\u07e9\0\u0816\0\u0843\0\u0870\0\u089d\0\u08ca\0\u08f7"+
    "\0\u0924\0\132\0\u0951\0\u097e\0\u09ab\0\u09d8\0\u0a05\0\u0a32"+
    "\0\u0a5f\0\u0a8c\0\u0ab9\0\u0ae6\0\u0b13\0\u0b40\0\u0b6d\0\132"+
    "\0\u0b9a\0\u0bc7\0\u0bf4\0\u0c21\0\u0c4e\0\u0c7b\0\u0ca8\0\132"+
    "\0\u0cd5\0\u0d02\0\132\0\u0d2f\0\u0d5c\0\u0d89\0\u0db6\0\55"+
    "\0\132\0\u0de3\0\u0e10\0\u0e3d\0\u0e6a\0\u0e97\0\u0ec4\0\u0ef1"+
    "\0\u0f1e\0\u0f4b\0\u0f78\0\55\0\132\0\u0fa5\0\u0fd2\0\u0fff"+
    "\0\u102c\0\u1059\0\u1086\0\55\0\132\0\132\0\55\0\132"+
    "\0\u10b3\0\u10e0\0\u110d\0\132\0\u113a\0\u1167\0\u1194\0\u11c1"+
    "\0\u11ee\0\u121b\0\u1248\0\u1275\0\u12a2\0\u12cf\0\u12fc\0\u1329"+
    "\0\u1356\0\u1383\0\u13b0\0\u13dd\0\u140a\0\u1437\0\55\0\132"+
    "\0\u1464\0\u1491\0\u14be\0\55\0\132\0\u14eb\0\u1518\0\u1545"+
    "\0\u1572\0\u159f\0\55";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[163];
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
    "\1\2\1\3\1\4\1\2\1\5\2\3\1\6\1\7"+
    "\1\10\2\3\1\11\1\12\1\13\1\2\1\3\1\4"+
    "\1\2\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\2\3\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\15\57\0\2\3\1\42\4\3\1\0\6\3\1\0"+
    "\2\3\5\0\10\3\17\0\1\43\1\4\1\42\4\43"+
    "\1\0\6\43\1\0\1\43\1\4\5\0\10\43\17\0"+
    "\2\3\1\42\4\3\1\0\4\3\1\44\1\3\1\0"+
    "\2\3\5\0\10\3\17\0\2\3\1\42\4\3\1\0"+
    "\4\3\1\45\1\3\1\0\2\3\5\0\2\3\1\46"+
    "\5\3\50\0\1\47\23\0\2\3\1\42\4\3\1\0"+
    "\6\3\1\0\2\3\5\0\3\3\1\50\4\3\17\0"+
    "\2\3\1\42\1\3\1\51\2\3\1\0\5\3\1\52"+
    "\1\0\2\3\5\0\10\3\17\0\2\3\1\42\4\3"+
    "\1\0\5\3\1\53\1\0\2\3\5\0\1\54\7\3"+
    "\17\0\2\3\1\42\4\3\1\0\6\3\1\0\2\3"+
    "\5\0\7\3\1\55\16\0\23\56\2\57\30\56\24\0"+
    "\1\15\26\0\1\15\26\0\1\60\55\0\1\61\27\0"+
    "\2\3\1\42\4\3\1\0\6\3\1\0\2\3\5\0"+
    "\1\3\1\62\6\3\17\0\2\3\1\42\4\3\1\0"+
    "\6\3\1\63\1\64\1\3\5\0\10\3\17\0\2\3"+
    "\1\42\4\3\1\65\1\66\3\3\1\67\1\3\1\0"+
    "\2\3\5\0\10\3\17\0\2\3\1\42\4\3\1\0"+
    "\2\3\1\70\3\3\1\0\2\3\5\0\10\3\17\0"+
    "\2\3\1\42\4\3\1\0\5\3\1\71\1\0\2\3"+
    "\5\0\10\3\22\0\1\72\51\0\2\43\1\42\4\43"+
    "\1\0\6\43\1\0\2\43\5\0\10\43\17\0\2\3"+
    "\1\42\4\3\1\0\5\3\1\73\1\0\2\3\5\0"+
    "\10\3\17\0\2\3\1\42\1\3\1\74\2\3\1\0"+
    "\6\3\1\0\2\3\5\0\10\3\17\0\2\3\1\42"+
    "\4\3\1\0\6\3\1\0\2\3\5\0\3\3\1\75"+
    "\4\3\26\0\2\76\44\0\2\3\1\42\4\3\1\76"+
    "\1\77\5\3\1\0\2\3\5\0\10\3\17\0\2\3"+
    "\1\42\4\3\1\0\6\3\1\0\2\3\5\0\3\3"+
    "\1\100\4\3\17\0\2\3\1\42\4\3\1\0\6\3"+
    "\1\0\2\3\5\0\1\101\7\3\17\0\2\3\1\42"+
    "\4\3\1\0\6\3\1\0\2\3\5\0\2\3\1\102"+
    "\5\3\17\0\2\3\1\42\4\3\1\0\5\3\1\103"+
    "\1\0\2\3\5\0\10\3\46\0\1\104\25\0\2\3"+
    "\1\42\4\3\1\0\6\3\1\0\2\3\5\0\1\3"+
    "\1\105\6\3\34\0\1\106\37\0\2\3\1\42\4\3"+
    "\1\0\5\3\1\107\1\0\2\3\5\0\10\3\17\0"+
    "\2\3\1\42\4\3\1\0\6\3\1\0\2\3\5\0"+
    "\1\3\1\110\6\3\17\0\2\3\1\42\4\3\1\0"+
    "\1\3\1\111\4\3\1\0\2\3\5\0\10\3\17\0"+
    "\2\3\1\42\4\3\1\0\6\3\1\0\2\3\5\0"+
    "\2\3\1\112\5\3\23\0\1\113\50\0\2\3\1\42"+
    "\4\3\1\0\2\3\1\114\3\3\1\0\2\3\5\0"+
    "\10\3\17\0\2\3\1\42\4\3\1\0\3\3\1\115"+
    "\2\3\1\0\2\3\5\0\10\3\22\0\1\116\51\0"+
    "\2\3\1\42\1\117\3\3\1\0\6\3\1\0\2\3"+
    "\5\0\10\3\17\0\2\3\1\42\4\3\1\0\3\3"+
    "\1\120\2\3\1\0\2\3\5\0\10\3\17\0\2\3"+
    "\1\42\4\3\1\0\6\3\1\0\2\3\5\0\1\3"+
    "\1\121\6\3\17\0\2\3\1\42\4\3\1\0\4\3"+
    "\1\122\1\3\1\0\2\3\5\0\10\3\17\0\2\3"+
    "\1\42\4\3\1\0\4\3\1\123\1\3\1\0\2\3"+
    "\5\0\10\3\31\0\1\124\42\0\2\3\1\42\4\3"+
    "\1\0\2\3\1\125\3\3\1\0\2\3\5\0\10\3"+
    "\50\0\1\126\23\0\2\3\1\42\4\3\1\0\6\3"+
    "\1\0\2\3\5\0\3\3\1\127\4\3\17\0\2\3"+
    "\1\42\4\3\1\0\5\3\1\130\1\0\2\3\5\0"+
    "\10\3\17\0\2\3\1\42\4\3\1\0\6\3\1\131"+
    "\1\132\1\3\5\0\10\3\24\0\1\133\47\0\2\3"+
    "\1\42\4\3\1\0\4\3\1\134\1\3\1\0\2\3"+
    "\5\0\10\3\17\0\2\3\1\42\4\3\1\0\6\3"+
    "\1\0\2\3\5\0\1\3\1\135\6\3\26\0\2\136"+
    "\44\0\2\3\1\42\4\3\1\136\1\137\5\3\1\0"+
    "\2\3\5\0\10\3\17\0\2\3\1\42\4\3\1\0"+
    "\5\3\1\140\1\0\2\3\5\0\10\3\17\0\2\3"+
    "\1\42\4\3\1\0\5\3\1\141\1\0\2\3\5\0"+
    "\10\3\17\0\2\3\1\42\4\3\1\0\2\3\1\142"+
    "\3\3\1\0\2\3\5\0\10\3\17\0\2\3\1\42"+
    "\4\3\1\0\6\3\1\0\2\3\5\0\6\3\1\143"+
    "\1\3\33\0\1\144\40\0\2\3\1\42\4\3\1\0"+
    "\4\3\1\145\1\3\1\0\2\3\5\0\10\3\32\0"+
    "\1\146\41\0\2\3\1\42\4\3\1\0\3\3\1\147"+
    "\2\3\1\0\2\3\5\0\10\3\34\0\1\150\37\0"+
    "\2\3\1\42\4\3\1\0\5\3\1\151\1\0\2\3"+
    "\5\0\10\3\25\0\1\152\46\0\2\3\1\42\4\3"+
    "\1\0\6\3\1\0\2\3\5\0\1\3\1\153\6\3"+
    "\17\0\2\3\1\42\1\154\3\3\1\0\6\3\1\0"+
    "\2\3\5\0\10\3\23\0\1\155\50\0\2\3\1\42"+
    "\1\3\1\156\2\3\1\0\6\3\1\0\2\3\5\0"+
    "\10\3\17\0\2\3\1\42\4\3\1\0\6\3\1\157"+
    "\1\160\1\3\5\0\10\3\17\0\2\3\1\42\4\3"+
    "\1\0\5\3\1\161\1\0\2\3\5\0\10\3\26\0"+
    "\2\162\44\0\2\3\1\42\4\3\1\162\1\163\5\3"+
    "\1\0\2\3\5\0\10\3\31\0\1\164\42\0\2\3"+
    "\1\42\4\3\1\0\2\3\1\165\3\3\1\0\2\3"+
    "\5\0\10\3\26\0\2\166\44\0\2\3\1\42\4\3"+
    "\1\0\6\3\1\167\1\170\1\3\5\0\10\3\17\0"+
    "\2\3\1\42\4\3\1\0\6\3\1\0\2\3\5\0"+
    "\2\3\1\171\5\3\46\0\1\172\25\0\2\3\1\42"+
    "\4\3\1\0\6\3\1\0\2\3\5\0\1\3\1\173"+
    "\6\3\47\0\1\174\24\0\2\3\1\42\4\3\1\0"+
    "\6\3\1\0\2\3\5\0\2\3\1\175\5\3\17\0"+
    "\2\3\1\42\4\3\1\0\4\3\1\176\1\3\1\0"+
    "\2\3\5\0\10\3\23\0\1\177\50\0\2\3\1\42"+
    "\1\3\1\200\2\3\1\0\6\3\1\0\2\3\5\0"+
    "\10\3\30\0\1\201\72\0\1\202\25\0\2\3\1\42"+
    "\4\3\1\0\6\3\1\0\2\3\5\0\1\3\1\203"+
    "\6\3\17\0\2\3\1\42\1\3\1\204\2\3\1\0"+
    "\6\3\1\0\2\3\5\0\10\3\35\0\2\205\35\0"+
    "\2\3\1\42\4\3\1\0\6\3\1\205\1\206\1\3"+
    "\5\0\10\3\31\0\1\207\54\0\1\210\42\0\2\3"+
    "\1\42\4\3\1\0\2\3\1\211\3\3\1\0\2\3"+
    "\5\0\10\3\46\0\1\212\25\0\2\3\1\42\4\3"+
    "\1\0\6\3\1\0\2\3\5\0\1\3\1\213\6\3"+
    "\32\0\1\214\55\0\1\215\40\0\2\3\1\42\4\3"+
    "\1\0\4\3\1\216\1\3\1\0\2\3\5\0\10\3"+
    "\31\0\1\217\42\0\2\3\1\42\4\3\1\0\2\3"+
    "\1\220\3\3\1\0\2\3\5\0\10\3\23\0\1\221"+
    "\57\0\2\222\44\0\2\3\1\42\4\3\1\222\1\223"+
    "\5\3\1\0\2\3\5\0\10\3\33\0\1\224\40\0"+
    "\2\3\1\42\4\3\1\0\4\3\1\225\1\3\1\0"+
    "\2\3\5\0\10\3\33\0\1\226\44\0\1\227\50\0"+
    "\2\3\1\42\1\3\1\230\2\3\1\0\6\3\1\0"+
    "\2\3\5\0\10\3\26\0\2\231\44\0\2\3\1\42"+
    "\4\3\1\231\1\232\5\3\1\0\2\3\5\0\10\3"+
    "\34\0\1\233\43\0\1\234\50\0\2\3\1\42\1\3"+
    "\1\235\2\3\1\0\6\3\1\0\2\3\5\0\10\3"+
    "\35\0\2\236\55\0\1\237\55\0\1\240\36\0\1\241"+
    "\55\0\1\242\55\0\1\243\46\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5580];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\23\1\14\11\2\0\3\1\1\0\6\1"+
    "\1\0\3\11\1\1\1\0\1\1\1\0\4\1\1\0"+
    "\3\1\1\0\5\1\1\0\1\1\1\0\4\1\1\0"+
    "\2\1\1\0\5\1\1\0\1\1\1\0\2\1\1\0"+
    "\1\1\1\0\2\1\1\0\5\1\1\0\1\1\1\0"+
    "\1\1\1\11\1\1\1\0\2\1\1\0\1\1\1\0"+
    "\2\1\1\0\1\1\1\11\1\1\2\0\2\1\1\0"+
    "\1\1\1\11\2\1\1\11\1\1\2\0\2\1\1\0"+
    "\1\1\2\0\1\1\1\0\1\1\2\0\1\1\1\0"+
    "\1\1\2\0\1\1\1\0\1\1\1\0\1\11\1\1"+
    "\1\0\1\1\1\0\1\11\1\1\5\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[163];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    //codigo de java
    String nombre;
   /* public void imprimir(String dato,String cadena){
    	System.out.println(dato+" : "+cadena);
    }*/
    public void imprimir(String cadena){
    	System.out.println(cadena+" soy reservada");
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
    this.zzReader = in;
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
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
          yycolumn += zzCharCount;
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { erroresList error =new erroresList("LEXICO"," "+yytext()," "+(yyline+1)," "+(yycolumn+1),"NO PERTENECE AL LENGUAJE");
ventanaPrincipal.errorLex.add(error);


       
System.out.println("error :  "+yytext());
            }
          case 37: break;
          case 2: 
            { return new Symbol(sym.iden,yycolumn,yyline,yytext());
            }
          case 38: break;
          case 3: 
            { return new Symbol(sym.valorNumerico,yycolumn,yyline,yytext());
            }
          case 39: break;
          case 4: 
            { /* Se ignoran */
            }
          case 40: break;
          case 5: 
            { return new Symbol(sym.n,yycolumn,yyline,yytext());
            }
          case 41: break;
          case 6: 
            { return new Symbol(sym.dolar,yycolumn,yyline,yytext());
            }
          case 42: break;
          case 7: 
            { return new Symbol(sym.menos,yycolumn,yyline,yytext());
            }
          case 43: break;
          case 8: 
            { return new Symbol(sym.igual,yycolumn,yyline,yytext());
            }
          case 44: break;
          case 9: 
            { return new Symbol(sym.coma,yycolumn,yyline,yytext());
            }
          case 45: break;
          case 10: 
            { return new Symbol(sym.pyc,yycolumn,yyline,yytext());
            }
          case 46: break;
          case 11: 
            { return new Symbol(sym.pabre,yycolumn,yyline,yytext());
            }
          case 47: break;
          case 12: 
            { return new Symbol(sym.pcierra,yycolumn,yyline,yytext());
            }
          case 48: break;
          case 13: 
            { return new Symbol(sym.llabre,yycolumn,yyline,yytext());
            }
          case 49: break;
          case 14: 
            { return new Symbol(sym.llcierra,yycolumn,yyline,yytext());
            }
          case 50: break;
          case 15: 
            { return new Symbol(sym.barra,yycolumn,yyline,yytext());
            }
          case 51: break;
          case 16: 
            { return new Symbol(sym.mas,yycolumn,yyline,yytext());
            }
          case 52: break;
          case 17: 
            { return new Symbol(sym.multiplica,yycolumn,yyline,yytext());
            }
          case 53: break;
          case 18: 
            { return new Symbol(sym.de,yycolumn,yyline,yytext());
            }
          case 54: break;
          case 19: 
            { return new Symbol(sym.rq,yycolumn,yyline,yytext());
            }
          case 55: break;
          case 20: 
            { return new Symbol(sym.cadena,yycolumn,yyline,yytext());
            }
          case 56: break;
          case 21: 
            { return new Symbol(sym.and,yycolumn,yyline,yytext());
            }
          case 57: break;
          case 22: 
            { return new Symbol(sym.or,yycolumn,yyline,yytext());
            }
          case 58: break;
          case 23: 
            { return new Symbol(sym.ptn,yycolumn,yyline,yytext());
            }
          case 59: break;
          case 24: 
            { return new Symbol(sym.get,yycolumn,yyline,yytext());
            }
          case 60: break;
          case 25: 
            { return new Symbol(sym.verdadero,yycolumn,yyline,yytext());
            }
          case 61: break;
          case 26: 
            { return new Symbol(sym.donde,yycolumn,yyline,yytext());
            }
          case 62: break;
          case 27: 
            { return new Symbol(sym.query,yycolumn,yyline,yytext());
            }
          case 63: break;
          case 28: 
            { return new Symbol(sym.falso,yycolumn,yyline,yytext());
            }
          case 64: break;
          case 29: 
            { return new Symbol(sym.tienda,yycolumn,yyline,yytext());
            }
          case 65: break;
          case 30: 
            { return new Symbol(sym.req,yycolumn,yyline,yytext());
            }
          case 66: break;
          case 31: 
            { return new Symbol(sym.extraer,yycolumn,yyline,yytext());
            }
          case 67: break;
          case 32: 
            { return new Symbol(sym.usuario,yycolumn,yyline,yytext());
            }
          case 68: break;
          case 33: 
            { return new Symbol(sym.producto,yycolumn,yyline,yytext());
            }
          case 69: break;
          case 34: 
            { return new Symbol(sym.crearu,yycolumn,yyline,yytext());
            }
          case 70: break;
          case 35: 
            { return new Symbol(sym.iniciou,yycolumn,yyline,yytext());
            }
          case 71: break;
          case 36: 
            { return new Symbol(sym.corr,yycolumn,yyline,yytext());
            }
          case 72: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
