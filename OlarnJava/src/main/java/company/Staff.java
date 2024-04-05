package company;

import java.util.Objects;

public class Staff extends Employee {
    private final int days;

    public Staff(String name,double salary ,int id, int days) {
        super(name, id, salary);
        if (days <= 0) throw new IllegalArgumentException("days can not less than or equal 0");
        this.days = days;
    }

    @Override
    protected String getContent() {
        return super.getContent() + ", day = " + days;
    }
    public int getDays() {
        return days;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Staff staff)) return false;
        if (!super.equals(o)) return false;
        return days == staff.days;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), days);
    }
}