package classexamplecomputer;

public class Laptop extends Computer {

    private boolean Wifi;

    public Laptop(String brand, int price, boolean Wifi) {
        super(brand, price);
        this.Wifi = Wifi;
        addPrice(price);

    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public void addPrice(int price) {
        if (Wifi == true) {
            this.price = price + 20;
        }
    }
}
