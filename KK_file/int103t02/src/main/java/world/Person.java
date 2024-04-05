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
}
