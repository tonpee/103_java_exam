package exam.base;

import java.util.Comparator;

public class ToCompare implements Comparable<ToCompare> { // implements Comparable so that two ToCompare objects can be compared by name
    private final int value;
    private final String name;

    public ToCompare(int v, String n) { value = v; name = n; }
    @Override public String toString() { return "ToCompare(" + value + ":" + name + ")"; }

    // implement this method so that two ToCompare objects can be compared by ###value####
    public static int compareByValue(ToCompare o1, ToCompare o2) {
        return o1.value - o2.value;
    }



    @Override
    public int compareTo(ToCompare o) {
        if (name == o.name) return 0;
        if (name == null) return 1;
        if (o.name == null) return -1;
        return name.compareTo(o.name);
    }
}
