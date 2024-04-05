package world;

import java.util.Objects;

public class Person implements Comparable<Person> {
   private String name;

   public Person(String name) { 
       this.name = Objects.requireNonNull(name, "Name cannot be null."); 
   }
   public String getName() { return name; }
   public void setName(String name) { if (name!=null) this.name = name; }
   @Override
   public String toString() {
      return getClass().getSimpleName() + "{" + getContent() + "}";
   }
   protected String getContent() { return "name:\"" + name + "\""; }
   @Override
   public int hashCode() { return Objects.hashCode(this.name); }
   @Override
   public boolean equals(Object o) {
      return this == o || (o != null && getClass() == o.getClass() && contentEquals(o));
   }
   protected boolean contentEquals(Object o) {
      return Objects.equals(this.name,((Person)o).name);
   }

    @Override
    public int compareTo(Person o) { return o.name.compareTo(name); }

}