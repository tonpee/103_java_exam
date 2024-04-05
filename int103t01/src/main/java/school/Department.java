package school;

import java.util.Objects;

public class Department {
    private int code;
    private String title;

    public Department(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "department{" +
                "code=" + code +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return code == that.code && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, title);
    }
}
