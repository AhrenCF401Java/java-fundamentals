package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
   Restaurant musashis;

   @Before
   public void setup(){
       musashis = new Restaurant("Musashi's", 4,4 );

   }

    @Test
    public void makeRestaurant(){

    }

    @Test
    public void toStringTest(){
        assertEquals(
                "Restaurant:\nMusashi's\n4 Stars\n4",
                musashis.toString()
        );
    }

    @Test
    public void addReviewTest(){
    Review llama = new Review(musashis, musashis.stars, musashis.dollars, "Best sushi bowl EVER!!!");
    musashis.addReview(llama);
        assertEquals(1,
                musashis.reviews.size()
       );
    }


}