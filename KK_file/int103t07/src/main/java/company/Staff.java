package company;
import java.util.Objects;
public class Staff extends Employee {
    private int days;
    public Staff(int id, String name, int days) {
        super(id, name);
        if (days <= 0) throw new IllegalArgumentException("Days must be positive.");
        this.days = days;
    }
    public int getDays() { return days; }
    public void setDays(int days) { if (days > 0) this.days = days; }
    @Override
    protected String getContent() { return super.getContent() + ",days:" + days; }
    @Override
    public int hashCode() { return Objects.hash(super.hashCode(),days); }
    @Override
    protected boolean contentEquals(Object o) {
        return super.contentEquals(o) && this.days == ((Staff) o).days;
    }
}
