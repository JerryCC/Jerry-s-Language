package tlang;
import tlang.ast.*;
import java.util.HashSet;
import static tlang.Parser.rule;
import tlang.Parser.Operators;

public class BasicParser {
	HashSet<String> reserved = new HashSet<String> ();
	Operators opterators = new Operators();
	Parser expr0 = rule();

	Parser primary = rule(PrimaryExpr.class)
					.or(rule().sep("(").ast(expr0).sep(""),
						rule().number(NumberLiteral.class),
						rule().identifier(Name.class, reserved),
						rule().string(StringLiteral.class));
	Parser factor = rule().sep("-").ast(primary).or
}
