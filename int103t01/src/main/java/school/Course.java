package school;

import world.Student;

public class Course {
    private int code;
    private String title;
    private Student[] attendants;  // course มองเห็น student เพราะ student เป็น public

    public int getFirstStudentId(){
        return attendants[0].getId();
    }

}