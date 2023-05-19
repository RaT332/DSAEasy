package Array;

public class MissingNumberInArray {
   // better Overflow can be.
   // There Can be Overflow of int (totalSum)
    public static int o1Check(int[] a) {

        int n = a.length+1;
        int totalSum = (n*(n+1))/2;

        for (int number : a) {
            totalSum -= number;
        }

        return totalSum;
    }

    // Solution for above scenario.
    public static int o2Check(int[] a) {

        int increment=2,currentSum=1;

        for (int item : a) {
            currentSum+=increment++;
            currentSum-=item;
        }
        return currentSum;
    }

    // Using XOR approach
    // Properties of XOR :=
    // a1 xor a2 xor a3 .....xor an = a
    // b1 xor b2 xor b3 .....xor bn-1 = b
    // a xor b = an
    // by this property we solve it.
    public static int o3Check(int[] a) {
        int current=1;
        int next=2;
        while (next!=a.length+2)
            current ^= next++;

        int first = a[0];
        for (int i = 1; i < a.length ; i++)
            first ^= a[i];

        return current^first;
    }



// In this we are using cyclic sort method.

    public static int o4Check(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int correctIndex = a[i]-1;
            if (correctIndex==a.length)
                continue;
            swap(a,i,correctIndex);
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i]!=i+1)
                return i+1;
        }
        return a.length+1;
    }

    private static void swap(int[] a, int initial, int target) {
        int temp = a[initial];
        a[initial] = a[target];
        a[target] = temp;
    }
}
