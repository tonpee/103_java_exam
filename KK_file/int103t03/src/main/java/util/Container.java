package util;

import java.util.Arrays;
import java.util.Comparator;

public class Container<T> {
    private T[] arr;
    private int count;
    public Container(int n) {
        if (n <= 0) throw new IllegalArgumentException("initial size must be positive.");
        //ต้องเป็น Object ก่อนตอนสร้างเพราะจริงๆ มันก็เป็น Object
        arr = (T[]) new Object[n];
        count = 0;
    }
    private boolean isValidIndex(int i) { return i < count && i >= 0; }
    public T get(int i) { return isValidIndex(i) ? arr[i] : null; }
    public void set(int i, T o) {
        if (isValidIndex(i) && o != null) arr[i] = o;
    }
    public boolean add(T o) {
        if (o == null) return false;
        if (count == arr.length) arr = Arrays.copyOf(arr, count<<1);
        arr[count++] = o;
        return true;
    }
    public T remove(T o) {
        if (o == null) return null;
        T result = null;
        for (int i = 0; i < count; i++) {
            if (arr[i].equals(o)) {
                result = arr[i];
                arr[i] = arr[count];
                arr[--count] = null;
                return result;
            }
        }
        return result;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void sort() {
        Arrays.sort(arr, 0, count);
    }

    public void sort(Comparator<T> c) { Arrays.sort(arr, 0, count, c); }
}
