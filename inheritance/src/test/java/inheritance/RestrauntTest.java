package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestrauntTest {
   Restraunt musashis;

   @Before
   public void setup(){
       musashis = new Restraunt("Musashi's", 4,4 );

   }

    @Test
    public void makeRestraunt(){

    }

    @Test
    public void toStringTest(){
        assertEquals(
                "Restraunt:\nMusashi's\n4 Stars\n4",
                musashis.toString()
        );
    }


}