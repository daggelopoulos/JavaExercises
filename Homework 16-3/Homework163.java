package homework16.pkg3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Homework163 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("-------------------------");
        System.out.println("Exercise 1");
        System.out.println("-------------------------");
        //String formattedString = String.format("%s", "Name");
        //System.out.println(formattedString);
        String family = "C:\\Users\\thelw\\Documents\\javaexample\\exercises\\family.txt";
        File details = new File(family);
        details.createNewFile();
        System.out.println("Please Enter Family");
        writeHeadersToFile(details);
        writeInputToFile(details);
        printTextFromFile(details);

        System.out.println("-------------------------");
        System.out.println("Exercise 2");
        System.out.println("-------------------------");
        String filename = "C:\\Users\\thelw\\Documents\\javaexample\\exercises\\URL.txt";
        File file = new File(filename);
        System.out.println("Printing URL subdomains");
        printSubdomainURL(file);
        System.out.println("Printing URLs containing java");
        printUrlContainingJava(file);

    }

    public static void printSubdomainURL(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String line = input.nextLine();
            System.out.println(line.replaceFirst("https://", "").replaceFirst("www.", ""));
        }
        input.close();
    }

    public static void printUrlContainingJava(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String line = input.nextLine();
            if (line.contains("java")) {
                System.out.println(line);
            }
        }
    }

    public static void writeHeadersToFile(File file) throws IOException {

        FileWriter filewriter = new FileWriter(file, true);
        PrintWriter writer = new PrintWriter(filewriter);
        Scanner input = new Scanner(System.in);
        writer.print("NAME\tAGE\tHEIGHT\tWEIGHT\n");
        writer.close();

    }

    public static void writeInputToFile(File file) throws IOException {
        Scanner input = new Scanner(System.in);
        while (!(input.hasNext("EXIT"))) {
            for (int i = 0; i < 4; i++) {
                FileWriter filewriter = new FileWriter(file, true);
                PrintWriter writer = new PrintWriter(filewriter);
                writer.print(input.next() + "\t");
                writer.close();
            }
            FileWriter filewriter = new FileWriter(file, true);
            PrintWriter writer = new PrintWriter(filewriter);
            writer.print("\n");
            System.out.println("Person was Succesfully Created");
            writer.close();
        }
        System.out.println("List Created Succesfully");

    }

    public static void printTextFromFile(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }

}
