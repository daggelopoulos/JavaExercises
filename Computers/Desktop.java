package classexamplecomputer;

public class Desktop extends Computer {

    private boolean ExtraLight;

    public Desktop(String brand, int price, boolean ExtraLight) {
        super(brand, price);
        this.ExtraLight = ExtraLight;
        addPrice(price);

    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public void addPrice(int price) {
        if (ExtraLight == true) {
            this.price = price + 0;
        }
    }
}
