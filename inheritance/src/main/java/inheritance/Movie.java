package inheritance;

import java.util.LinkedList;

public class Movie implements ReviewableThings{
    String title;
    String genre;
    String rating;
    double length;
    double stars;
    Theater theater;
    LinkedList<Review> reviews = new LinkedList<>();

    public Movie(String title, String genre, String rating, double length, double stars, Theater theater) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.length = length;
        this.stars = stars;
        this.theater = theater;
    }


    @Override

    public void addReview(Review review) {
        reviews.add(review);
        review.businessName = this;
    }

    @Override
    public void howManyStarsIsThisReviewableThingReally() {
        double totalStars =0;
        for(Review review : reviews) {
            totalStars = totalStars + review.stars;
        }
        Math.round(totalStars / reviews.size());
    }

    @Override
    public int aveDollars() {
        return 0;
    }
}
