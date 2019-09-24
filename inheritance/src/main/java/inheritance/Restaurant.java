package inheritance;

import java.util.LinkedList;

public class Restaurant {
    String name;
    int stars;
    int dollars;
    LinkedList<Review> reviews = new LinkedList<>();

    public Restaurant(String name, int stars, int dollars) {
        this.name = name;
        this.stars = stars;
        this.dollars = dollars;
    }

    public void addReview(Review review) {
//         add it to reviews list
        reviews.add(review);
    }

    public void howManyStarsIsThisRestaurantReally(){
        for(Review review : reviews) {
            int totalStars =0;
            totalStars = totalStars + review.stars;
            this.stars= totalStars / reviews.size();
        }
    }

    public String toString() {
        String restaurantInfo = String.format("Restaurant:\n%s\n%d Stars\n%d", this.name, this.stars, this.dollars);
        return restaurantInfo;
    }
}
