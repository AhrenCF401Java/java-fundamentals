package inheritance;

import java.util.LinkedList;

public class Movie implements ReviewableThings{
    String title;
    String Genre;
    String rating;
    double length;
    double stars;
    LinkedList<Review> reviews = new LinkedList<>();

    @Override
    public void addReview(Review review) {

    }

    @Override
    public void howManyStarsIsThisReviewableThingReally() {

    }

    @Override
    public int aveDollars() {
        return 0;
    }
}
