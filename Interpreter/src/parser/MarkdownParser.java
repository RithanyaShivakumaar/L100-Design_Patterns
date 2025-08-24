package parser;

import expressions.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The Parser acts as the client that builds the Abstract Syntax Tree.
 * It scans the input text and creates the appropriate expression objects.
 */
public class MarkdownParser {

    public List<MarkdownExpression> parse(String text) {
        List<MarkdownExpression> expressions = new ArrayList<>();
        int i = 0;

        while (i < text.length()) {
            if (text.startsWith("**", i)) {
                // Find the closing "**"
                int closingIndex = text.indexOf("**", i + 2);
                if (closingIndex != -1) {
                    String content = text.substring(i + 2, closingIndex);
                    // The content inside bold can just be plain text for this simple example
                    expressions.add(new BoldExpression(new PlainTextExpression(content)));
                    i = closingIndex + 2;
                } else {
                    // No closing tag found, treat as plain text
                    expressions.add(new PlainTextExpression(text.substring(i)));
                    break;
                }
            } else if (text.startsWith("*", i)) {
                // Find the closing "*"
                int closingIndex = text.indexOf("*", i + 1);
                if (closingIndex != -1) {
                    String content = text.substring(i + 1, closingIndex);
                    expressions.add(new ItalicExpression(new PlainTextExpression(content)));
                    i = closingIndex + 1;
                } else {
                    // No closing tag found, treat as plain text
                    expressions.add(new PlainTextExpression(text.substring(i)));
                    break;
                }
            } else {
                // Find the next special character or end of string
                int nextBold = text.indexOf("**", i);
                int nextItalic = text.indexOf("*", i);
                int endOfPlainText = text.length();

                if (nextBold != -1) endOfPlainText = Math.min(endOfPlainText, nextBold);
                if (nextItalic != -1) endOfPlainText = Math.min(endOfPlainText, nextItalic);

                String content = text.substring(i, endOfPlainText);
                expressions.add(new PlainTextExpression(content));
                i = endOfPlainText;
            }
        }
        return expressions;
    }
}