package exam.base;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class ToIterate<T> implements Iterable<T> { // implements Iterable so that ToIterate can be iterated
    private final T[] internal;
    private int modCount;

    public static final <T> ToIterate<T> of(T ... ts) {
        T[] array = (T[]) new Object[ts.length];
        System.arraycopy(ts, 0, array, 0, ts.length);
        return new ToIterate(array);
    }

    private ToIterate(T[] ts) { internal = ts; }

    @Override
    public Iterator iterator() {
        return new Iterator<T> () {
            private int cur = 0;
            private int itModCount = modCount;
            @Override
            public boolean hasNext() {
//                if (cur == count) return false;
                if (itModCount != modCount) throw new ConcurrentModificationException();
                return cur < internal.length;
            }

            @Override
            public T next() {
                if (itModCount != modCount) throw new ConcurrentModificationException();
                return internal[cur++];
            }
        };
    }
}
