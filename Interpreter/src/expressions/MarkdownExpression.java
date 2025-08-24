package expressions;

/**
 * The AbstractExpression interface.
 * All expression classes, whether terminal or non-terminal, will implement this.
 */
public interface MarkdownExpression {
    /**
     * Interprets the expression and returns the HTML representation.
     * @return The resulting HTML string.
     */
    String interpret();
}