package inheritance;
// this is my Node
public class Review {
    double stars;
    int dollars;
    String review;
    ReviewableThings businessName;

    public Review( ReviewableThings businessName, double stars, int dollars, String review){
        this.businessName = businessName;
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