package tlang;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {

	static String pat1 = "[0-9]+";	//Number
	static String pat2 = "\"(\\\\\"|\\\\\\\\|\\\\n|[^\"])*\"";	//String
	static String pat3 = "[A-Z_a-z][A-Z_a-z0-9]*|==|<=|>=|&&|\\|\\||\\p{Punct}";	//Identifier

	public static String regexPat = "\\s*((//.*)|(" + pat1 + ")|(" + pat2 + ")|" + pat3 + ")?";

	private Pattern pattern = Pattern.compile(regexPat);
	private ArrayList<Token> queue = new ArrayList<Token>();
	private boolean hasMore;
	private LineNumberReader reader;

	public Lexer(Reader r) {
		hasMore = true;
		reader = new LineNumberReader(r); //reader code line by line
	}

	public Token read() throws ParseException {
		if (fillQueue(0))
			return queue.remove(0);
		else 
			return Token.EOF;
	}

	public Token peek(int i) throws ParseException {
		if (fillQueue(i)) 
			return queue.get(i);
		else 
			return Token.EOF;
	}

	private boolean fillQueue(int i) throws ParseException {
		if (i > queue.size()) {
			if (hasMore)
				return readLine();
			else 
				return false;
		} else 
			return false;
	}

	private boolean readLine() throws ParseException {
		return false;
	}
}
