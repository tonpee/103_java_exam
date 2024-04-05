import util.Container;
import world.Person;
import company.*;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Objects;

public class int103W02 {
    public static void main(String[] args) {
//        testPerson();
//        testEmployee();
//        testStaff();
        testCollection();



//        try {
//            System.out.println("try");
//            String test = null;
//            test = Objects.requireNonNull(test, "kuy, It's null");
//            System.out.println(test + " <= print test");
//            System.out.println("tonpee");
//        } catch (Exception e) {
//            System.out.println("catch: " + e.getMessage());
//        }
//
//        System.out.println("tonpee out of try catch");
    }

    static void testBox() {
        
    }

    static void testCollection() {
        Container<Person> c = new Container<>(3);
        c.add(new Person("first"));
        c.add(new Employee("second", 2, 20000));
        c.add(new Staff("third", 30000, 3, 13));
        System.out.println("Container:" + c);
//        for (int i = 0; i < c.getCount(); i++) {

//            System.out.println("Name: " + ((Person) c.get(i)).getName() + " -> " + c.get(i).getClass().getSimpleName() );
//            Person o = c.get(i);
//            if (o.getClass().equals(Employee.class)) just second will sout
//            System.out.println("Name: " + o.getName());
            // way 1
//            if (o instanceof Employee e ) {
//                System.out.println("Id: " + e.getId() + " -> " + o.getClass().getSimpleName());
//            }

//            way 2
//            if (o instanceof Employee) {
//                System.out.println("Id: " + ((Employee) o).getId() + " -> " + o.getClass().getSimpleName());
//            }
//        }
        c.sort();
        System.out.println("After Sorting: " + c);
    }

    static void testPerson() {
        System.out.println("### Test Person ###");
        Person p;
        try {
            p = new Person(null);
            System.out.println("P: " + p);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        p = new Person("Somchai");
        System.out.println("Somchai:" + p);
        System.out.println("get name: " + p.getName());
        p.setName(null);
        System.out.println("after set name = null: " + p);
        p.setName("Somsak");
        System.out.println("after set name = Somsak: " + p);
    }

    static void testEmployee() {

        // Separation of concerns

        System.out.println("\n### Test Employee ###");
        // sdubstitutability
        Person p = new Employee("Somsak", 10, 20000.0);
        Employee e = new Employee("Somchai", 20, 10000);
        //จะเห็นว่าเราไม่ต้องสร้าง toString ใหม่แต่เราใช้ของ superClass
        System.out.println("Person: " + p);
        System.out.println("Employee: " + e);
    }

    static void testStaff() {
        Staff s = new Staff("Somsak", 20000, 30, 10);
        System.out.println("Staff: " + s);

    }
}
