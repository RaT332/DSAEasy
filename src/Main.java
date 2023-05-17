import Array.SubArraySum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SubArraySum sum = new SubArraySum();
        int[] index =  sum.bCheck(new int[]{1, 2, 3, 4, 5}, 16);
        System.out.println(Arrays.toString(index));
    }

}