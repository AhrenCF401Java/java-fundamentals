package inheritance;

import java.util.LinkedList;

public class Theater implements ReviewableThings{
    String name;
    double stars;

    LinkedList<Review> reviews = new LinkedList<>();
    LinkedList<Movie> movies = new LinkedList<>();


    public void addMovie(String title, String Genre, String rating, double length){
        Movie movie= new Movie();
    }

    public void removeMovie(String title){
        this.movies.remove(title);
    }



    @Override
    public void addReview(Review review, String authour) {
//        add it to reviews list
        reviews.add(review);
//       point the review to the restaurant
        review.businessName = this;
    }



    @Override
    public void howManyStarsIsThisReviewableThingReally() {
        double totalStars =0;
        for(Review review : reviews) {
            totalStars = totalStars + review.stars;
        }
        this.stars = totalStars / reviews.size();
    }



    @Override
    public int aveDollars() {
        return 0;
    }
}
