package company;

public class Staff extends Employee {
    private int days;
    public Staff(int id, String name, double salary, int days) {
        super(id, name, salary);
        if (days <= 0) 
            throw new IllegalArgumentException("days must be > 0.");
        this.days = days;
    }
    @Override
    protected String getContent() {
        return super.getContent() + ",days=" + days;
    }
}
