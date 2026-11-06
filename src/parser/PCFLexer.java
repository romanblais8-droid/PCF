// Generated from /home/telmo/Documents/IMT/ued/tpromain2/PCF/src/parser/PCF.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PCFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NUMBER=11, OP1=12, OP2=13, WS=14, VAR=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "NUMBER", "OP1", "OP2", "WS", "VAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ifz'", "'then'", "'else'", "'('", "')'", "'let'", "'='", "'in'", 
			"'fun'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NUMBER", 
			"OP1", "OP2", "WS", "VAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public PCFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PCF.g4"; }

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
		"\u0004\u0000\u000f]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\nE\b\n\n\n\f\nH\t\n\u0003"+
		"\nJ\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0004\rQ\b\r\u000b"+
		"\r\f\rR\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000eY\b\u000e\n"+
		"\u000e\f\u000e\\\t\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0007"+
		"\u0001\u000019\u0001\u000009\u0002\u0000**//\u0002\u0000++--\u0003\u0000"+
		"\t\n\r\r  \u0001\u0000az\u0002\u000009az`\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001"+
		"\u001f\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005(\u0001"+
		"\u0000\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000"+
		"\u0000\u000b1\u0001\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f"+
		"7\u0001\u0000\u0000\u0000\u0011:\u0001\u0000\u0000\u0000\u0013>\u0001"+
		"\u0000\u0000\u0000\u0015I\u0001\u0000\u0000\u0000\u0017K\u0001\u0000\u0000"+
		"\u0000\u0019M\u0001\u0000\u0000\u0000\u001bP\u0001\u0000\u0000\u0000\u001d"+
		"V\u0001\u0000\u0000\u0000\u001f \u0005i\u0000\u0000 !\u0005f\u0000\u0000"+
		"!\"\u0005z\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005t\u0000"+
		"\u0000$%\u0005h\u0000\u0000%&\u0005e\u0000\u0000&\'\u0005n\u0000\u0000"+
		"\'\u0004\u0001\u0000\u0000\u0000()\u0005e\u0000\u0000)*\u0005l\u0000\u0000"+
		"*+\u0005s\u0000\u0000+,\u0005e\u0000\u0000,\u0006\u0001\u0000\u0000\u0000"+
		"-.\u0005(\u0000\u0000.\b\u0001\u0000\u0000\u0000/0\u0005)\u0000\u0000"+
		"0\n\u0001\u0000\u0000\u000012\u0005l\u0000\u000023\u0005e\u0000\u0000"+
		"34\u0005t\u0000\u00004\f\u0001\u0000\u0000\u000056\u0005=\u0000\u0000"+
		"6\u000e\u0001\u0000\u0000\u000078\u0005i\u0000\u000089\u0005n\u0000\u0000"+
		"9\u0010\u0001\u0000\u0000\u0000:;\u0005f\u0000\u0000;<\u0005u\u0000\u0000"+
		"<=\u0005n\u0000\u0000=\u0012\u0001\u0000\u0000\u0000>?\u0005-\u0000\u0000"+
		"?@\u0005>\u0000\u0000@\u0014\u0001\u0000\u0000\u0000AJ\u00050\u0000\u0000"+
		"BF\u0007\u0000\u0000\u0000CE\u0007\u0001\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IA\u0001"+
		"\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000J\u0016\u0001\u0000\u0000"+
		"\u0000KL\u0007\u0002\u0000\u0000L\u0018\u0001\u0000\u0000\u0000MN\u0007"+
		"\u0003\u0000\u0000N\u001a\u0001\u0000\u0000\u0000OQ\u0007\u0004\u0000"+
		"\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0006"+
		"\r\u0000\u0000U\u001c\u0001\u0000\u0000\u0000VZ\u0007\u0005\u0000\u0000"+
		"WY\u0007\u0006\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u001e\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\u0005\u0000FIRZ\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}