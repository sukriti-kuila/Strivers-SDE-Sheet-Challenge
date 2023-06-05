import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int ans = 0;
        int minSoFar = prices.get(0);
        for (int ele : prices)
        {
            ans = Math.max(ans, ele-minSoFar);
            minSoFar = Math.min(ele, minSoFar);
        }
        return ans;
    }
}
