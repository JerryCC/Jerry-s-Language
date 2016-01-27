package tlang.ast;

import java.util.ArrayList;
import java.util.Iterator;

import tlang.*;

public class ASTLeaf extends ASTree { 

	private static ArrayList<ASTree> empty = new ArrayList<ASTree>();
	protected Token token;
	
	public ASTLeaf(Token t) { this.token = t; }
	
	public ASTree child(int i) { throw new IndexOutOfBoundsException("ASTLeaf does not have any child"); }

	public int numChildren() { return 0; }

	public Iterator<ASTree> children() { return empty.iterator(); }

	public String toString() { return token.getText(); }
	
	public Token getToken() { return token; }
	
	@Override
	public String location() { return "at line " + token.getLineNumber(); }
	

}
