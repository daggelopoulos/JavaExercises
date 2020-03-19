
package classexampleschool;

public abstract class Employee {

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    String name;
    int salary;
    
    public abstract void work();
    

}
