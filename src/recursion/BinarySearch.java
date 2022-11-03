package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args)
    {
        // test binary search, iterative version:
        ArrayList<Integer> sortedList = new ArrayList<Integer>(Arrays.asList(6,13,14,25,33,43,51,53,64,72,84,93,95,96,97));
        int indexFound = binarySearchIter(sortedList, 33);
        System.out.println("Iterative version: found at index " + indexFound);

        // test binary search, recursive version:
        indexFound = binarySearchRec(sortedList, 33);
        System.out.println("Recursive version: found at index " + indexFound);
    }


    // Iterative binary search --- remember the arraylist must be sorted!
    public static int binarySearchIter(ArrayList<Integer> list, int key) {
        int low = 0; // far left index
        int high = list.size() - 1;  // far right index

        while (high >= low) {
            int mid = (low + high) / 2;          // find midpoint
            if (list.get(mid) > key) {           // if middle element > key
                high = mid - 1;                  //   next time, look in left half of arraylist
            } else if (list.get(mid) < key) {    // if middle element < key
                low = mid + 1;                   //   next time, look in right half of arraylist
            } else {                             // if middle element == key
                return mid;                      //   return this middle element index
            }
        }
        return -1; // key not found
    }

    // Recursive binary search.
    public static int binarySearchRec(ArrayList<Integer> list, int key) {
        return binarySearchRec(list, key, 0, list.size()-1);
    }

    // Helper method for above.
    public static int binarySearchRec(ArrayList<Integer> list, int key, int low, int high) {
        if (low > high) { // base case #1, if bookmarks cross, then key is not found
            return -1;
        }
        int mid = (low + high) / 2;
        if (list.get(mid) == key) {  // base case #2, if item is found at middle position
            return mid;
        }
        else if (list.get(mid) > key) {
            return binarySearchRec(list, key, low, mid - 1);
        }
        else {
            return binarySearchRec(list, key, mid + 1, high);
        }
    }
}