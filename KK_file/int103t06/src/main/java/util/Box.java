package util;

import java.util.Comparator;

public interface Box<T> extends SimpleIterator<T> {
    public boolean append(T t);
    public T getAt(int i);
    public T get(Condition<T> condition);
    public T replaceAt(int i, T t);
    public T remvoeAt(int i);
//    public SimpleIterator<T> simpleIterator();
    public void sort(Comparator<T> comparator);
}
