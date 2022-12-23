import input.Lexeme;
import input.LexemeBuffer;
import input.StrScanner;
import java.util.List;

import static input.StrParser.expr;
import static input.StrParser.search;

public class Main {
    public static void main(String[] args) {
        StrScanner strScanner = new StrScanner();
        String output = strScanner.strScanner();
        List<Lexeme> lexemes = search(output);
        LexemeBuffer lexemeBuffer = new LexemeBuffer(lexemes);
        System.out.println(expr(lexemeBuffer));
    }
}