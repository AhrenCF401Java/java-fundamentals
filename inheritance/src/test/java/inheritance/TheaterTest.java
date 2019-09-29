package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class TheaterTest {
    @Before
    public void setup(){

    }

    @Test
    public void addMovie(Movie movie) {
        Theater amc = new Theater();
        Movie rambo = new Movie("Rambo", "action", "R", 60.0, 0, amc);
        addMovie(rambo);
//        assertEquals(
//
//        );
    }

    @Test
    public void removeMovie() {
    }

    @Test
    public void addReview() {
    }

    @Test
    public void howManyStarsIsThisReviewableThingReally() {
    }

    @Test
    public void aveDollars() {
    }
}