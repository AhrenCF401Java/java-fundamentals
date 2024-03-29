package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
   Restaurant musashis;

   @Before
   public void setup(){
       musashis = new Restaurant("Musashi's", 5,4 );

   }


    @Test
    public void toStringTest(){
        assertEquals(
                "Restaurant:\nMusashi's\n5.0 Stars\n4",
                musashis.toString()
        );
    }

    @Test
    public void addReviewTest(){
    musashis.addReview(new Review(musashis, "Sam I Am", musashis.stars, musashis.dollars, "Best sushi bowl EVER!!!"));
        assertEquals(1,
                musashis.reviews.size()
       );
    }

    @Test
    public void howManyStarsIsThisBusinessReallyTest(){
        Review llama = new Review(musashis,"Sam I Am", musashis.stars, musashis.dollars, "Best sushi bowl EVER!!!");
        musashis.addReview(new Review(musashis,"Sam I Am",2,musashis.dollars, "Not the worst not the best"));

    }


}