package company;

import world.Person;

public class Employee extends Person {
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        super(name);
        if (id <= 0 | salary <= 0.0) throw new IllegalArgumentException("Id can not equal or less than zero");
        this.id = id;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) this.salary = salary;
    }
    //annotation -> override
    @Override
    protected String getContent() {
        return super.getContent() + ", " + "id = " + id + ", salary = "+ salary;
    }

}
