package util;

public interface SimpleIterable<T> { // ตัวนำท่องเทีี่ยว
    public SimpleIterable<T> simpleIterator();
    default SimpleIterator<T> simpleIterator(Condition<T> c) {
        throw new UnsupportedOperationException();
    }

}
