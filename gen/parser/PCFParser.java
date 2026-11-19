// Generated from PCF.g4 by ANTLR 4.13.2
package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PCFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NUMBER=12, OP1=13, OP2=14, WS=15, VAR=16;
	public static final int
		RULE_exp = 0, RULE_sum = 1, RULE_product = 2, RULE_application = 3, RULE_atom = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"exp", "sum", "product", "application", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fun'", "'->'", "'fix'", "'let'", "'='", "'in'", "'ifz'", "'then'", 
			"'else'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NUMBER", "OP1", "OP2", "WS", "VAR"
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

	@Override
	public String getGrammarFileName() { return "PCF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PCFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FixContext extends ExpContext {
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FixContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterFix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitFix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitFix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetContext extends ExpContext {
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LetContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromSumContext extends ExpContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public FromSumContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterFromSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitFromSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitFromSum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfZeroContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IfZeroContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterIfZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitIfZero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitIfZero(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunContext extends ExpContext {
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exp);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new FunContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				match(T__0);
				setState(11);
				match(VAR);
				setState(12);
				match(T__1);
				setState(13);
				exp();
				}
				break;
			case T__2:
				_localctx = new FixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				match(T__2);
				setState(15);
				match(VAR);
				setState(16);
				exp();
				}
				break;
			case T__3:
				_localctx = new LetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				match(T__3);
				setState(18);
				match(VAR);
				setState(19);
				match(T__4);
				setState(20);
				exp();
				setState(21);
				match(T__5);
				setState(22);
				exp();
				}
				break;
			case T__6:
				_localctx = new IfZeroContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				match(T__6);
				setState(25);
				exp();
				setState(26);
				match(T__7);
				setState(27);
				exp();
				setState(28);
				match(T__8);
				setState(29);
				exp();
				}
				break;
			case T__9:
			case NUMBER:
			case VAR:
				_localctx = new FromSumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				sum(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SumContext extends ParserRuleContext {
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
	 
		public SumContext() { }
		public void copyFrom(SumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumTermContext extends SumContext {
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public SumTermContext(SumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterSumTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitSumTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitSumTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExp2Context extends SumContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public TerminalNode OP2() { return getToken(PCFParser.OP2, 0); }
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public BinaryExp2Context(SumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterBinaryExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitBinaryExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitBinaryExp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		return sum(0);
	}

	private SumContext sum(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumContext _localctx = new SumContext(_ctx, _parentState);
		SumContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_sum, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SumTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(35);
			product(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryExp2Context(new SumContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_sum);
					setState(37);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(38);
					match(OP2);
					setState(39);
					product(0);
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProductContext extends ParserRuleContext {
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
	 
		public ProductContext() { }
		public void copyFrom(ProductContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExp1Context extends ProductContext {
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public TerminalNode OP1() { return getToken(PCFParser.OP1, 0); }
		public ApplicationContext application() {
			return getRuleContext(ApplicationContext.class,0);
		}
		public BinaryExp1Context(ProductContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterBinaryExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitBinaryExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitBinaryExp1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProductTermContext extends ProductContext {
		public ApplicationContext application() {
			return getRuleContext(ApplicationContext.class,0);
		}
		public ProductTermContext(ProductContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterProductTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitProductTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitProductTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		return product(0);
	}

	private ProductContext product(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProductContext _localctx = new ProductContext(_ctx, _parentState);
		ProductContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_product, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ProductTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(46);
			application(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryExp1Context(new ProductContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_product);
					setState(48);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(49);
					match(OP1);
					setState(50);
					application(0);
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApplicationContext extends ParserRuleContext {
		public ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application; }
	 
		public ApplicationContext() { }
		public void copyFrom(ApplicationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AppContext extends ApplicationContext {
		public ApplicationContext application() {
			return getRuleContext(ApplicationContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AppContext(ApplicationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ApplicationTermContext extends ApplicationContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ApplicationTermContext(ApplicationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterApplicationTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitApplicationTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitApplicationTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplicationContext application() throws RecognitionException {
		return application(0);
	}

	private ApplicationContext application(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ApplicationContext _localctx = new ApplicationContext(_ctx, _parentState);
		ApplicationContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_application, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ApplicationTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(57);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AppContext(new ApplicationContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_application);
					setState(59);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(60);
					atom();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExpContext extends AtomContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParExpContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterParExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitParExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(PCFParser.NUMBER, 0); }
		public NumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends AtomContext {
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public VarContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCFListener ) ((PCFListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(NUMBER);
				}
				break;
			case T__9:
				_localctx = new ParExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__9);
				setState(68);
				exp();
				setState(69);
				match(T__10);
				}
				break;
			case VAR:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return sum_sempred((SumContext)_localctx, predIndex);
		case 2:
			return product_sempred((ProductContext)_localctx, predIndex);
		case 3:
			return application_sempred((ApplicationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sum_sempred(SumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean product_sempred(ProductContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean application_sempred(ApplicationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0010K\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000!\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00024\b\u0002\n\u0002"+
		"\f\u00027\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003>\b\u0003\n\u0003\f\u0003A\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004I\b"+
		"\u0004\u0001\u0004\u0000\u0003\u0002\u0004\u0006\u0005\u0000\u0002\u0004"+
		"\u0006\b\u0000\u0000N\u0000 \u0001\u0000\u0000\u0000\u0002\"\u0001\u0000"+
		"\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000"+
		"\bH\u0001\u0000\u0000\u0000\n\u000b\u0005\u0001\u0000\u0000\u000b\f\u0005"+
		"\u0010\u0000\u0000\f\r\u0005\u0002\u0000\u0000\r!\u0003\u0000\u0000\u0000"+
		"\u000e\u000f\u0005\u0003\u0000\u0000\u000f\u0010\u0005\u0010\u0000\u0000"+
		"\u0010!\u0003\u0000\u0000\u0000\u0011\u0012\u0005\u0004\u0000\u0000\u0012"+
		"\u0013\u0005\u0010\u0000\u0000\u0013\u0014\u0005\u0005\u0000\u0000\u0014"+
		"\u0015\u0003\u0000\u0000\u0000\u0015\u0016\u0005\u0006\u0000\u0000\u0016"+
		"\u0017\u0003\u0000\u0000\u0000\u0017!\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0005\u0007\u0000\u0000\u0019\u001a\u0003\u0000\u0000\u0000\u001a\u001b"+
		"\u0005\b\u0000\u0000\u001b\u001c\u0003\u0000\u0000\u0000\u001c\u001d\u0005"+
		"\t\u0000\u0000\u001d\u001e\u0003\u0000\u0000\u0000\u001e!\u0001\u0000"+
		"\u0000\u0000\u001f!\u0003\u0002\u0001\u0000 \n\u0001\u0000\u0000\u0000"+
		" \u000e\u0001\u0000\u0000\u0000 \u0011\u0001\u0000\u0000\u0000 \u0018"+
		"\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!\u0001\u0001\u0000"+
		"\u0000\u0000\"#\u0006\u0001\uffff\uffff\u0000#$\u0003\u0004\u0002\u0000"+
		"$*\u0001\u0000\u0000\u0000%&\n\u0002\u0000\u0000&\'\u0005\u000e\u0000"+
		"\u0000\')\u0003\u0004\u0002\u0000(%\u0001\u0000\u0000\u0000),\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0003"+
		"\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0006\u0002\uffff"+
		"\uffff\u0000./\u0003\u0006\u0003\u0000/5\u0001\u0000\u0000\u000001\n\u0002"+
		"\u0000\u000012\u0005\r\u0000\u000024\u0003\u0006\u0003\u000030\u0001\u0000"+
		"\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u00006\u0005\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000089\u0006\u0003\uffff\uffff\u00009:\u0003\b\u0004\u0000:?\u0001\u0000"+
		"\u0000\u0000;<\n\u0002\u0000\u0000<>\u0003\b\u0004\u0000=;\u0001\u0000"+
		"\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@\u0007\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000BI\u0005\f\u0000\u0000CD\u0005\n\u0000\u0000DE\u0003\u0000\u0000"+
		"\u0000EF\u0005\u000b\u0000\u0000FI\u0001\u0000\u0000\u0000GI\u0005\u0010"+
		"\u0000\u0000HB\u0001\u0000\u0000\u0000HC\u0001\u0000\u0000\u0000HG\u0001"+
		"\u0000\u0000\u0000I\t\u0001\u0000\u0000\u0000\u0005 *5?H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}