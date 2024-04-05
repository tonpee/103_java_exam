package util;

@FunctionalInterface
public interface Condition<T> {
    public boolean isTrue(T t);
    default boolean isFalse(T t) { return !isTrue(t); }
}
