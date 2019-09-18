import java.util.Random;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;



public class Main{
    public static void main(String[]args){
        String proofLife ="Im Alive";
        System.out.println(proofLife);

        //test pluralize
        String dog = "dog";
        int numOfDogs= 3;
        System.out.println(pluralize(dog,numOfDogs));

        // test flip
        int times= 5;
        System.out.println(flipNHeads(times));
        
        clock();
        

    }

    public static String pluralize(String word, int howMany){
        if(howMany>1){
            word = word +"s";
        }
        return word;
    }

    public static String flipNHeads(int n){
        Random rnd = new Random();
        int flips = 0;
        // counts heads in a row
        int heads = 0;
        while(heads < n){
            double rndnum = rnd.nextDouble();
            flips++;
            if (rndnum > 0.5){
                heads++;
                System.out.println("Heads");
            }else{
                heads = 0; 
                System.out.println("Tails");
            }
        }
        String headFlips="It took "+n+" flips to flip "+heads+" heads in a row";  
        return headFlips;
    }
    // help from https://stackoverflow.com/questions/20608971/showing-the-time-every-second
    public static void clock(){
        LocalDateTime now = LocalDateTime.now();
        int seconds = now.getSecond();
        int checkTime = now.getSecond();;
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            while(true){
                if(checkTime==seconds){
                    checkTime = now.getSecond();
                    System.out.println(checkTime +" checkTime");
                }else{
                    seconds = now.getSecond();
                    checkTime = now.getSecond();
                    now = LocalDateTime.now();
                    time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    System.out.println(time);
                }
            }

        
        


        // while(somtthing is incrementing?)
    }

}




