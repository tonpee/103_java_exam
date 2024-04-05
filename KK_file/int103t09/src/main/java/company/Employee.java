package company;

import java.util.Comparator;
import java.util.Objects;
import world.Person;

public class Employee extends Person {
    
    public final static Comparator<Employee> EMPLOYEE_COMPARATOR = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            int result = o1.compareTo(o2);
            if (result != 0) return result;
            return (int) (o1.salary - o2.salary);
        }
    };
    public final static Comparator<Employee> SALARY_COMPARATOR = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.salary - o2.salary);
        }
    };
    
    private final double salary;
    public Employee(int id, String name, double salary) {
        super(id, name); 
        this.salary = salary;
    }
    @Override
    protected String getContent() { return super.getContent() + ",salary:" + salary; }
    @Override
    public boolean equals(Object o) { return super.equals(o) && Objects.equals(salary,((Employee) o).salary); }
    @Override 
    public int hashCode() { return Objects.hash(super.hashCode(),salary); }
}
