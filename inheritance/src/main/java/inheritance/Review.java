package inheritance;
// this is my Node
public class Review {
    double stars;
    int dollars;
    String author;
    String movie;
    String review;
    ReviewableThings businessName;

    public Review( ReviewableThings businessName, String author, double stars, int dollars, String review){
        this.author = author;
        this.businessName = businessName;
        this.stars = stars;
        this.dollars = dollars;
        this.review = review;
    }
//  This is for businesses that are Shops
    public Review( ReviewableThings businessName, String author, double stars, String review){
        this.businessName = businessName;
        this.author = author;
        this.stars = stars;
        this.review = review;
    }

//  This is for businesses that are theaters
    public Review( ReviewableThings businessName, String author, double stars, int dollars, String review, String movie){
        this.businessName = businessName;
        this.author = author;
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