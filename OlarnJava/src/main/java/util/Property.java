package util;

import java.util.Objects;

public class Property {
    private String location;

    public Property(String location) {
        this.location = Objects.requireNonNull(location, "location can not be null");
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Property property)) return false;
        return Objects.equals(location, property.location);
    }

    @Override
    public String toString() {
        return "Property{ " + getContent() + " }";
    }

    public String getContent() {
        return "location: " + location;
    }
}