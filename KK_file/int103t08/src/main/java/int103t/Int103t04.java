package int103t;

import company.Employee;
import util.Container;

public class Int103t04 {

    public static void main(String[] args) {
        test1();
    }
    static void test1() {
        Container<Employee> cp = new Container<>(10);
        cp.add(new Employee(10,"Somsak",10.0));
        cp.add(new Employee(10,"Somchai",20.0));
        cp.add(new Employee(10,"Somchai",8.0));
        cp.add(new Employee(5,"Sompong",30.0));
        for (int i = 0; i < cp.getCount(); i++) {
            System.out.println("Employee .. " + cp.get(i));
        }
        Employee e = new Employee(-1,null,-10.0);
        cp.sort(Employee.SALARY_COMPARATOR);
        System.out.println("After sorting");
        for (int i = 0; i < cp.getCount(); i++) {
            System.out.println("Employee .. " + cp.get(i));
        }
    }
}
