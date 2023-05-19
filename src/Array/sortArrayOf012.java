package Array;

public class sortArrayOf012 {


    // Counting Approach
    public static void cSort012(int[] a) {
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        int pointer=0;

        for (int j : a) {
            if (j == 0)
                cnt0++;
            if (j == 1)
                cnt1++;
            if (j == 2)
                cnt2++;
        }

        while (cnt0!=0){
            a[pointer++]=0;
            cnt0--;
        }while (cnt1!=0){
            a[pointer++]=1;
            cnt1--;
        }while (cnt2!=0){
            a[pointer++]=2;
            cnt2--;
        }


    }

    // My Solution
    public static void sort012(int[] a){
        int low=0;
        int mid=0;
        int high=a.length-1;

        while(mid<=high){

            if(a[mid]==2)
                swap(a,mid,high);

            if(a[mid]==0){
                swap(a,mid,low);
                if(mid==low)
                    mid++;
            }

            while(a[low]==0 && low<mid)
                low++;

            while(a[high]==2 && high>mid)
                high--;

            while(mid>=low && a[mid]==1)
                mid++;

        }



    }

    //[2,0,2,0,2]
    // Author Solution Simplified
    // Dutch National Flag problem
    public static void aSort012(int[] a) {
        int low=0;
        int mid=0;
        int high=a.length-1;

        while (mid <= high) {
            if (a[mid]==0){
                swap(a,mid,low);
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                swap(a,mid,high);
                high--;
            }
        }

    }
    private static void swap(int[] array,int source,int target){
        int temp = array[source];
        array[source]=array[target];
        array[target]=temp;
    }
}
