package prebreak;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercises {

    public static void main(String[] args)
    {
        //readWords();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        reverseArrayList(list);
        System.out.println(list);

        String s = "abc";
        String answer = reverseString(s);
        System.out.println(answer);
    }

    public static void reverseArrayList(ArrayList<Integer> list)
    {
        int j = list.size() - 1;
        for (int i = 0; i < list.size()/2; i++) {
            // do algorithm here
            int number = list.get(i);
            int temp = list.get(j);
            list.set(j, number);
            list.set(i, temp);
            j--;
        }
    }

    public static String reverseString(String str)
    {
        String answer = "";
        /*for (int i = str.length()-1; i >= 0; i--) {
            answer += str.charAt(i);
        }*/
        /*for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(str.length() - 1 - i);
        }*/
        for (int i = 0; i < str.length(); i++) {
            answer = str.charAt(i) + answer;
        }
        return answer;
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