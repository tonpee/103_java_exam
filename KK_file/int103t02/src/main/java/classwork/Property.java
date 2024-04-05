package classwork;

public class Property extends Asset {

    private String location;

    public Property(String name, double value, String location) {
        super(name, value);
        if (location != null) { this.location = location; }
    }

    @Override
    protected String getContent() {
        return super.getContent() + ", location=" + location;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + getContent() + ")";
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
