package homework23.pkg3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Homework233 {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("---------------------");
        System.out.println("EXERCISE !");
        System.out.println("---------------------");
        ArrayList<Bunny> listOfBunnies = new ArrayList();
        listOfBunnies.add(new Bunny(5));
        listOfBunnies.add(new Bunny(12));
        listOfBunnies.add(new Bunny(34));
        listOfBunnies.add(new Bunny(10));
        listOfBunnies.add(new Bunny(23));
        //PRINT WITH 3
        for (Bunny x : listOfBunnies) {
            Bunny.hop(x);
        }
        //PRINT WITH ITERATOR
        Iterator<Bunny> it = listOfBunnies.iterator();
        while (it.hasNext()) {
            Bunny x = it.next();
            Bunny.hop(x);
        }
        System.out.println("---------------------");
        System.out.println("EXERCISE 2");
        System.out.println("---------------------");
        Map<String, Integer> mapOfBunnies = new HashMap();
        mapOfBunnies.put("Nick", 5);
        mapOfBunnies.put("John", 12);
        mapOfBunnies.put("Jack", 34);
        mapOfBunnies.put("Glen", 10);
        mapOfBunnies.put("Jim", 23);
        Set<String> keyOfBunny = mapOfBunnies.keySet();
        Iterator<String> itr = keyOfBunny.iterator();
        while (itr.hasNext()) {
            String x = itr.next();
            int y = mapOfBunnies.get(x);
            System.out.println("Bunny number " + y + " " + x + " is hoping");
        }
        System.out.println("---------------------");
        System.out.println("EXERCISE 3");
        System.out.println("---------------------");
        String filename = "C:\\Users\\thelw\\Documents\\NetBeansProjects\\Homework23-3\\aJourneyToTheInteriorOfTheEarth.txt";
        File file = new File(filename);
        Scanner input = new Scanner(file);
        ArrayList<String> listOfWords = new ArrayList();
        while (input.hasNext()) {
            String word = input.next();
            listOfWords.add(word);
        }
        input.close();
        Map<String, Integer> mapOfWords = new TreeMap();
        for (String x : listOfWords) {
            if (mapOfWords.containsKey(x)) {
                mapOfWords.put(x, (mapOfWords.get(x) + 1));
            } else {
                mapOfWords.put(x, 1);
            }
        }
        System.out.println("Type a word to search");
        Scanner input2 = new Scanner(System.in);
        String searchWord = input2.next();
        if (mapOfWords.containsKey(searchWord)) {
            System.out.println(searchWord + ": " + mapOfWords.get(searchWord));
        } else {
            System.out.println("The word does not appear in the book");
        }
        System.out.println("All words appearing 500 times");
        Set<String> setOfWords = mapOfWords.keySet();
        Iterator<String> itr2 = setOfWords.iterator();
        while (itr2.hasNext()) {
            String x = itr2.next();
            if (mapOfWords.get(x) > 500) {
                System.out.println(x + ": " + mapOfWords.get(x) + " times");
            }
        }

        System.out.println("---------------------");
        System.out.println("EXERCISE 4");
        System.out.println("---------------------");
        Map<Integer, String> map = new HashMap();
        map.put(8, "A");
        map.put(15, "B");
        map.put(9, "C");
        map.put(10, "D");
        map.put(7, "F");
        map.put(12, "G");
        map.put(13, "H");
        map.put(17, "I");
        map.put(5, "J");
        map.put(20, "K");
        Set<Integer> keys = map.keySet();
        Iterator<Integer> iter = keys.iterator();
        System.out.println("Map <10");
        while (iter.hasNext()) {
            int x = iter.next();
            if (x <= 10) {
                System.out.println(map.get(x) + " " + x);
            }
        }
        System.out.println("Map 11-15");
        iter = keys.iterator();
        while (iter.hasNext()) {
            int x = iter.next();
            if (x > 10 && x <= 15) {
                System.out.println(map.get(x) + " " + x);
            }
        }
        Map<Integer, String> mapUnder = new HashMap();
        mapUnder.putAll(map);
    }
}
