package tlang;
import tlang.ast.ASTree;

@SuppressWarnings("serial")
public class TLangException extends RuntimeException {
	public TLangException(String m) {super(m);}
	public TLangException(String m, ASTree t) {
		super(m + " " + t.location());
	}
}
