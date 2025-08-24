import expressions.MarkdownExpression;
import parser.MarkdownParser;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String markdown = "This is a sample text with **bold** and *italic* elements.";
        System.out.println("Original Markdown: " + markdown);
        
        // 1. The client (our Main class) uses the Parser to build the expression tree.
        MarkdownParser parser = new MarkdownParser();
        List<MarkdownExpression> expressions = parser.parse(markdown);

        // 2. We use a StringBuilder to build the final output.
        StringBuilder htmlOutput = new StringBuilder();

        // 3. The client iterates through the expressions and calls interpret() on each one.
        // This is where the core of the Interpreter pattern executes.
        for (MarkdownExpression expr : expressions) {
            htmlOutput.append(expr.interpret());
        }

        System.out.println("Converted HTML:    " + htmlOutput.toString());
        
        System.out.println("\n--- Another Example ---");
        String markdown2 = "**Important:** Please review the *final draft* immediately.";
        System.out.println("Original Markdown: " + markdown2);
        
        List<MarkdownExpression> expressions2 = parser.parse(markdown2);
        StringBuilder htmlOutput2 = new StringBuilder();
        for (MarkdownExpression expr : expressions2) {
            htmlOutput2.append(expr.interpret());
        }
        System.out.println("Converted HTML:    " + htmlOutput2.toString());
    }
}