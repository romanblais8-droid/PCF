// Generated from C:/Users/roman/OneDrive/Documents/FISE_A2/Compilation & interprétation/PCF/src/parser/PCF.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PCFParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PCFVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ParExp}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(PCFParser.ParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PCFParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExp1}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExp1(PCFParser.BinaryExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExp2}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExp2(PCFParser.BinaryExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code IfZero}
	 * labeled alternative in {@link PCFParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfZero(PCFParser.IfZeroContext ctx);
}