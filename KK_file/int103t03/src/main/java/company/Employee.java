package company;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Predicate;

import world.Person;

import javax.net.ssl.CertPathTrustManagerParameters;

public class Employee extends Person {
    private int id;
    private double salary;

//    public static Comparator<Employee> compareById =
//            new Comparator<Employee>() {
//                public int compare(Employee p, Employee q) {return p.id = q.id;}
//            };
    //Anonymous class
    public static Comparator<Employee> compareById =
        new Comparator<Employee>() {
            public int compare(Employee p, Employee q) { return p.id - q.id; }
        };
//        (p,q) -> p.id - q.id;


    public Employee(int id, String firstName, String lastName,double salary) {
        super(firstName, lastName);
        if (id <= 0 | salary <= 0.0) 
            throw new IllegalArgumentException("id and salary must be more than zero.");
        this.id = id;
        this.salary = salary;
    }


    public int getId() { return id; }
    public double getSalary() { return salary; }
    public void setId(int id) { if (id>0) this.id = id; }
    public void setSalary(double salary) { if (salary>0.0) this.salary = salary; }
    protected String getContent() {
        return "id="+id+ ","+ super.getContent() + ",salary="+salary;
    }

    @Override
    protected boolean contentEquals(Object o) {
        return super.contentEquals(o) && this.id == ((Employee) o).id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, salary);
    }
//
    @Override
    public int compareTo(Person o) {
        if(!(o instanceof Employee other)) return super.compareTo(o);

        return id - other.id;
    }

//    @Override
//    public int compareTo(Employee e) {
//        return 0;
//    }

    public static Comparator<Employee> CompareById = new Comparator<Employee>() {
        public int compare(Employee p, Employee q) { return q.id - p.id; }
    };
}


