package commenting.theer;

import util.theer.CommentPlus045;
import util.theer.Grade045;

import java.util.Collection;
import java.util.Iterator;

public interface CommentablePlus045 extends Commentable {
    default String inspect045() {
        StringBuilder sb = new StringBuilder();
        Iterator<CommentPlus045> commentIterator = iterator(); //get iterator from superclass

        while (commentIterator.hasNext()) {
            sb.append(commentIterator.next());
        }
        return sb.toString();
    }

}
