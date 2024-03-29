package inheritance;

import java.util.LinkedList;

public class Shop implements ReviewableThings {
    String name;
    double stars;
    LinkedList<Review> reviews = new LinkedList<>();

    public Shop(String name, double stars) {
        this.name = name;
        this.stars = stars;
    }

    @Override
    public void addReview(Review review) {
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
        this.stars = totalStars / reviews.size();    }

    @Override
    public String toString(){
        String shopInfo = String.format("Shop:\n%s\n%.1f Stars", this.name, this.stars);
        return shopInfo;
    }


    @Override
    public int aveDollars() {
        return 0;
    }
}
