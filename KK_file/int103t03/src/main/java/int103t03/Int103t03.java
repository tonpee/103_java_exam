package int103t03;

import company.*;
import util.Container;
import world.Person;

public class Int103t03 {

    public static void main(String[] args) {
        System.out.println("Hello World!\n\n");
//        testPerson();
//        testEmployee();
        testSorting();
    }
    static void testPerson() {
        Person p;
        try {
            p = new Person(null, null);
        } catch (Exception e) {
            System.out.println("new Person with null string.");
        }
        p = new Person("Somchai", "Humlek");
        System.out.println("Person: " + p);
        System.out.println("Name: " + p.getFirstName());
        p.setFirstName(null);
        System.out.println("Person: " + p);
        p.setFirstName("Somsak");
        System.out.println("Person: " + p);
    }
    static void testEmployee() {
        System.out.println("\n\nTest Employee");
        Person p = new Employee(10, "Somsak","Humlek", 10_000.00);
        Employee e = new Employee(100, "Somchai", "Humyai",20_000.00);
        System.out.println("Person: " + p);
        System.out.println("Employee: " + e);
        Staff s = new Staff(555, "Sompong", "Humhai",300.00, 10);
        System.out.println("Staff: " + s);
    }

    static void testSorting() {
//        Container<Person> c = new Container<>(10);
//        c.add(new Person("Somone", "humlek"));
//        c.add(new Person("Somtwo", "humlek"));
//        c.add(new Person("Somthree", "humlek"));
//        c.add(new Person("Somfour", "humlek"));
//        for (int i = 0; i < c.getCount(); i++) {
//            System.out.println("Person: " + c.get(i));
//        }
//        c.sort();
//        System.out.println("\nAfter sorting: ");
//        for (int i = 0; i < c.getCount(); i++) {
//            System.out.println("Person: " + c.get(i));
//        }

        Container<Employee> e = new Container<>(10);
        e.add(new Employee(4,"Somone", "humlek", 1000));
        e.add(new Employee(2,"Somtwo", "humlek", 2000));
        e.add(new Employee(3,"Somthree", "humlek", 3000));
        e.add(new Employee(1,"Somfour", "humlek", 4000));
        for (int i = 0; i < e.getCount(); i++) {
            System.out.println("Person: " + e.get(i));
        }
        e.sort(Employee.compareById);
//        e.sort((p, q) -> p.getId() - q.getId());
        System.out.println("\nAfter sorting: ");
        for (int i = 0; i < e.getCount(); i++) {
            System.out.println("Person: " + e.get(i));
        }

    }
}
