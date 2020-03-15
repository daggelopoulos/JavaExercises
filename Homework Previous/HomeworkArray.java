package homework.array;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeworkArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type 3 names");
        String a = input.next();
        String b = input.next();
        String c = input.next();
        String[] array = {a, b, c};
        ArrayList<String> list = new ArrayList();
        list.add(a);
        list.add(b);
        list.add(c);
        boolean check = array[2] == list.get(2);
        if (check == true) {
            System.out.println("The names on both indexes is the same");
        } else {
            System.out.println("The names on both indexes is different");
        }
        System.out.println("Please tyoe another name");
        String d = input.next();
        list.set(2, d);
        boolean check2 = array[2] == list.get(2);
        if (check2 == true) {
            System.out.println("The names on both indexes is the same");
        } else {
            System.out.println("The names on both indexes is different");
        }
        int size = array.length-1;
        System.out.println("Please tyoe 2 numbers between 0 and " + size);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        while (number1 < 0 || number1 > size || number2 < 0 || number2 > size) {
            System.out.println("Invalid number, try again");
            number1 = input.nextInt();
            number2 = input.nextInt();
            
         
        }

    }

}
