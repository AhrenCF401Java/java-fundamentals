package inheritance;

import java.util.LinkedList;

public interface ReviewableThings {
//    LinkedList<Review> reviews = new LinkedList<>();
    public void addReview(Review review,String author);
    public void howManyStarsIsThisReviewableThingReally();
    public String toString();
    public int aveDollars();
}


