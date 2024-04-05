package int103t;

import company.Employee;
import util.Container;
import world.Person;

import java.util.Arrays;
import java.util.Comparator;

public class Int103t03 {

    public static void main(String[] args) {
        test1();
//        String a = null;
//        String b = null;
//        System.out.println(a == b);
//        test2();
    }

    static void test1() {
        Container<Employee> cp = new Container<Employee>(10);
        cp.add(new Employee(10, "Somsak", 10.0));
        cp.add(new Employee(10, "Somchai", 20.0));
        cp.add(new Employee(10, "Somchai", 8.0));
        cp.add(new Employee(5, "Sompong", 30.0));

//        for (int i = 0; i < cp.getCount(); i++) {
//            System.out.println("Employee .." + cp.get(i));
//        }
        // การที่เราจะทำ for each กับ Container ได้เราต้องไป implement iterable และสร้าง iterator method
        for (var v : cp) {
            System.out.println("Employee .." + v);
        }

        Employee e = new Employee(-1, null, -10.0);
        cp.sort(Employee.EMPLOYEE_COMPARATOR);
        System.out.println("\nAfter sort: ");
//        for (int i = 0; i < cp.getCount(); i++) {
//            System.out.println("Person .." + cp.get(i));
//        }
        System.out.println("Iterator ...");
        var it = cp.iterator();
        while (it.hasNext()) {
            System.out.println("Employee: " + it.next());
        }
    }

    static void test2() {
        Employee[] ea = new Employee[10];
        ea[1] = new Employee(10, "SomPong", 0.0);
        ea[5] = new Employee(80, "Somsri", 50.0);
        ea[7] = new Employee(60, "Somsak", 30.0);
        ea[3] = new Employee(40, "Somchai", 70.0);
        //method refference comparing
        //case insensitive ช่วยให้ไม่สน case sensitive
        Arrays.sort(ea, Comparator.nullsLast(Comparator.comparing(Person::getName, String.CASE_INSENSITIVE_ORDER)));
        for (var v: ea ) {
            if (v == null) {
                System.out.println("NULL");
            } else {
                System.out.println(v);
            }
        }
        // ทำเพื่อให้ ตัวที่เป็น null ไปอยู่ข้างหลังด้วย Comparator.nullsLast()
//        Arrays.sort(ea, Comparator.nullsLast(Employee.EMPLOYEE_COMPARATOR));
//        for (int i = 0; i < ea.length; i++) {
//            if (ea[i] == null) System.out.println("NULL");
//            else {
//                System.out.println(ea[i]);
//            }
//        }
    }

}
