package homework4;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Exercise 1");
        //Write a Java program to print the area and perimeter of a circle. 
        //Test Data:
        //Radius = 7.5
        //Expected Output
        //Perimeter is = 47.12388980384689
        //Area is = 176.71458676442586 
        //Use memory-friendly variables and print the result with printf. 
        System.out.println("Insert cycle radius");
        double radius = input.nextDouble();
        double perim= Math.PI * (2*radius);
        double ar= Math.PI*radius*radius;
        System.out.printf("Circle perimeter is %f and area is %f\n",perim,ar);

        System.out.println("Exercise 2");
        //Write a Java program to print the result of the following operations for x = 1 and y =2.
        //After every operation print the result of the whole operation, x and y.
        //a. -x + x++ * 2
        //b. (x++ + --y) + --y
        //c. x + x
        //At the end, after all the operations print the values of x and y.  
        int x=1;
        int y=2;
        System.out.println("-x + x++ * 2 = "+ (-x + x++ * 2));
        System.out.println("(x++ + --y) + --y = "+(x++ + --y) + --y);
        System.out.println("x + x = "+(x + x));
        System.out.println("x="+x +" y="+y);

        System.out.println("Exercise 3");
        //Write a Java program to print the area and perimeter of a rectangle. 
        System.out.println("Enter the width and height of a rectangle");
        double w = input.nextDouble();
        double h = input.nextDouble();
        double area = h*w;
        double perimeter = 2*(h+w);
        System.out.printf("The area of the rectangle is %f and the perimeter is %f\n",area,perimeter);
        

        System.out.println("Exercise 4");
        //Write a Java program to convert seconds to hour, minute and seconds.
//        System.out.println("How many seconds do you want to calculate?");
//        int seconds = input.nextInt();
//        int calc = ;

        System.out.println("Exercise 5");
        //Write a program to enter names and year of birth of 3 people.
        //Print a message for each person showing his/her details.
        System.out.println("Type 3 names");
        String n1 = input.next();
        String n2 = input.next();
        String n3 = input.next();
        String[] names = {n1, n2, n3};
        System.out.println("now their ages");
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int a3 = input.nextInt();
        int[] age = {a1, a2, a3};
        for (int i = 0; i < 3; i++) {
            System.out.printf("name: %s, age: %s\n", names[i], age[i]);
        }

        System.out.println("Exercise 6");
        //Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        System.out.println("please enter a number");
        double fahr = input.nextDouble();
        double celsius = (fahr - 32) / 1.8;
        System.out.printf("%f Fahrenheit is %f Celsius\n", fahr, celsius);

        System.out.println("Exercise 7");
        //Write a Java program that reads a number in inches, converts it to meters.
        //Note: One inch is 0.0254 meter.
        System.out.println("please enter a number");
        double inch = input.nextDouble();
        double cm = 0.0254 * inch;
        System.out.printf("%f inches are %f meters\n", inch, cm);

        System.out.println("Exercise 8");
        //Γράψτε ένα πρόγραμμα που δέχεται την τιμή ενός προϊόντος και 
        //εμφανίζει σε μηνύματα τη τιμή του σε έκπτωση 10%, 20%, 30%, 40%, 50%, 60%.
        System.out.println("Please enter the price");
        int price = input.nextInt();
        int disc = 10;
        while (disc <= 60) {
            int disPrice = price - (price * disc / 100);
            System.out.printf("The value with %d%s discount is %d\n", disc, "%", disPrice);
            disc = disc + 10;
        }

    }

}
