package world;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = Objects.requireNonNull(firstName, "firstName cannot be null.");
        this.lastName = Objects.requireNonNull(lastName, "lastName cannot be null");
    }
    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = Objects.requireNonNullElse(lastName, this.lastName); }

    public void setFirstName(String firstName) { this.firstName = Objects.requireNonNullElse(firstName, this.firstName); }

    protected String getContent() { return "name="+ firstName + ", lastName=" + lastName ; }
    @Override
    public String toString() { return getClass().getSimpleName()+"("+getContent()+")"; }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Person person)) return false;
//        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
        return this == o || (o != null && getClass() == o.getClass() && contentEquals(o));
    }

    protected boolean contentEquals(Object o) {
        return Objects.equals(this.firstName, ((Person) o).firstName) && Objects.equals(this.lastName, ((Person) o).lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }


    @Override
    public int compareTo(Person o) {
        return firstName.compareTo((o).firstName);
    }

    public static int compare(Person p, Person q) { return q.firstName.compareTo(p.firstName); }


}
