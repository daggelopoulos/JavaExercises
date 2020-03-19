package classexampleschool;

public class Director extends Employee implements Driving, Advisable {

    public Director(String name, int salary) {
        super(name, salary);
    }

    public void guide() {
        System.out.println("Director is guiding");
    }

    @Override
    public void drive() {
        System.out.println("Director is driving");
    }

    @Override
    public void giveAdvice() {
        System.out.println("Director gives advice");
    }

    @Override
    public void work() {
        guide();
    }

}
