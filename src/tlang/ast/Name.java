package tlang.ast;

import tlang.Token;

public class Name extends ASTLeaf {
	public Name(Token t) { super(t); }
	public String getName() { return token.getText();}
}
