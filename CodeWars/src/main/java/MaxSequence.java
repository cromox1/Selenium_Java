/*
The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list
of integers:

Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
// should be 6: {4, -1, 2, 1}

Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array.
If the list is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid
sublist/subarray.

 */

import java.util.Arrays;

public class MaxSequence {
    public static int sequence(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;
        else if (n == 1)
            return arr[0];
        else {
            Arrays.sort(arr);
            int max1 = arr[n - 1], max2 = 0;
            if (max1 <= 0)
            {
                return 0;
            }
            else {
                int k = 0;
                for (int i = n - 2; i >= k; i--) {
                    if (arr[i] != max1) {
                        max2 = arr[i];
                        k = n;
                    }
                }
                return max1 + max2;
            }
        }
    }
}
