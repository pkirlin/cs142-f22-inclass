package midterm1;

import java.util.Arrays;

public class MidtermPractice {
    public static void main(String[] args) {
        // problem 1
        for (int i = 1; i < 61; i++) {
            if (i % 3 == 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }

        int[] array = new int[] {2, 4, 6, 8};
        int[] revArray = reverseArray(array);
        System.out.println(Arrays.toString(revArray));
    }

    public static int[] reverseArray(int[] array) {
        int[] revArray = new int[array.length];
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            //System.out.println(i + " " + j);
            revArray[j] = array[i];
            j--;
        }
        return revArray;
    }

    public static int countZeroRows(int[][] board) {
        int count = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == 0) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }


}
