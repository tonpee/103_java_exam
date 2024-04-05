package classwork;

import java.util.Objects;

public class Asset {
    private String name;
    private double value;

    public Asset(String name, double value) {
        if (name == null || value <= 0.0) throw new IllegalArgumentException("name and value is required");
        this.name = name;
        this.value = value;
    }

    protected String getContent() {
        return "name=" + name + ", value=" + value;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(" + getContent() + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}