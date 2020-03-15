package homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        System.out.println("How many products do you want to insert?");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        ArrayList<String> list = new ArrayList();
        for (int b = 0; b < a; b++) {
            System.out.println("Please type a product");
            String c = input.next();
            list.add(c);

        }
        System.out.println("Here is the list of products");
        printlist(list);

        Collections.sort(list);
        System.out.println("Here is the list of products sorted ");

        printlist(list);

    }

 


    static void printlist(ArrayList<String> inputlist) {
        int size = inputlist.size();
        for (int b = 0; b < size; b++) {
            if (b < size - 1) {

                System.out.print(inputlist.get(b) + ", ");
            } else {
                System.out.print(inputlist.get(b) + ".");
            }
        }
        System.out.println();

    }

}
