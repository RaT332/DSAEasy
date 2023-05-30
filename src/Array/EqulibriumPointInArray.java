package Array;

public class EqulibriumPointInArray {
    
    // BruteForce
    // TimeComplexity : O(N^2)
    // SpaceComplexity : O(1)
    public static int bEqulibPointIn(int[] array) {
        
        int size = array.length;
        
        for (int i = 0; i < size; i++) {

            int rightSum = 0;
            for (int j = i + 1; j < size; j++) {
                if (i == size - 1)
                    break;
                else
                    rightSum += array[j];
            }

            int leftSum = 0;
            for (int j = i - 1; j < size; j++) {
                if (i == 0)
                    break;
                else
                    rightSum += array[j];
            }

            if (rightSum == leftSum)
                return i + 1;
        }
        return -1;
    }
    
    // Optimal or Better Approach
    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public static int oEquilibriumPointIn(int[] array) {
        
        int size = array.length;
        int rightSum=0;
        int leftSum=0;

        for (int i = 0; i < size; i++) {
            rightSum+=array[i];
        }

        for (int i = 0; i < size; i++) {

            rightSum-=array[i];

            if (i>0)
                leftSum+=array[i-1];

            if(leftSum==rightSum)
                return i+1;
        }
        return -1;
    }
    
}
