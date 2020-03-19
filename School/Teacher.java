
package classexampleschool;

public class Teacher extends Employee implements Advisable{

    public Teacher(String name, int salary) {
        super(name, salary);
    }
    
    public void teach(){
        System.out.println("Techer is teaching");
    }

    @Override
    public void giveAdvice() {
        System.out.println("Teacher gives advice");
    }

    @Override
    public void work() {
        teach();
    }

}
