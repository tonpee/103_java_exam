package util.theer;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Predicate;

public class CommentPlus045 extends Comment {
    private final Grade045 grade;
    public static final Comparator<CommentPlus045> GRADE045_COMPARATOR =
            (o1, o2) -> o1.grade.compareTo(o2.grade);
    public static Predicate<CommentPlus045> match045(Grade045 cp2) {
        return (cp1) -> cp1.equals(cp2);
    }
    public CommentPlus045(String message, Grade045 grade) {
        super(message != null ? message : "NO_COMMENT");
        this.grade = grade != null ? grade : Grade045.NONE;
    }

    @Override
    protected String getContent() {
        return super.getContent() + " ," + (grade != null ? grade : null);
    }
}
