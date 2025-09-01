package expressions;

/**
 * A NonTerminalExpression for bold text.
 * It contains another expression that it wraps with <strong> tags.
 */
public class BoldExpression implements MarkdownExpression {
    private final MarkdownExpression content;

    public BoldExpression(MarkdownExpression content) {
        this.content = content;
    }

    @Override
    public String interpret() {
        // Interpret the inner content and wrap it with HTML bold tags.
        return "<strong>" + content.interpret() + "</strong>";
    }
}