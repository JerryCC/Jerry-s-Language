package tlang.ast;

import tlang.Token;

public class NumberLiteral extends ASTLeaf {

	public NumberLiteral(Token t) { super(t); }
	public int getValue() { return token.getNumber(); }
}
