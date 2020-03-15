package homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        System.out.println("EXERCISE 1");
        System.out.println("Type a Number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int b = 0; b <= a; b++) {
            System.out.println(b);
        }

        System.out.println("EXERCISE 2");
        int sum = 0;
        for (int c = 1; c <= 1000; c++) {
            if (c % 5 == 0) {
                sum = sum + c;
            }
        }
        System.out.println(sum);

        System.out.println("EXERCISE 3");
        ArrayList list = new ArrayList();
        int sum2 = 0;
        while (sum2 <= 100) {
            System.out.println("Type a number");
            int x = input.nextInt();
            list.add(x);
            sum2 = sum2 + x;
        }

        System.out.println("The numbers you have entered are: " + list.size());
        ;

        System.out.println("EXERCISE 4");
        for (int d = 0; d <= 100; d++) {
            if (d % 3 == 0 && d != 0) {

                if (d % 5 == 0 && d % 5 == 0) {
                    System.out.println(d + " The number is a multiple of 3 and 5");

                } else {
                    System.out.println(d + " The number is a multiple of 3");
                }

            } else if (d % 5 == 0 && d != 0) {
                System.out.println(d + " The number is a multiple of 5");
            } else {
                System.out.println(d);
            }

        }
        System.out.println("EXERCISE 5");
        print();

        System.out.println("EXERCISE 6");
        print2();

    }

    static void print() {
        for (int z = 0; z < 4; z++) {
            System.out.println("****");
        }

    }

    static void print2() {
        for (int v = 0; v < 8; v++) {
            if (v == 0) {
                System.out.println("********");
            }
            if (v == 1) {
                System.out.println("*******");
            }
            if (v == 2) {
                System.out.println("******");
            }
            if (v == 3) {
                System.out.println("*****");
            }
            if (v == 4) {
                System.out.println("****");
            }
            if (v == 5) {
                System.out.println("***");
            }
            if (v == 6) {
                System.out.println("**");
            }
            if (v == 7) {
                System.out.println("*");
            }

        }

    }

}
