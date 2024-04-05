package exam.unit;

import exam.base.OrgUnit;

public class Department extends OrgUnit {

    private School school;

    public Department(int code, String name, School school, String logging) {
        super(code, name, logging);
        this.school = school;
    }


    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
