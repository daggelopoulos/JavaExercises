package classexampleschool;

import java.util.ArrayList;

public class ClassExampleSchool {

    public static void main(String[] args) {
        Employee teacher1 = new Teacher("Andy", 1000);
        Employee teacher2 = new Teacher("John", 1100);
        Employee receptionist1 = new Receptionist("Lucy", 1500);
        Employee director1 = new Director("Bill", 2000);
        Employee director2 = new Director("Andy", 2500);

        ArrayList<Employee> employees = new ArrayList();
        employees.add(teacher1);
        employees.add(teacher2);
        employees.add(receptionist1);
        employees.add(director1);
        employees.add(director2);

        for (Employee x : employees) {
            x.work();
        }
        for (Employee x : employees) {
            if (x instanceof Driving) {
                ((Driving) x).drive();
            }
        }
        for (Employee x : employees) {
            if (x instanceof Advisable) {
                ((Advisable) x).giveAdvice();
            }
        }

    }

}
