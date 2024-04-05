package int103t02;

import company.*;
import util.Container;
import world.Person;

public class Int103t02 {

    public static void main(String[] args) {
//        testPerson();
//        testEmployee();
        testCollection();
    }
    static void testCollection() {
        var c = new Container<Person>(3);
        c.add(new Person("First"));
        c.add(new Employee(10,"Second",100.0));
        c.add(new Staff(100,"Third",1000.0,2));
        System.out.println("Container: " + c);
        for (int i = 0; i < c.getCount(); i++) {
            Person o = c.get(i);
            //if (o.getClass().equals(Employee.class)) {
            System.out.println("Name: " + o.getName());
            if (o instanceof Employee e) {
               System.out.println("Id: " + e.getId());
            }
        }
    }
    static void testPerson() {
        Person p;
        try {
            p = new Person(null);
        } catch (Exception e) {
            System.out.println("new Person with null string.");
        }
        p = new Person("Somchai");
        System.out.println("Person: " + p);
        System.out.println("Name: " + p.getName());
        p.setName(null);
        System.out.println("Person: " + p);
        p.setName("Somsak");
        System.out.println("Person: " + p);
    }
    static void testEmployee() {
        Person p = new Employee(10, "Somsak", 10_000.00);
        Employee e = new Employee(100, "Somchai", 20_000.00);
        System.out.println("Person: " + p);
        System.out.println("Employee: " + e);
        Staff s = new Staff(555, "Sompong", 300.00, 10);
        System.out.println("Staff: " + s);
    }
}
