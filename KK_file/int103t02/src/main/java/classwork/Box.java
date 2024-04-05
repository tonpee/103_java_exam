package classwork;

import util.Container;

public class Box<T> extends Container<T> {
    public Box(int n) {
        super(n);
    }

    public T remove(T o) {
        for (int i = 0; i < super.getCount(); i++) {
            if (super.oa[i].equals(o)) {
                int count = super.getCount() - 1;
                T temp = super.oa[i];
                super.oa[i] = super.oa[count - 1];
                super.oa[count - 1] = null;
                super.decrementCount(); // Assuming there is a method to decrement the count
                return temp;
            }
        }
        return null;
    }
}
