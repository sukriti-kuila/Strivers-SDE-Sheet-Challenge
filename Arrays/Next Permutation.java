import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        int dippedind = -1;
        int n = permutation.size();
        for (int i = n - 2; i >= 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                dippedind = i;
                break;
            }
        }
        if (dippedind == -1) {
            Collections.reverse(permutation);
        } else {
            for (int i = n - 1; i >= 0; i--) {
                if (permutation.get(i) > permutation.get(dippedind)) {
                    swap(permutation, i, dippedind);
                    break;
                }
            }
            int breakpoint = (dippedind + 1 + n) / 2;
            for (int i = dippedind + 1; i < breakpoint; i++) {
                swap(permutation, i, (n - (i - dippedind - 1) - 1));
            }
        }
        return permutation;
    }

    private static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
