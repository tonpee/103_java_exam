package commenting.theer;

import util.theer.CommentPlus045;
import util.theer.Grade045;

import java.util.Collection;
import java.util.Iterator;

// student id: 99999999999
// student name: kriengkrai porkaew
public interface Commentable extends Iterable<CommentPlus045> {
    default boolean addComment(String message) { return addComment(message, null); }
    boolean addComment(String message, Grade045 grade);
    boolean removeComment(String message);
    Iterator<CommentPlus045> iterator();
    Collection<String> extract(Grade045 grade);
    void sort();
}