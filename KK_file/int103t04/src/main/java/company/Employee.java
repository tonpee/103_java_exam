package company;

import world.Person;

public class Employee extends Person {
    private int id;
    private double salary;
    public Employee(int id, String name, double salary) {
        super(name);
        if (id <= 0 | salary <= 0.0) 
            throw new IllegalArgumentException("id and salary must be more than zero.");
        this.id = id;
        this.salary = salary;
    }
    public int getId() { return id; }
    public double getSalary() { return salary; }
    public void setId(int id) { if (id>0) this.id = id; }
    public void setSalary(double salary) { if (salary>0.0) this.salary = salary; }
    @Override
    protected String getContent() {
        return "id="+id+ ","+ super.getContent() + ",salary="+salary;
    }
    @Override
    public boolean equals(Object o) { return super.equals(o) && salary == ((Employee) o).salary; }
}
