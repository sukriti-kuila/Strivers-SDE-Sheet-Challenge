import java.util.* ;
import java.io.*; 
public class Solution {
	public static long maxSubarraySum(int[] arr, int n) {
		long sum = 0;
		long ans = 0;
		for (int ele : arr)
		{
			sum += ele;
			ans = Math.max(sum,ans);
			if (sum<0)
				sum = 0;
		}
		return ans; 
	}
}
