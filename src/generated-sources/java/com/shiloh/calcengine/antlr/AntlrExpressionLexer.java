// Generated from C:\Projects\calcengine\src\main\antlr\AntlrExpression.g4 by ANTLR 4.1
package com.shiloh.calcengine.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrExpressionLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, WHERE=2, PROPERTY=3, PRIMARYKEY=4, CALCULATED=5, ABSTRACT=6, 
		RELATIONSHIP=7, THIS=8, LPAREN=9, RPAREN=10, LBRACE=11, RBRACE=12, LBRACK=13, 
		RBRACK=14, SEMI=15, COMMA=16, DOT=17, COLON=18, SQUOT=19, DQUOT=20, OP_ASSIGN=21, 
		OP_NOT=22, OP_MUL=23, OP_DIV=24, OP_MOD=25, OP_ADD=26, OP_SUB=27, OP_EQ=28, 
		OP_NEQ=29, OP_GT=30, OP_GTE=31, OP_LT=32, OP_LTE=33, OP_AND=34, OP_OR=35, 
		BooleanLiteral=36, IntegerLiteral=37, FloatingPointLiteral=38, StringLiteral=39, 
		Identifier=40, WS=41, COMMENT=42, LINE_COMMENT=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'class'", "'where'", "'property'", "'primarykey'", "'calculated'", "'abstract'", 
		"'relationship'", "'this'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "':'", "'''", "'\"'", "'='", "OP_NOT", "'*'", "'/'", 
		"'%'", "'+'", "'-'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "OP_AND", 
		"OP_OR", "BooleanLiteral", "IntegerLiteral", "FloatingPointLiteral", "StringLiteral", 
		"Identifier", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"CLASS", "WHERE", "PROPERTY", "PRIMARYKEY", "CALCULATED", "ABSTRACT", 
		"RELATIONSHIP", "THIS", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
		"RBRACK", "SEMI", "COMMA", "DOT", "COLON", "SQUOT", "DQUOT", "OP_ASSIGN", 
		"OP_NOT", "OP_MUL", "OP_DIV", "OP_MOD", "OP_ADD", "OP_SUB", "OP_EQ", "OP_NEQ", 
		"OP_GT", "OP_GTE", "OP_LT", "OP_LTE", "OP_AND", "OP_OR", "BooleanLiteral", 
		"IntegerLiteral", "FloatingPointLiteral", "StringLiteral", "Identifier", 
		"EXPONENT", "HEX_DIGIT", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC", "WS", 
		"COMMENT", "LINE_COMMENT"
	};


	public AntlrExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AntlrExpression.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 45: WS_action((RuleContext)_localctx, actionIndex); break;

		case 46: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 47: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2-\u0174\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00c8\n\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u00e9\n#\3$\3"+
		"$\3$\3$\5$\u00ef\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00fa\n%\3&\6&\u00fd"+
		"\n&\r&\16&\u00fe\3\'\6\'\u0102\n\'\r\'\16\'\u0103\3\'\3\'\7\'\u0108\n"+
		"\'\f\'\16\'\u010b\13\'\3\'\5\'\u010e\n\'\3\'\3\'\6\'\u0112\n\'\r\'\16"+
		"\'\u0113\3\'\5\'\u0117\n\'\3\'\6\'\u011a\n\'\r\'\16\'\u011b\3\'\5\'\u011f"+
		"\n\'\3(\3(\3(\7(\u0124\n(\f(\16(\u0127\13(\3(\3(\3)\3)\7)\u012d\n)\f)"+
		"\16)\u0130\13)\3*\3*\5*\u0134\n*\3*\6*\u0137\n*\r*\16*\u0138\3+\3+\3,"+
		"\3,\3,\3,\5,\u0141\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u014c\n-\3.\3.\3."+
		"\3.\3.\3.\3.\3/\6/\u0156\n/\r/\16/\u0157\3/\3/\3\60\3\60\3\60\3\60\7\60"+
		"\u0160\n\60\f\60\16\60\u0163\13\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\7\61\u016e\n\61\f\61\16\61\u0171\13\61\3\61\3\61\3\u0161\62"+
		"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27"+
		"\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\""+
		"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S\2\1U\2\1W\2\1Y\2\1[\2\1]+\2_,\3a"+
		"-\4\3\2\13\4\2$$^^\5\2C\\aac|\6\2\62;C\\aac|\4\2GGgg\4\2--//\5\2\62;C"+
		"Hch\n\2$$))^^ddhhppttvv\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0187\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\3c\3\2\2\2\5i\3\2\2\2\7o\3\2\2\2\tx\3\2\2\2\13\u0083\3\2"+
		"\2\2\r\u008e\3\2\2\2\17\u0097\3\2\2\2\21\u00a4\3\2\2\2\23\u00a9\3\2\2"+
		"\2\25\u00ab\3\2\2\2\27\u00ad\3\2\2\2\31\u00af\3\2\2\2\33\u00b1\3\2\2\2"+
		"\35\u00b3\3\2\2\2\37\u00b5\3\2\2\2!\u00b7\3\2\2\2#\u00b9\3\2\2\2%\u00bb"+
		"\3\2\2\2\'\u00bd\3\2\2\2)\u00bf\3\2\2\2+\u00c1\3\2\2\2-\u00c7\3\2\2\2"+
		"/\u00c9\3\2\2\2\61\u00cb\3\2\2\2\63\u00cd\3\2\2\2\65\u00cf\3\2\2\2\67"+
		"\u00d1\3\2\2\29\u00d3\3\2\2\2;\u00d6\3\2\2\2=\u00d9\3\2\2\2?\u00db\3\2"+
		"\2\2A\u00de\3\2\2\2C\u00e0\3\2\2\2E\u00e8\3\2\2\2G\u00ee\3\2\2\2I\u00f9"+
		"\3\2\2\2K\u00fc\3\2\2\2M\u011e\3\2\2\2O\u0120\3\2\2\2Q\u012a\3\2\2\2S"+
		"\u0131\3\2\2\2U\u013a\3\2\2\2W\u0140\3\2\2\2Y\u014b\3\2\2\2[\u014d\3\2"+
		"\2\2]\u0155\3\2\2\2_\u015b\3\2\2\2a\u0169\3\2\2\2cd\7e\2\2de\7n\2\2ef"+
		"\7c\2\2fg\7u\2\2gh\7u\2\2h\4\3\2\2\2ij\7y\2\2jk\7j\2\2kl\7g\2\2lm\7t\2"+
		"\2mn\7g\2\2n\6\3\2\2\2op\7r\2\2pq\7t\2\2qr\7q\2\2rs\7r\2\2st\7g\2\2tu"+
		"\7t\2\2uv\7v\2\2vw\7{\2\2w\b\3\2\2\2xy\7r\2\2yz\7t\2\2z{\7k\2\2{|\7o\2"+
		"\2|}\7c\2\2}~\7t\2\2~\177\7{\2\2\177\u0080\7m\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0082\7{\2\2\u0082\n\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7n\2\2\u0086\u0087\7e\2\2\u0087\u0088\7w\2\2\u0088\u0089\7n\2\2"+
		"\u0089\u008a\7c\2\2\u008a\u008b\7v\2\2\u008b\u008c\7g\2\2\u008c\u008d"+
		"\7f\2\2\u008d\f\3\2\2\2\u008e\u008f\7c\2\2\u008f\u0090\7d\2\2\u0090\u0091"+
		"\7u\2\2\u0091\u0092\7v\2\2\u0092\u0093\7t\2\2\u0093\u0094\7c\2\2\u0094"+
		"\u0095\7e\2\2\u0095\u0096\7v\2\2\u0096\16\3\2\2\2\u0097\u0098\7t\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7n\2\2\u009a\u009b\7c\2\2\u009b\u009c\7v\2\2"+
		"\u009c\u009d\7k\2\2\u009d\u009e\7q\2\2\u009e\u009f\7p\2\2\u009f\u00a0"+
		"\7u\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7r\2\2\u00a3"+
		"\20\3\2\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7k\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8\22\3\2\2\2\u00a9\u00aa\7*\2\2\u00aa\24\3\2\2\2\u00ab"+
		"\u00ac\7+\2\2\u00ac\26\3\2\2\2\u00ad\u00ae\7}\2\2\u00ae\30\3\2\2\2\u00af"+
		"\u00b0\7\177\2\2\u00b0\32\3\2\2\2\u00b1\u00b2\7]\2\2\u00b2\34\3\2\2\2"+
		"\u00b3\u00b4\7_\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7=\2\2\u00b6 \3\2\2\2"+
		"\u00b7\u00b8\7.\2\2\u00b8\"\3\2\2\2\u00b9\u00ba\7\60\2\2\u00ba$\3\2\2"+
		"\2\u00bb\u00bc\7<\2\2\u00bc&\3\2\2\2\u00bd\u00be\7)\2\2\u00be(\3\2\2\2"+
		"\u00bf\u00c0\7$\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2,\3\2\2\2\u00c3"+
		"\u00c8\7#\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c8\7v\2\2"+
		"\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8.\3\2\2\2\u00c9\u00ca\7"+
		",\2\2\u00ca\60\3\2\2\2\u00cb\u00cc\7\61\2\2\u00cc\62\3\2\2\2\u00cd\u00ce"+
		"\7\'\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0\66\3\2\2\2\u00d1\u00d2"+
		"\7/\2\2\u00d28\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d5\7?\2\2\u00d5:\3"+
		"\2\2\2\u00d6\u00d7\7#\2\2\u00d7\u00d8\7?\2\2\u00d8<\3\2\2\2\u00d9\u00da"+
		"\7@\2\2\u00da>\3\2\2\2\u00db\u00dc\7@\2\2\u00dc\u00dd\7?\2\2\u00dd@\3"+
		"\2\2\2\u00de\u00df\7>\2\2\u00dfB\3\2\2\2\u00e0\u00e1\7>\2\2\u00e1\u00e2"+
		"\7?\2\2\u00e2D\3\2\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e9"+
		"\7f\2\2\u00e6\u00e7\7(\2\2\u00e7\u00e9\7(\2\2\u00e8\u00e3\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9F\3\2\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ef\7t\2\2\u00ec"+
		"\u00ed\7~\2\2\u00ed\u00ef\7~\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00ec\3\2\2"+
		"\2\u00efH\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7"+
		"w\2\2\u00f3\u00fa\7g\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7"+
		"\7n\2\2\u00f7\u00f8\7u\2\2\u00f8\u00fa\7g\2\2\u00f9\u00f0\3\2\2\2\u00f9"+
		"\u00f4\3\2\2\2\u00faJ\3\2\2\2\u00fb\u00fd\4\62;\2\u00fc\u00fb\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffL\3"+
		"\2\2\2\u0100\u0102\4\62;\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0109\7\60"+
		"\2\2\u0106\u0108\4\62;\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u010e\5S*\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u011f"+
		"\3\2\2\2\u010f\u0111\7\60\2\2\u0110\u0112\4\62;\2\u0111\u0110\3\2\2\2"+
		"\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116"+
		"\3\2\2\2\u0115\u0117\5S*\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u011f\3\2\2\2\u0118\u011a\4\62;\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\5S*\2\u011e\u0101\3\2\2\2\u011e\u010f\3\2\2\2\u011e\u0119\3\2\2"+
		"\2\u011fN\3\2\2\2\u0120\u0125\7$\2\2\u0121\u0124\5W,\2\u0122\u0124\n\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0128\u0129\7$\2\2\u0129P\3\2\2\2\u012a\u012e\t\3\2\2\u012b\u012d"+
		"\t\4\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012fR\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\t\5\2\2"+
		"\u0132\u0134\t\6\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136"+
		"\3\2\2\2\u0135\u0137\4\62;\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139T\3\2\2\2\u013a\u013b\t\7\2\2"+
		"\u013bV\3\2\2\2\u013c\u013d\7^\2\2\u013d\u0141\t\b\2\2\u013e\u0141\5["+
		".\2\u013f\u0141\5Y-\2\u0140\u013c\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f"+
		"\3\2\2\2\u0141X\3\2\2\2\u0142\u0143\7^\2\2\u0143\u0144\4\62\65\2\u0144"+
		"\u0145\4\629\2\u0145\u014c\4\629\2\u0146\u0147\7^\2\2\u0147\u0148\4\62"+
		"9\2\u0148\u014c\4\629\2\u0149\u014a\7^\2\2\u014a\u014c\4\629\2\u014b\u0142"+
		"\3\2\2\2\u014b\u0146\3\2\2\2\u014b\u0149\3\2\2\2\u014cZ\3\2\2\2\u014d"+
		"\u014e\7^\2\2\u014e\u014f\7w\2\2\u014f\u0150\5U+\2\u0150\u0151\5U+\2\u0151"+
		"\u0152\5U+\2\u0152\u0153\5U+\2\u0153\\\3\2\2\2\u0154\u0156\t\t\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b/\2\2\u015a^\3\2\2\2\u015b\u015c"+
		"\7\61\2\2\u015c\u015d\7,\2\2\u015d\u0161\3\2\2\2\u015e\u0160\13\2\2\2"+
		"\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u0162\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7,\2\2\u0165"+
		"\u0166\7\61\2\2\u0166\u0167\3\2\2\2\u0167\u0168\b\60\3\2\u0168`\3\2\2"+
		"\2\u0169\u016a\7\61\2\2\u016a\u016b\7\61\2\2\u016b\u016f\3\2\2\2\u016c"+
		"\u016e\n\n\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0173\b\61\4\2\u0173b\3\2\2\2\31\2\u00c7\u00e8\u00ee\u00f9\u00fe\u0103"+
		"\u0109\u010d\u0113\u0116\u011b\u011e\u0123\u0125\u012e\u0133\u0138\u0140"+
		"\u014b\u0157\u0161\u016f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}