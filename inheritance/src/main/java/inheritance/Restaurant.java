package inheritance;

import java.util.LinkedList;

import static java.lang.Math.*;

public class  Restaurant implements ReviewableThings {
    String name;
    double stars;
    int dollars;
    LinkedList<Review> reviews = new LinkedList<>();

    public Restaurant(String name, double stars, int dollars) {
        this.name = name;
        this.stars = stars;
        this.dollars = dollars;
    }

//    --------------------------------- Implemented Interface Methods-------------------------------      //
    @Override
    public void addReview(Review  review) {
//         add it to reviews list
        reviews.add(review);
//        point the review to the restaurant
        review.businessName = this;
    }

    @Override
//  https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
//  used above to learn how to round a double to certian # of decimal places
    public void howManyStarsIsThisBusinessReally(){
        double totalStars =0;
        for(Review review : reviews) {
            totalStars = totalStars + review.stars;
        }
         Math.round(totalStars / reviews.size());
    }

    @Override
    public String toString() {
        String restaurantInfo = String.format("Restaurant:\n%s\n%.1f Stars\n%d", this.name, this.stars, this.dollars);
        return restaurantInfo;
    }


    @Override
    public int aveDollars() {
        return 0;
    }


}
