/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicLibrary;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }


    public static int[] roll(int rolls) {
        Random rnd = new Random();
        int[] numsRolled = new int[rolls];
        System.out.println(numsRolled + " Arr");
        for (int i = 0; i < numsRolled.length; i++) {
            numsRolled[i] = rnd.nextInt((6 - 1) + 1) + 1;
            System.out.println(i);
        }

        return numsRolled;
    }

    public static boolean containsDuplicates(int[] arr){
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;

                }
            }
        }
        return false;
    }

}
