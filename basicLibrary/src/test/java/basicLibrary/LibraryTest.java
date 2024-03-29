/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicLibrary;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void rollTest() {
        int[] rightAnswer = new int[6];
        assertEquals(
                "new array should look like this",
                rightAnswer.length,
                Library.roll(6).length
        );
    }

    @Test
    public void containsDuplicatesTrueTest() {
        int[] duplicateArr = {9, 7, 6, 10, 10};
        assertTrue(
                "The test should return True if arr contains duplicate",
                Library.containsDuplicates(duplicateArr)
        );
    }

    @Test
    public void ArrAvsTest(){
        int[] testarr={1,2,3,4,5,6,7,8,9,10};
        double act= Library.calcAvs(testarr);
        assertEquals(
                5.5,
                act,
                0
                );

    }

    @Test
    public void  arrArrLowAvTest(){
        int[][] testarr = {
                {5, 5, 5, 5, 5, 5, 5},
                {6, 6, 6, 6, 6, 6, 6},
                {2, 2, 2, 2, 2, 2, 2},
        };
        double act= Library.multiArrCalc(testarr);
        assertEquals(
                2,
                act,
                0
        );



    }

    @Test
    public void doesNotContianTest(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        assertEquals(
                "Should find all not found temps",
                "High: 72\n" +
                        "Low: 51\n" +
                        "Never saw temperature: 63\n" +
                        "Never saw temperature: 67\n" +
                        "Never saw temperature: 68\n" +
                        "Never saw temperature: 69",
                Library.hashyMappy(weeklyMonthTemperatures)
        );
    }


    @Test
    public void tally() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        assertEquals(
                "Should return plant with highest votes",
                        "Bush",
                Library.tally(votes)
        );
    }

    @Test
    public void linterTest() throws FileNotFoundException {
        String path="../linter/src/main/resources/gates.js";
        Library.linter(path);
    }
}