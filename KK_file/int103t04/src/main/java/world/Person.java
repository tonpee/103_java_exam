package world;

import java.util.Objects;

public class Person {
    private String name;
    public Person(String name) {
        this.name = Objects.requireNonNull(name, "Name cannot be null.");
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = Objects.requireNonNullElse(name, this.name); }
    protected String getContent() { return "name="+name; }
    @Override
    public String toString() { return getClass().getSimpleName()+"("+getContent()+")"; }

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
}
