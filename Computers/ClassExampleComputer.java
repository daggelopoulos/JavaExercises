package classexamplecomputer;

import java.util.ArrayList;
import java.util.List;

public class ClassExampleComputer {

    public static void main(String[] args) {
        String sony = "Sony";
        String acer = "Acer";
        String asus = "Asus";
        String lenovo = "Lenovo";
        Computer desktop1 = new Desktop(sony, 900, true);
        Computer desktop2 = new Desktop(acer, 700, true);
        Computer desktop3 = new Desktop(asus, 750, false);
        Computer laptop1 = new Laptop(lenovo, 1200, true);
        Computer laptop2 = new Laptop(asus, 500, true);
        Computer laptop3 = new Laptop(acer, 250, false);
        Computer laptop4 = new Laptop(sony, 800, true);
        Computer tablet1 = new Tablet(lenovo, 3500, false);
        Computer tablet2 = new Tablet(sony, 660, true);

        List<Computer> computers = new ArrayList();
        computers.add(desktop1);
        computers.add(desktop2);
        computers.add(desktop3);
        computers.add(laptop1);
        computers.add(laptop2);
        computers.add(laptop3);
        computers.add(laptop4);
        computers.add(tablet1);
        computers.add(tablet2);

        int sumSony = 0;
        int sumAcer = 0;
        int sumAsus = 0;
        int sumLenovo = 0;
        int sumTotal = 0;

        for (Computer c : computers) {
            if (c.getBrand().equals(sony)) {
                sumSony += c.getPrice();
            } else if (c.getBrand().equals(asus)) {
                sumAsus += c.getPrice();
            } else if (c.getBrand().equals(acer)) {
                sumAcer += c.getPrice();
            } else if (c.getBrand().equals(lenovo)) {
                sumLenovo += c.getPrice();
            }

        }
        sumTotal = sumAcer + sumAsus + sumSony + sumLenovo;

        System.out.printf("%s computers cost %d\n", sony, sumSony);
        System.out.printf("%s computers cost %d\n", asus, sumAsus);
        System.out.printf("%s computers cost %d\n", acer, sumAcer);
        System.out.printf("%s computers cost %d\n", lenovo, sumLenovo);
        System.out.printf("Total price of all computers is %d\n", sumTotal);

        int sumDesktop = 0;
        int sumLaptop = 0;
        int sumTablet = 0;

        for (Computer c : computers) {
            if (c instanceof Desktop) {
                sumDesktop += c.getPrice();
            } else if (c instanceof Laptop){
                sumLaptop += c.getPrice();
            } else if (c instanceof Tablet) {
                sumTablet += c.getPrice();
            }

        }
        System.out.printf("%s computers cost %d\n", "Desktop", sumDesktop);
        System.out.printf("%s computers cost %d\n", "Laptop", sumLaptop);
        System.out.printf("%s computers cost %d\n", "Tablet", sumTablet);

    }

}
