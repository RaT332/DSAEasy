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

    public int[] oCheck(int[] a,int s) {
        int currentSum=a[0],start=0;

        for (int i = 1; i < a.length; i++) {

            currentSum += a[i];

            while (currentSum>s && start<i){
                currentSum-=a[start];
                start++;
            }

            if (currentSum == s)
                return new int[]{start + 1, i + 1};
        }
        return new int[]{-1};
    }


}
