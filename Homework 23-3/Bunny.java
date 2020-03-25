
package homework23.pkg3;

public class Bunny {
    private int bunnyNumber;

    public Bunny() {
    }
    
        public int getBunnyNumber() {
        return bunnyNumber;
    }

    public void setBunnyNumber(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    public Bunny(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }
    
    public static void hop (Bunny x){
        System.out.println(" Bunny number " + x.getBunnyNumber() +" is hoping");
        
    }

}
