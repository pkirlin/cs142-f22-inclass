package recursion;

public class Recursion1 {

    public static void main(String[] args)
    {
        for (int i = 1; i <= 30; i++)
        {
            long factAnswer = factRec(i);
            System.out.println("The factorial of " + i + " is " + factAnswer);
        }
    }

    public static long fact(int num)
    {
        long factorial = num;
        // for loop
        for (int i = num-1; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static long factRec(int num)
    {
        if (num == 1) {  // base case
            return 1;
        }
        else {  // recursive case
            return factRec(num-1) * num;
        }
    }

    public static String reverse(String str)
    {
        String answer = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            answer = answer + str.charAt(i);
        }
        return answer;
    }

    public static String reverseRec(String str)
    {
        return ""; // remove this when you start coding
    }
}