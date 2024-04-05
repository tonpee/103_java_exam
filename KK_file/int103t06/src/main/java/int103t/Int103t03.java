package int103t;

import company.Employee;
import util.Container;
import world.Person;

public class Int103t03 {

    public static void main(String[] args) {
        //testPerson();
        testSorting();
    }
    static void testPerson() {
        Person p = new Person("Somsak");
        System.out.println("Person: " + p);
    }
    static void testSorting() {
        Container<Employee> c = new Container<>(10);
        c.add(new Employee(20,"Somsak"));
        c.add(new Employee(40,"Sompong"));
        c.add(new Employee(15,"Somsri"));
        c.add(new Employee(30,"Somchai"));
        for (int i = 0; i < c.getCount(); i++) {
            System.out.println("Person: " + c.get(i));
        }
        c.sort();
        System.out.println("After sorting: ");
        for (int i = 0; i < c.getCount(); i++) {
            System.out.println("Person: " + c.get(i));
        }
        
    }

}
