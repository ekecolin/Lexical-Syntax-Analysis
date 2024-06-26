// Generated from CCAL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CCALLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, CONST=2, RETURN=3, INTEGER=4, BOOLEAN=5, VOID=6, MAIN=7, IF=8, 
		ELSE=9, TRUE=10, FALSE=11, WHILE=12, SKIPS=13, COMMA=14, SEMICOLON=15, 
		COLON=16, EQUAL=17, LCB=18, RCB=19, LB=20, RB=21, PLUS=22, MINUS=23, TILDA=24, 
		OR=25, AND=26, EQUALTO=27, NOTEQUALTO=28, LT=29, GT=30, LTET=31, GTET=32, 
		BV=33, ID=34, INTEG=35, WS=36, NESTEDCOM=37, SINGLINECOM=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Letter", "Digit", "UnderScore", "A", "B", "C", "D", "E", "F", "G", "H", 
		"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", 
		"W", "X", "Y", "Z", "VAR", "CONST", "RETURN", "INTEGER", "BOOLEAN", "VOID", 
		"MAIN", "IF", "ELSE", "TRUE", "FALSE", "WHILE", "SKIPS", "COMMA", "SEMICOLON", 
		"COLON", "EQUAL", "LCB", "RCB", "LB", "RB", "PLUS", "MINUS", "TILDA", 
		"OR", "AND", "EQUALTO", "NOTEQUALTO", "LT", "GT", "LTET", "GTET", "BV", 
		"ID", "INTEG", "WS", "NESTEDCOM", "SINGLINECOM"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'skip'", "','", "';'", "':'", "'='", "'{'", "'}'", "'('", "')'", 
		"'+'", "'-'", "'~'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", 
		"'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "CONST", "RETURN", "INTEGER", "BOOLEAN", "VOID", "MAIN", 
		"IF", "ELSE", "TRUE", "FALSE", "WHILE", "SKIPS", "COMMA", "SEMICOLON", 
		"COLON", "EQUAL", "LCB", "RCB", "LB", "RB", "PLUS", "MINUS", "TILDA", 
		"OR", "AND", "EQUALTO", "NOTEQUALTO", "LT", "GT", "LTET", "GTET", "BV", 
		"ID", "INTEG", "WS", "NESTEDCOM", "SINGLINECOM"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CCALLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CCAL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0194\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<"+
		"\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0142\n?\3@\3@\3@\3@"+
		"\7@\u0148\n@\f@\16@\u014b\13@\3A\5A\u014e\nA\3A\3A\7A\u0152\nA\fA\16A"+
		"\u0155\13A\3A\5A\u0158\nA\3B\6B\u015b\nB\rB\16B\u015c\3B\3B\3C\3C\3C\3"+
		"C\7C\u0165\nC\fC\16C\u0168\13C\3C\3C\7C\u016c\nC\fC\16C\u016f\13C\3C\7"+
		"C\u0172\nC\fC\16C\u0175\13C\5C\u0177\nC\3C\7C\u017a\nC\fC\16C\u017d\13"+
		"C\3C\7C\u0180\nC\fC\16C\u0183\13C\3C\3C\3C\3C\3C\3D\3D\3D\3D\7D\u018e"+
		"\nD\fD\16D\u0191\13D\3D\3D\5\u0166\u017b\u0181\2E\3\2\5\2\7\2\t\2\13\2"+
		"\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-"+
		"\2/\2\61\2\63\2\65\2\67\29\2;\2=\3?\4A\5C\6E\7G\bI\tK\nM\13O\fQ\rS\16"+
		"U\17W\20Y\21[\22]\23_\24a\25c\26e\27g\30i\31k\32m\33o\34q\35s\36u\37w"+
		" y!{\"}#\177$\u0081%\u0083&\u0085\'\u0087(\3\2#\4\2C\\c|\3\2\62;\4\2C"+
		"Ccc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4"+
		"\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTt"+
		"t\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3"+
		"\2\63;\3\2\62\62\5\2\13\f\17\17\"\"\4\2,,\61\61\4\2\f\f\17\17\2\u0186"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\3\u0089\3\2\2\2\5\u008b\3\2\2\2\7\u008d\3\2\2"+
		"\2\t\u008f\3\2\2\2\13\u0091\3\2\2\2\r\u0093\3\2\2\2\17\u0095\3\2\2\2\21"+
		"\u0097\3\2\2\2\23\u0099\3\2\2\2\25\u009b\3\2\2\2\27\u009d\3\2\2\2\31\u009f"+
		"\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2\37\u00a5\3\2\2\2!\u00a7\3\2"+
		"\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b1"+
		"\3\2\2\2-\u00b3\3\2\2\2/\u00b5\3\2\2\2\61\u00b7\3\2\2\2\63\u00b9\3\2\2"+
		"\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00bf\3\2\2\2;\u00c1\3\2\2\2=\u00c3"+
		"\3\2\2\2?\u00c7\3\2\2\2A\u00cd\3\2\2\2C\u00d4\3\2\2\2E\u00dc\3\2\2\2G"+
		"\u00e4\3\2\2\2I\u00e9\3\2\2\2K\u00ee\3\2\2\2M\u00f1\3\2\2\2O\u00f6\3\2"+
		"\2\2Q\u00fb\3\2\2\2S\u0101\3\2\2\2U\u0107\3\2\2\2W\u010c\3\2\2\2Y\u010e"+
		"\3\2\2\2[\u0110\3\2\2\2]\u0112\3\2\2\2_\u0114\3\2\2\2a\u0116\3\2\2\2c"+
		"\u0118\3\2\2\2e\u011a\3\2\2\2g\u011c\3\2\2\2i\u011e\3\2\2\2k\u0120\3\2"+
		"\2\2m\u0122\3\2\2\2o\u0125\3\2\2\2q\u0128\3\2\2\2s\u012b\3\2\2\2u\u012e"+
		"\3\2\2\2w\u0130\3\2\2\2y\u0132\3\2\2\2{\u0135\3\2\2\2}\u0141\3\2\2\2\177"+
		"\u0143\3\2\2\2\u0081\u0157\3\2\2\2\u0083\u015a\3\2\2\2\u0085\u0160\3\2"+
		"\2\2\u0087\u0189\3\2\2\2\u0089\u008a\t\2\2\2\u008a\4\3\2\2\2\u008b\u008c"+
		"\t\3\2\2\u008c\6\3\2\2\2\u008d\u008e\7a\2\2\u008e\b\3\2\2\2\u008f\u0090"+
		"\t\4\2\2\u0090\n\3\2\2\2\u0091\u0092\t\5\2\2\u0092\f\3\2\2\2\u0093\u0094"+
		"\t\6\2\2\u0094\16\3\2\2\2\u0095\u0096\t\7\2\2\u0096\20\3\2\2\2\u0097\u0098"+
		"\t\b\2\2\u0098\22\3\2\2\2\u0099\u009a\t\t\2\2\u009a\24\3\2\2\2\u009b\u009c"+
		"\t\n\2\2\u009c\26\3\2\2\2\u009d\u009e\t\13\2\2\u009e\30\3\2\2\2\u009f"+
		"\u00a0\t\f\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\t\r\2\2\u00a2\34\3\2\2\2\u00a3"+
		"\u00a4\t\16\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\t\17\2\2\u00a6 \3\2\2\2\u00a7"+
		"\u00a8\t\20\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\t\21\2\2\u00aa$\3\2\2\2\u00ab"+
		"\u00ac\t\22\2\2\u00ac&\3\2\2\2\u00ad\u00ae\t\23\2\2\u00ae(\3\2\2\2\u00af"+
		"\u00b0\t\24\2\2\u00b0*\3\2\2\2\u00b1\u00b2\t\25\2\2\u00b2,\3\2\2\2\u00b3"+
		"\u00b4\t\26\2\2\u00b4.\3\2\2\2\u00b5\u00b6\t\27\2\2\u00b6\60\3\2\2\2\u00b7"+
		"\u00b8\t\30\2\2\u00b8\62\3\2\2\2\u00b9\u00ba\t\31\2\2\u00ba\64\3\2\2\2"+
		"\u00bb\u00bc\t\32\2\2\u00bc\66\3\2\2\2\u00bd\u00be\t\33\2\2\u00be8\3\2"+
		"\2\2\u00bf\u00c0\t\34\2\2\u00c0:\3\2\2\2\u00c1\u00c2\t\35\2\2\u00c2<\3"+
		"\2\2\2\u00c3\u00c4\5\63\32\2\u00c4\u00c5\5\t\5\2\u00c5\u00c6\5+\26\2\u00c6"+
		">\3\2\2\2\u00c7\u00c8\5\r\7\2\u00c8\u00c9\5%\23\2\u00c9\u00ca\5#\22\2"+
		"\u00ca\u00cb\5-\27\2\u00cb\u00cc\5/\30\2\u00cc@\3\2\2\2\u00cd\u00ce\5"+
		"+\26\2\u00ce\u00cf\5\21\t\2\u00cf\u00d0\5/\30\2\u00d0\u00d1\5\61\31\2"+
		"\u00d1\u00d2\5+\26\2\u00d2\u00d3\5#\22\2\u00d3B\3\2\2\2\u00d4\u00d5\5"+
		"\31\r\2\u00d5\u00d6\5#\22\2\u00d6\u00d7\5/\30\2\u00d7\u00d8\5\21\t\2\u00d8"+
		"\u00d9\5\25\13\2\u00d9\u00da\5\21\t\2\u00da\u00db\5+\26\2\u00dbD\3\2\2"+
		"\2\u00dc\u00dd\5\13\6\2\u00dd\u00de\5%\23\2\u00de\u00df\5%\23\2\u00df"+
		"\u00e0\5\37\20\2\u00e0\u00e1\5\21\t\2\u00e1\u00e2\5\t\5\2\u00e2\u00e3"+
		"\5#\22\2\u00e3F\3\2\2\2\u00e4\u00e5\5\63\32\2\u00e5\u00e6\5%\23\2\u00e6"+
		"\u00e7\5\31\r\2\u00e7\u00e8\5\17\b\2\u00e8H\3\2\2\2\u00e9\u00ea\5!\21"+
		"\2\u00ea\u00eb\5\t\5\2\u00eb\u00ec\5\31\r\2\u00ec\u00ed\5#\22\2\u00ed"+
		"J\3\2\2\2\u00ee\u00ef\5\31\r\2\u00ef\u00f0\5\23\n\2\u00f0L\3\2\2\2\u00f1"+
		"\u00f2\5\21\t\2\u00f2\u00f3\5\37\20\2\u00f3\u00f4\5-\27\2\u00f4\u00f5"+
		"\5\21\t\2\u00f5N\3\2\2\2\u00f6\u00f7\5/\30\2\u00f7\u00f8\5+\26\2\u00f8"+
		"\u00f9\5\61\31\2\u00f9\u00fa\5\21\t\2\u00faP\3\2\2\2\u00fb\u00fc\5\23"+
		"\n\2\u00fc\u00fd\5\t\5\2\u00fd\u00fe\5\37\20\2\u00fe\u00ff\5-\27\2\u00ff"+
		"\u0100\5\21\t\2\u0100R\3\2\2\2\u0101\u0102\5\65\33\2\u0102\u0103\5\27"+
		"\f\2\u0103\u0104\5\31\r\2\u0104\u0105\5\37\20\2\u0105\u0106\5\21\t\2\u0106"+
		"T\3\2\2\2\u0107\u0108\7u\2\2\u0108\u0109\7m\2\2\u0109\u010a\7k\2\2\u010a"+
		"\u010b\7r\2\2\u010bV\3\2\2\2\u010c\u010d\7.\2\2\u010dX\3\2\2\2\u010e\u010f"+
		"\7=\2\2\u010fZ\3\2\2\2\u0110\u0111\7<\2\2\u0111\\\3\2\2\2\u0112\u0113"+
		"\7?\2\2\u0113^\3\2\2\2\u0114\u0115\7}\2\2\u0115`\3\2\2\2\u0116\u0117\7"+
		"\177\2\2\u0117b\3\2\2\2\u0118\u0119\7*\2\2\u0119d\3\2\2\2\u011a\u011b"+
		"\7+\2\2\u011bf\3\2\2\2\u011c\u011d\7-\2\2\u011dh\3\2\2\2\u011e\u011f\7"+
		"/\2\2\u011fj\3\2\2\2\u0120\u0121\7\u0080\2\2\u0121l\3\2\2\2\u0122\u0123"+
		"\7~\2\2\u0123\u0124\7~\2\2\u0124n\3\2\2\2\u0125\u0126\7(\2\2\u0126\u0127"+
		"\7(\2\2\u0127p\3\2\2\2\u0128\u0129\7?\2\2\u0129\u012a\7?\2\2\u012ar\3"+
		"\2\2\2\u012b\u012c\7#\2\2\u012c\u012d\7?\2\2\u012dt\3\2\2\2\u012e\u012f"+
		"\7>\2\2\u012fv\3\2\2\2\u0130\u0131\7@\2\2\u0131x\3\2\2\2\u0132\u0133\7"+
		">\2\2\u0133\u0134\7?\2\2\u0134z\3\2\2\2\u0135\u0136\7@\2\2\u0136\u0137"+
		"\7?\2\2\u0137|\3\2\2\2\u0138\u0139\7v\2\2\u0139\u013a\7t\2\2\u013a\u013b"+
		"\7w\2\2\u013b\u0142\7g\2\2\u013c\u013d\7h\2\2\u013d\u013e\7c\2\2\u013e"+
		"\u013f\7n\2\2\u013f\u0140\7u\2\2\u0140\u0142\7g\2\2\u0141\u0138\3\2\2"+
		"\2\u0141\u013c\3\2\2\2\u0142~\3\2\2\2\u0143\u0149\5\3\2\2\u0144\u0148"+
		"\5\3\2\2\u0145\u0148\5\5\3\2\u0146\u0148\5\7\4\2\u0147\u0144\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u0080\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014e\7/\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0153\t\36\2\2\u0150\u0152\t\3\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0158\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0156\u0158\t\37\2\2\u0157\u014d\3\2\2\2\u0157"+
		"\u0156\3\2\2\2\u0158\u0082\3\2\2\2\u0159\u015b\t \2\2\u015a\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\bB\2\2\u015f\u0084\3\2\2\2\u0160\u0161\7\61"+
		"\2\2\u0161\u0162\7,\2\2\u0162\u017b\3\2\2\2\u0163\u0165\7\61\2\2\u0164"+
		"\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0167\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u017a\5\u0085C\2\u016a"+
		"\u016c\7\61\2\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3"+
		"\2\2\2\u016d\u016e\3\2\2\2\u016e\u0177\3\2\2\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0172\7,\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u016d\3\2\2\2\u0176\u0173\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\n!"+
		"\2\2\u0179\u0166\3\2\2\2\u0179\u0176\3\2\2\2\u017a\u017d\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u0181\3\2\2\2\u017d\u017b\3\2"+
		"\2\2\u017e\u0180\7,\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0184\u0185\7,\2\2\u0185\u0186\7\61\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\bC\2\2\u0188\u0086\3\2\2\2\u0189\u018a\7\61\2\2\u018a\u018b\7\61"+
		"\2\2\u018b\u018f\3\2\2\2\u018c\u018e\n\"\2\2\u018d\u018c\3\2\2\2\u018e"+
		"\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0192\u0193\bD\2\2\u0193\u0088\3\2\2\2\22\2\u0141"+
		"\u0147\u0149\u014d\u0153\u0157\u015c\u0166\u016d\u0173\u0176\u0179\u017b"+
		"\u0181\u018f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}