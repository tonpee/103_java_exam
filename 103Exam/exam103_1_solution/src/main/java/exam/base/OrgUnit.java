package exam.base;

import exam.unit.Department;
import exam.unit.School;

public abstract class OrgUnit implements Loggable {
    private int code;
    private String name;
    private String logging;

    public OrgUnit(int code, String name, String logging) {
        this.code = code;
        this.name = name;
        this.logging = "";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogging() {
        return logging;
    }

    public void setLogging(String logging) {
        this.logging = logging;
    }

    @Override
    public String getLog() {
        return null;
    }

    @Override
    public void clearLog() {
    }
}
