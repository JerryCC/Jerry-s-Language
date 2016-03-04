package tlang;

import tlang.*;
import tlang.ast.ASTree;
import tlang.ast.NullStmnt;

public class BasicInterpreter {
	public static void main(String[] args) throws ParseException {
		run (new BasicParser(), new BasicEnv());
	}

	private static void run(BasicParser bp, BasicEnv env) throws ParseException {
		Lexer lexer = new Lexer (new CodeDialog());
		while (lexer.peek(0) != Token.EOF) {
			ASTree t = bp.parse(lexer);
			if (!(t instanceof NullStmnt)) {
				Object r = ((BasicEvaluator.ASTreeEx) t).eval(env);
				System.out.println("=> " + r);
			}
		}
	}
}
