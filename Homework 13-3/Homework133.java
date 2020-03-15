package homework13.pkg3;

import java.util.Random;
import java.util.Scanner;

public class Homework133 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Exerices 1");
        //What class in school are you going according to age;
        //Use an if-else-if.
        //For example: 5-12 dimotiko, ...
        //Can you use a switch statement?
        System.out.println("Insert your age");
        int age = input.nextInt();
        if (age < 0) {
            System.out.println("Invalid Age");
        } else if (age < 5) {
            System.out.println("You are not going to school yet");
        } else if (age < 13) {
            System.out.println("Youa are going dimotiko");
        } else if (age < 16) {
            System.out.println("You are going gymnasio");
        } else if (age < 19) {
            System.out.println("You are going lykeio");
        } else {
            System.out.println("You have finished school");
        }
        //assign every if to a string and use switch

        System.out.println("Exerices 2");
        //What to do every day (switch). Monday-Friday: go to work. Sat-Sun: relaxing
        System.out.println("Insert a Day Monday-Sunday");
        String day = input.next();
        switch (day) {
            case "Monday":
                System.out.println("Go to Work");
                break;
            case "Tusesday":
                System.out.println("Go to Work");
                break;
            case "Wednesday":
                System.out.println("Go to Work");
                break;
            case "Thursday":
                System.out.println("Go to Work");
                break;
            case "Friday":
                System.out.println("Go to Work");
                break;
            case "Saturday":
                System.out.println("Relaxing");
                break;
            case "Sunday":
                System.out.println("Relaxing");
                break;
            default:
                System.out.println("Invalid Day");
        }

        System.out.println("Exerices 3");
        //What season is according to month. Enter month from terminal.

        System.out.println("Exerices 4");
        //Print the number of days each month has. Use switch.
        String month = "January";
        switch (month) {
            case "January":
                System.out.println("January has 31 days");
            case "February":
                System.out.println("February has 29 days");
            case "March":
                System.out.println("March has 31 days");
            case "April":
                System.out.println("April has 30 days");
            case "May":
                System.out.println("May has 31 days");
            case "June":
                System.out.println("June has 30 days");
            case "July":
                System.out.println("July has 31 days");
            case "August":
                System.out.println("August has 31 days");
            case "September":
                System.out.println("September has 30 days");
            case "October":
                System.out.println("October has 31 days");
            case "November":
                System.out.println("November has 30 days");
            case "December":
                System.out.println("December has 31 days");

        }

        System.out.println("Exerices 5");
        //Get message ("Perfect, Good, Pass, Fail") based on grade (A, B, C-D, the rest). 
        System.out.println("Insert Grade A-F");
        String grade = input.next();
        switch (grade) {
            case "A":
                System.out.println("Perfect");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Pass");
                break;
            case "D":
                System.out.println("Pass");
                break;
            case "E":
                System.out.println("Fail");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }

        System.out.println("Exerices 6");
        //Based on age what can you do?
        //lt 16>>You cannot drive
        //16-17>>You can drive but not vote
        //18-21>>You can vote but not drink
        //gt 22>>You can do anything 
        if (age < 16) {
            System.out.println("Based on your age, You cannot drive");
        } else if (age < 18) {
            System.out.println("Based on your age, You can drive but not vote");
        } else if (age < 22) {
            System.out.println("Based on your age, You can vote but not drinke");
        } else {
            System.out.println("Based on your age, You can do anything");
        }

        System.out.println("Exerices 7");
        //Program should ask your weight and planet. Compute your weight on the planet based on the table below:
        //#    Planet    Relative gravity
        //1    Venus        0.78
        //2    Mars        0.39
        //3    Jupiter    2.65
        //4    Saturn    1.17
        //5    Uranus    1.05
        //6    Neptune    1.23
        //So, for example, if your weight is 80 kg on earth, then you would weigh just over 31 kg on Mars, 
        //since Mars' gravity is 0.39 times earth's gravity. (80 * 0.39 is 31.20)
        System.out.println("What is your weight?");
        int weight = input.nextInt();
        System.out.println("What Planet do you Live in?");
        String planet = input.next();
        switch (planet) {
            case "Venus":
                System.out.println("Your weight in " + planet + " is: " + weight * 0.78);
                break;
            case "Mars":
                System.out.println("Your weight in " + planet + " is: " + weight * 0.39);
                break;
            case "Jupiter":
                System.out.println("Your weight in " + planet + " is: " + weight * 2.65);
                break;
            case "Saturn":
                System.out.println("Your weight in " + planet + " is: " + weight * 1.17);
                break;
            case "Uranus":
                System.out.println("Your weight in " + planet + " is: " + weight * 1.05);
                break;
            case "Neptune":
                System.out.println("Your weight in " + planet + " is: " + weight * 1.23);
                break;
            case "Earth":
                System.out.println("Your weight in " + planet + "is: " + weight);
                break;
        }

        System.out.println("Exerices 8");
        //Use ternary to return a message child or adult. Older than 18 is adult.
        String ternry = (age < 18) ? "You are a child" : "You are an adult";
        System.out.println(ternry + "...Using Ternary...");

        System.out.println("Exerices 9");
        //Create a program that stores the names of your 4 best friends in an array.
        //Then print these names from the array. Use for-traditional, for enhanced, while, do-while.
        String[] friends = {"Takis", "Liakos", "Minas", "Harry G"};
        System.out.println("Print Using for");
        for (int i = 0; i < friends.length; i++) {
            System.out.print(friends[i] + ", ");
        }
        System.out.println();

        System.out.println("Print Using for enhanced");
        for (String friend : friends) {
            System.out.print(friend + ", ");
        }
        System.out.println();
        System.out.println("Print Using while");
        int i = 0;
        while (i < friends.length) {
            System.out.print(friends[i] + ", ");
            i += 1;
        }
        System.out.println();
        System.out.println("Print Using do while");
        i = 0;
        do {
            System.out.print(friends[i] + ", ");
            i += 1;
        } while (i < friends.length);
        System.out.println();

        System.out.println("----------------------------------");
        System.out.println("Exercise 10");
        System.out.println("----------------------------------");

        System.out.println("How many rows does the class have");
        int rows = input.nextInt();
        System.out.println("How many students does the class have");
        int students = input.nextInt();
        int columns = students / rows;
        int left = students % rows;
        int lastColumn = columns + left;

        String[][] classroom = new String[rows][];
        for ( i = 0; i < rows-1; i++) {
            classroom[i] = new String[columns];
        }
        classroom[rows-1] = new String[lastColumn];

        Random random = new Random();
        i = 0;
        while (i < students) {
            int a = random.nextInt(rows);
            int b = random.nextInt(classroom[a].length);
            if (classroom[a][b] == null) {
                System.out.println((students - i) + " seats are empty");
                System.out.println("Please enter students name for seat [" + a + "],[" + b + "]:");
                classroom[a][b] = input.next();
                i++;
            }
        }
        System.out.println("Thank You");
        for (i=0; i<classroom.length; i++ ) {
            for (String student : classroom[i]) {
                System.out.print(student + "\t");
            }
            System.out.println();
        }
    }

}
