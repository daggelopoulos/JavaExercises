package classexampleschool;

public class Receptionist extends Employee implements Driving {

    public Receptionist(String name, int salary) {
        super(name, salary);
    }
    
    public void greet() {
        System.out.println("Receptionist is greeting");
    }

    @Override
    public void drive() {
        System.out.println("Receptionist is driving");
    }

    @Override
    public void work() {
        greet();
    }

}
