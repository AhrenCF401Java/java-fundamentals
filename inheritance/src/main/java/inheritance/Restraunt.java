package inheritance;

public class Restraunt {
         String name;
         int stars;
         int dollars;

    public Restraunt(String name, int stars, int dollars){
        this.name = name;
        this.stars = stars;
        this.dollars = dollars;
     }

     public String toString(){
        String restrauntInfo = String.format("Restraunt:\n%s\n%d Stars\n%d", this.name ,this.stars ,this.dollars);
        return restrauntInfo;
     }
}
