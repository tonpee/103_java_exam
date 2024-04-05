package util;

import java.awt.image.PackedColorModel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Container<T> implements Iterable<T> {
    private T[] arr;
    private int count;
    private int modCount = 0;
    public Container(int n) {
        if (n<=0) throw new IllegalArgumentException("initial size must be positive.");
        arr = (T[]) new Object[n];
        count = 0;
    }
    private boolean isValidIndex(int i) { return i<count && i>=0; }
    public T get(int i) { return isValidIndex(i) ? arr[i] : null; }
    public void set(int i, T o) {
        if (isValidIndex(i) && o != null) arr[i] = o;
        modCount++;
    }
    public int getCount() { return count; }
    public boolean add(T o) {
        if (o == null) return false;
        if (count == arr.length) arr = Arrays.copyOf(arr, count<<1);
        arr[count++] = o;
        modCount++;
        return true;
    }
    public T remove(T o) {
        if (o == null) return null;
        T result;
        for (int i = 0; i < count; i++) {
            if (o.equals(arr[i])) {
                result = arr[i];
                arr[i] = arr[--count];
                arr[count] = null;
                modCount++;
                return result;
            }
        }
        return null;
    }
    public void sort() {
        modCount++;
        Arrays.sort(arr, 0, count);
    }
    public void sort(Comparator<T> c) {
        modCount++;
        Arrays.sort(arr, 0, count, c);
    }

    //fail fast ______________________________________________________________________________________________
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T> () {
            private int cur = 0;
            private int itModCount = modCount;
            @Override
            public boolean hasNext() {
//                if (cur == count) return false;x
                if (itModCount != modCount) throw new ConcurrentModificationException();
                return cur < count;
            }

            @Override
            public T next() {
                if (itModCount != modCount) throw new ConcurrentModificationException();
                return arr[cur++];
            }
        };
    }
    //fail save
//    @Override
//    public Iterator<T> iterator() {
//        return new Iterator<T> () {
//            private T[] temp = Arrays.copyOf(arr,count);
//            private int c = count;
//            private int cur = 0;
//            @Override
//            public boolean hasNext() {
////                if (cur == count) return false;
//                return cur < c;
//            }
//
//            @Override
//            public T next() {
//                return temp[cur++];
//            }
//        };
//    }
//    @Override
//    public Iterator<T> iterator() {
//        return new Iterator<T> () {
//            private int cur = 0;
//            @Override
//            public boolean hasNext() {
////                if (cur == count) return false;
//                return cur < count;
//            }
//
//            @Override
//            public T next() {
//                return arr[cur++];
//            }
//        };
//    }
}