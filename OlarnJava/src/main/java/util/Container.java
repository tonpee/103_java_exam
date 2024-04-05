package util;

import company.Employee;
import world.Person;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class Container<T>  {
    private T[] oa;
    private int count;

    public Container(int n) {
        if (n <= 0) throw new IllegalArgumentException("size must be > 0");
        oa = (T[]) new Object[n];
        count = 0;
    }

    public int getCount() { return count; }

    public T get(int i) {
        if (i >= count) throw new IndexOutOfBoundsException("Over");
        return oa[i];
    }

    public void set(int i, T o) {
        if (i >= count) throw new IndexOutOfBoundsException("Over");
        oa[i] = Objects.requireNonNull(o, "object cannot be null");
    }

    public T add(T o) {
        Objects.requireNonNull(o, "Object can not be null");
        if (count == oa.length) expand();
        oa[count++] = o;
        return o;
    }

    private void expand() {
//        System.arraycopy();
        Arrays.copyOf(oa, count<<1);
    }

    @Override
    public String toString() {
        StringJoiner j = new StringJoiner("\n", "Container(\n", "\n)");
        for (int i = 0; i < oa.length; i++) {
            j.add(oa[i].toString());
        }
        return j.toString();
    }

    public void sort() {
        Arrays.sort(oa, 0, count);
    }
}
