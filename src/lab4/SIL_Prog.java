package lab4;
import java.io.IOException;
import java.util.*;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class SIL_Prog {
	public static void main(String args[]) throws IOException, RecognitionException
	{
		GrammarLexer lexer = new GrammarLexer(new ANTLRFileStream(args[0]));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GrammarParser parser = new GrammarParser(tokens);
		parser.program();
	}
}
