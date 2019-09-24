package inheritance;
// this is my Node
public class Review {
    int stars;
    int dollars;
    String review;
    Restaurant restaurant;

    public Review(Restaurant restaurant, int stars, int dollars, String review){
        this.restaurant = restaurant;
        this.stars = stars;
        this.dollars = dollars;
        this.review = review;

    }

    public String toString(){
        String reviewData = String.format("Stars : %d\nExpense : %d out of 5\nReview: %s", stars,dollars,review);
        return reviewData;
    }

}
//    Node head;
//}
//
//class Node{
//    int value;
//    Node next;
//
//    public Node{
//
//    }
//
//    public void insertHead(int value){
//        Node head = new Node(value, this.head);
//    }
//        }