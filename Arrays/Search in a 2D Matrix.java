import java.util.ArrayList;

public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
        int lo = 0;
        if (matrix.size() == 0)
            return false;
        int n = matrix.size();
        int m = matrix.get(0).size();
        int hi = (n * m) - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (matrix.get(mid / m).get(mid % m) == target) {
                return true;
            }
            if (matrix.get(mid / m).get(mid % m) < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }
}
