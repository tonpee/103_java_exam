package util;

public class Box<T> extends Container<T> {
    public Box(int n) {
        super(n);
    }

    public T remove(T t) {
        T foundItem = null;
        for (int i = 0; i < this.getCount(); i++) {
            if (t == null) throw new IllegalArgumentException("Can not remove null Object");
            if (this.get(i).equals(t)) {
                foundItem = this.get(i);
                this.set(i, foundItem);
                this.set(getCount(), null);
                break;
            }
        }
        return foundItem;
    }
}
