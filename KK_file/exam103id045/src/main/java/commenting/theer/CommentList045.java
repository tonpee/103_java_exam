package commenting.theer;

import util.theer.CommentPlus045;
import util.theer.Grade045;

import javax.swing.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CommentList045 implements CommentablePlus045 {
    private final LinkedList<CommentPlus045> comments045;

    public CommentList045(LinkedList<CommentPlus045> comments045) {
        this.comments045 = new LinkedList<>();
    }

    @Override
    public boolean addComment(String message, Grade045 grade) {
        if (message != null && !message.isBlank() && grade != null) {
            comments045.add(new CommentPlus045(message, grade));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removeComment(String message) {
        if (message != null) {
            return false;
        }
    }

    @Override
    public Iterator<CommentPlus045> iterator() {
        return null;
    }

    @Override
    public Collection<String> extract(Grade045 grade) {
        return null;
    }

    @Override
    public void sort() {

    }
}
