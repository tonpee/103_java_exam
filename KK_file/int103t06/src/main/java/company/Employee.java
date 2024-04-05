package company;
import java.util.Objects;
import world.Person;

public class Employee extends Person {
    private final int id;
    public Employee(int id, String name) {
        super(name);
        if (id<=0) throw new IllegalArgumentException("Id must be positive.");
        this.id = id;
    }
    public int getId() { return id; }
    @Override
    protected String getContent() { return "id:" + id + "," + super.getContent(); }
    @Override
    public int hashCode() { return Objects.hash(super.hashCode(),id); }
    @Override
    protected boolean contentEquals(Object o) {
        return super.contentEquals(o) && this.id == ((Employee)o).id;
    }

}
