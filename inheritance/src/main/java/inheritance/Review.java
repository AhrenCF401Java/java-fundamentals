package inheritance;
// this is my Node
public class Review {
    double stars;
    int dollars;
    String movie;
    String review;
    ReviewableThings businessName;

    public Review( ReviewableThings businessName, double stars, int dollars, String review){
        this.businessName = businessName;
        this.stars = stars;
        this.dollars = dollars;
        this.review = review;
    }

    public Review( ReviewableThings businessName, double stars, String review){
        this.businessName = businessName;
        this.stars = stars;
        this.review = review;
    }

    public Review( ReviewableThings businessName, double stars, int dollars, String review, String movie){
        this.businessName = businessName;
        this.stars = stars;
        this.dollars = dollars;
        this.review = review;
        this.movie = movie;
    }

    public String toString(){
        String reviewData = String.format("Stars : %d\nExpense : %d out of 5\nReview: %s", stars,dollars,review);
        return reviewData;
    }
}