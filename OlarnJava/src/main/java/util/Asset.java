package util;

import java.util.Objects;

public class Asset {
    private String name;
    private double value;

    public Asset(String name, double value) {
        this.name = name;
        this.value = value;
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

    public String toString() {
        return "Asset: " + getContent();
    }

    public String getContent() {
        return "name: " + name + ", value: " + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asset asset)) return false;
        return Double.compare(value, asset.value) == 0 && Objects.equals(name, asset.name);
    }
}
