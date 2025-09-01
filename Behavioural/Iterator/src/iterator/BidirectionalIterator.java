package iterator;

public interface BidirectionalIterator<T> extends Iterator<T> {
    boolean hasPrevious();
    T previous();
}