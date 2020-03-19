
package classexamplecomputer;

public abstract class Computer {
    private String brand;
    protected int price;
    private static int computerCreated;
    


    public Computer(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }


    public abstract void setPrice (int price);
    

}
