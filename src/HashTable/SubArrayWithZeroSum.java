package HashTable;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {


    // Brute Force
    // Time Complexity : O(N^2)
    // Space Complexity : O(1)
    public static boolean bSubArrayWithZeroSumIn(int[] array){
        int size = array.length;
        int currentSum;

        for (int i = 0; i < size; i++) {
            currentSum=array[i];
            for (int j = i+1; j < size; j++) {
                if (i!=size-1){
                    currentSum+=array[j];
                    if (currentSum==0)
                        return true;
                }

            }
        }
        return false;
    }

    // Optimal/Better Solution
    // Time Complexity : O(N)
    // Space Complexity : O(N)

    public static boolean oSubArrayWithZeroSumIn(int[] array) {

        Set<Integer> set = new HashSet<>();
        int currentSum = 0;

        for (int item : array) {

            set.add(currentSum);
            currentSum+=item;

            if ( set.contains(currentSum) || currentSum == 0)
                return true;
        }

        return false;
    }

}
