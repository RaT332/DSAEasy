package Array;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {

    // BruteForce
    // Time Complexity : O(N^2)
    // Space Complexity : O(1)
    public static int bCountPairsIn(int[] array,int k) {

        int size = array.length;
        int count=0;

        for (int i = 0; i < size; i++) {

            for (int j = i+1; j < size; j++) {
                if (array[j] + array[i] == k)
                    count++;
            }
        }

        return count;
    }

    // Better/Optimal Solution
    // Time Complexity : O(N)
    // Space Complexity : O(N)
    public static int oCountPairsIn(int[] array,int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int size = array.length;
        int countedPairs=0;
        for (int j : array) {
            int count = map.getOrDefault(j, 0);
            map.put(j, count + 1);
        }

        for (int j : array) {
            int desiredElement = k-j;
            if (map.containsKey(desiredElement) && map.get(desiredElement)!=0){
                map.put(j,map.get(j)-1);
                countedPairs+=map.get(desiredElement);
            }
        }

        return countedPairs;

    }


}
