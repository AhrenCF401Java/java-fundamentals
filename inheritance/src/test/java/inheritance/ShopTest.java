package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Target;

import static org.junit.Assert.*;

public class ShopTest {
    Shop target;
    @Before
    public void setup(){
        target = new Shop("Target", 5);
    }
    @Test
    public void addReview() {
        Review llama = new Review(target, target.stars,"Best sushi bowl EVER!!!");
        target.addReview(llama);
        assertEquals(1,
                target.reviews.size()
        );
    }

    @Test
    public void howManyStarsIsThisReviewableThingReally() {
        Review llama = new Review(target, target.stars, "Best sushi bowl EVER!!!");
        target.addReview(new Review(target,2, "Not the worst not the best"));

    }

    @Test
    public void testToString() {
        assertEquals(
                "Shop:\nTarget\n5.0 Stars",
                target.toString()
        );
    }


}