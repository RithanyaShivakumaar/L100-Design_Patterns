package expressions;

/**
 * A NonTerminalExpression for italic text.
 * It contains another expression that it wraps with <em> tags.
 */
public class ItalicExpression implements MarkdownExpression {
    private final MarkdownExpression content;

    public ItalicExpression(MarkdownExpression content) {
        this.content = content;
    }

    @Override
    public String interpret() {
        // Interpret the inner content and wrap it with HTML emphasis (italic) tags.
        return "<em>" + content.interpret() + "</em>";
    }
}