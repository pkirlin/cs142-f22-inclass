package prebreak;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercises {

    public static void main(String[] args)
    {
        readWords();
    }

    public static void reverseArrayList(ArrayList<Integer> list)
    {

    }

    public static String reverseString(String str)
    {
        return "";
    }

    public static ArrayList<String> readWords() {
        InputStream is = Exercises.class.getResourceAsStream("words.txt");
        if (is == null) {
            System.err.println("Could not open file: words.txt");
            System.exit(1);
        }
        Scanner scan = new Scanner(is);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
        }
        return null;
    }

    public static int linearSearch(ArrayList<String> list, String lookingFor)
    {
        return 0;
    }

    public static ArrayList<String> wordsContainingEveryVowel(ArrayList<String> list)
    {
        return null;
    }

    public static ArrayList<String> wordsContainingEveryVowelExactlyOnce(ArrayList<String> list)
    {
        return null;
    }

    public static ArrayList<String> lettersInAlphaOrder(ArrayList<String> list)
    {
        return null;
    }

    public static ArrayList<String> findPalindromes(ArrayList<String> list)
    {
        return null;
    }

    public static ArrayList<String> simpleAutocorrect(ArrayList<String> list, String word)
    {
        return null;
    }
}