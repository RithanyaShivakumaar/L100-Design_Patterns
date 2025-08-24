package expressions;

/**
 * A TerminalExpression.
 * Represents plain text that requires no further interpretation.
 */
public class PlainTextExpression implements MarkdownExpression {
    private final String text;

    public PlainTextExpression(String text) {
        this.text = text;
    }

    @Override
    public String interpret() {
        // Plain text is interpreted as itself.
        return text;
    }
}