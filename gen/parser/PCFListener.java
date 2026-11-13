// Generated from PCF.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PCFParser}.
 */
public interface PCFListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Fun}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFun(PCFParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fun}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFun(PCFParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fix}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFix(PCFParser.FixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fix}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFix(PCFParser.FixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Let}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLet(PCFParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLet(PCFParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfZero}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIfZero(PCFParser.IfZeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfZero}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIfZero(PCFParser.IfZeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromSum}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFromSum(PCFParser.FromSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromSum}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFromSum(PCFParser.FromSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumTerm}
	 * labeled alternative in {@link PCFParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSumTerm(PCFParser.SumTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumTerm}
	 * labeled alternative in {@link PCFParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSumTerm(PCFParser.SumTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExp2}
	 * labeled alternative in {@link PCFParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExp2(PCFParser.BinaryExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExp2}
	 * labeled alternative in {@link PCFParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExp2(PCFParser.BinaryExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExp1}
	 * labeled alternative in {@link PCFParser#product}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExp1(PCFParser.BinaryExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExp1}
	 * labeled alternative in {@link PCFParser#product}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExp1(PCFParser.BinaryExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ProductTerm}
	 * labeled alternative in {@link PCFParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProductTerm(PCFParser.ProductTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductTerm}
	 * labeled alternative in {@link PCFParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProductTerm(PCFParser.ProductTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code App}
	 * labeled alternative in {@link PCFParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApp(PCFParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code App}
	 * labeled alternative in {@link PCFParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApp(PCFParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApplicationTerm}
	 * labeled alternative in {@link PCFParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplicationTerm(PCFParser.ApplicationTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApplicationTerm}
	 * labeled alternative in {@link PCFParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplicationTerm(PCFParser.ApplicationTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link PCFParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PCFParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link PCFParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PCFParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParExp}
	 * labeled alternative in {@link PCFParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExp(PCFParser.ParExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParExp}
	 * labeled alternative in {@link PCFParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExp(PCFParser.ParExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link PCFParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterVar(PCFParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link PCFParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitVar(PCFParser.VarContext ctx);
}