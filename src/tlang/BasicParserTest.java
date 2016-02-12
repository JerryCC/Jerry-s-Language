package tlang;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.StringReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import tlang.ast.ASTree;

public class BasicParserTest {
	
	BasicParser bp;

	@Before
	public void setUp() throws Exception {
		bp = new BasicParser();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testSingleIdentifier() throws ParseException {
		Lexer l = new Lexer(new StringReader("name=0;\n"));
		ASTree ast = bp.parse(l);
		assertThat(ast, is(notNullValue()));
	}
	
	
	@Test
	public void testStatement() throws ParseException {
		Lexer l = new Lexer(new StringReader("even=1;"));
		ASTree ast = bp.parse(l);
		//assertThat(ast, is(notNullValue()));
		System.out.println(ast);
	}


}