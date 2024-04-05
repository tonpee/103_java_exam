package world;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        if (name == null) throw new IllegalArgumentException("Name can not be Null");
        this.name = name;
    }

//    public Person(String name) {
//        this.name = Objects.requireNonNull(name, "name cannot be null."); ถ้า ได้ค่า null จะทำตาม parameter หลัง ถ้่าไม่ ก็ parameter แรก
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +  "(" + getContent() + ")";
    }

    protected String getContent() {
        return "name " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}
