import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		int max = 1;
		int min = 1;
		int ans = arr.get(0);
		for (int ele: arr)
		{
			int temp = max;
			int maxtemp = Math.max(max*ele, min*ele);
			max = Math.max(ele, maxtemp);
			int mintemp = Math.min(temp*ele, min*ele);
			min = Math.min(ele, mintemp);
			ans = Math.max(ans, max);
		}
		return ans;
	}
}
