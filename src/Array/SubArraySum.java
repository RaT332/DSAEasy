package Array;

public class SubArraySum {
    // Brute Force
    public int[] bCheck(int[] a,int s){
        for (int i=0; i < a.length ; i++) {

            int currentSum=a[i];

            for (int j = i+1; j < a.length; j++) {

                if (currentSum>s)
                    continue;

                currentSum += a[j];

                if (currentSum == s)
                    return new int[]{i + 1, j+1};
            }

        }
        return new int[]{-1};
    }


}
