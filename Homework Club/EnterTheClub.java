package EnterTheClub;

import java.util.ArrayList;
import java.util.Scanner;

public class EnterTheClub {

    public static void main(String[] args) {
//        input.useLocale(Locale.US);

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("What is your gender " + name + (" M or F?"));
        String gender = input.next();
        while (!gender.equals("F") && !gender.equals("M")) {
            System.out.println("Invalid answer.Type only M/F");
            gender = input.next();
        }

        System.out.println("What is your age " + name + ("?"));
        int age = input.nextInt();
        if (age <= 5) {
            System.out.println("You are too young for this app.");
            System.out.println("Come back in " + (6 - age) + " years when you will be a student");
            return;
        } else if (age >= 6 && age <= 18) {
            System.out.println("Oh you are a student");
            System.out.println("Keep up... " + (18 - age) + " more years left and afterwards you will make money");
        } else if (age >= 19 && age <= 40) {
            System.out.println("Well, you must be employed");
            System.out.println("You finished school " + (age - 18) + " years ago");
        } else if (age < 0) {
            System.out.println("You are not serious. Start again");
            return;
        } else {
            System.out.println("You are too old for this app");
            return;

        }

        if ((2020 - age) >= 0) {
            System.out.println("In 1980 you were " + (age - 20) + " years old and in 2040 you will be " + (age + 20));

        } else {
            System.out.println("In 2040 you will be " + (age + 20) + " years old");
        }
        System.out.println("What is you favourite season");
        System.out.println("1. Winter");
        System.out.println("2. Spring");
        System.out.println("3. Summer");
        System.out.println("4. Autumn");
        System.out.println("Type a number from 1-4");
        int season = input.nextInt();
        if (season == 1) {
            System.out.println("It must be cold outside");
        }
        if (season == 2) {
            System.out.println("Ohh, flowers are very beautiful these days");
        }
        if (season == 3) {
            System.out.println("Let's go swimming");
        }
        if (season == 4) {
            System.out.println("The trees are full of brown leaves");
        }
        System.out.println("Please " + name + " enter your height");
        double height = input.nextDouble();
        System.out.println("Now, " + name + " enter your weight");
        double weight = input.nextDouble();
        double BMI = height / (weight * weight);
        if (BMI <= 18.5) {
            System.out.println("You are underweight");
        } else if (BMI > 18.5 && BMI < 25) {
            System.out.println("You have a normal weight");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese, watch out");
        }

        int days = age * 365;
        int sum = 0;
        while (days > 0) {
            sum = sum + days % 10;
            days = days / 10;
        }
        if (sum > 6) {
            sum = sum / 7;

        }
        ArrayList<String> luckyday = new ArrayList();
        luckyday.add("Monday");
        luckyday.add("Tuesday");
        luckyday.add("Wednesday");
        luckyday.add("Thursday");
        luckyday.add("Friday");
        luckyday.add("Satrurday");
        luckyday.add("Sunday");
        System.out.println("Your lucky day is " + luckyday.get(sum));

        if (sum == 2) {
            if (age >= 20 && age <= 40) {
                if (gender.equals("F")) {
                    System.out.println("Are you married ");
                    String marriage = input.next();
                    while (!marriage.equals("yes") && !marriage.equals("no")) {
                        System.out.println("Invalid answer.Type only yes/no");
                        marriage = input.next();
                    }
                    if (marriage.equals("yes")) {
                        System.out.println("Welcome to the club Mrs " + name);
                    } else {
                        System.out.println("Welcome to the club Ms " + name);
                    }
                } else {
                    if (age <= 25 && age >= 20) {
                        System.out.println("Welcome to the club " + name);
                    }
                    if (age > 25) {
                        System.out.println("Welcome to the club Mr " + name);
                    }

                }

            } else {
                System.out.println("You do not have the appropriate gae. You cannot enter the club");
            }

        } else {
            System.out.println("You cannnot enter the club because your lucky day is not Wednesday");
        }

    }

}
