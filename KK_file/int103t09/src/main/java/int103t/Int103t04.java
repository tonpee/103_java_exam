package int103t;

import company.Employee;
import java.util.Arrays;
import java.util.Comparator;
import util.Container;

public class Int103t04 {

    public static void main(String[] args) {
        test1();
        //test2();
    }
    static void test2() {
        Employee[] ea = new Employee[10];
        ea[1] = new Employee(10,"SomPong",90.0);
        ea[5] = new Employee(80,null,50.0);
        ea[7] = new Employee(60,"Somsak",30.0);
        ea[3] = new Employee(40,"Somchai",70.0);
        Arrays.sort(ea,Comparator.nullsLast(
                Comparator.comparing(Employee::getName,
                        Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER))));
        for (var v : ea) {
            if (v == null) 
                System.out.println("NULL");
            else 
                System.out.println(v);
        }
    }
    static void test1() {
        Container<Employee> cp = new Container<>(10);
        cp.add(new Employee(10,"Somsak",10.0));
        cp.add(new Employee(10,"Somchai",20.0));
        cp.add(new Employee(10,"Somchai",8.0));
        cp.add(new Employee(5,"Sompong",30.0));
        for (var v : cp) {
            System.out.println("Employee .. " + v);
        }
        cp.sort(Employee.EMPLOYEE_COMPARATOR);
        System.out.println("After sorting by EMPLOYEE");
        for (var v : cp) {
            System.out.println("Employee .. " + v);
        }
        cp.sort(Employee.SALARY_COMPARATOR);
        System.out.println("After sorting by SALARY");
        for (var v : cp) {
            System.out.println("Employee .. " + v);
        }
        System.out.println("Iterator ...");
        var it = cp.iterator();
        while (it.hasNext()) {
            System.out.println("Employee: " + it.next());
        }
    }
}
