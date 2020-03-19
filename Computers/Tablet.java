package classexamplecomputer;

public class Tablet extends Computer {

    private boolean Bluetooth;

    public Tablet(String brand, int price, boolean Bluetooth) {
        super(brand, price);
        this.Bluetooth = Bluetooth;
        addPrice(price);

    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public void addPrice(int price) {
        if (Bluetooth == true) {
            this.price = price + 50;
        }
    }
}
