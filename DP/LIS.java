// Recursion
class Solution {
    public int lengthOfLIS(int[] nums) {
       return helper(nums,0,Integer.MIN_VALUE);
    }
    private int helper(int [] nums, int curr, int prev)
    {
        if (curr==nums.length) return 0;
        int pick = Integer.MIN_VALUE;
        if (nums[curr]>prev)
            pick = 1+helper(nums,curr+1,nums[curr]);
        int nonpick = helper(nums,curr+1,prev);
        return Math.max(pick,nonpick);
    }
}
// Memoization
import java.util.*;
public class Solution {

	public static int longestIncreasingSubsequence(int arr[]) {
		int n = arr.length;
        int[][] dp = new int[n][n+1];
        for (int a[] : dp)
            Arrays.fill(a,-1);
		return memoize(arr, 0, -1, dp);
	}
	private static int memoize(int [] arr, int ind, int prevInd, int [][] dp)
	{
		if (ind == arr.length) return 0;
		if (dp[ind][prevInd+1] != -1) return dp[ind][prevInd+1];
		int notPick = memoize(arr, ind+1, prevInd, dp);
		int pick = Integer.MIN_VALUE;
		if (prevInd==-1 || arr[ind]>arr[prevInd])
		{
			pick = 1+memoize(arr,ind+1,ind,dp);
		}
		return dp[ind][prevInd+1]=Math.max(pick, notPick);
	}	
}

// BinarySearch
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int [] temp = new int [n];
        temp[0] = nums[0];
        int index = 1;
        for (int i=1; i<n; i++)
        {
            if (nums[i]>temp[index-1])
            {
                temp[index++]=nums[i];
            }    
            else
            {
                int ind = lowerbound(temp,0,index-1,nums[i]);
                temp[ind] = nums[i];    
            }
        }
        return index;
    }
    private int lowerbound(int [] a, int s, int e, int target)
    {
        while(s<=e)
        {
            int mid = e-(e-s)/2;
            if (a[mid]==target)
                return mid;
            if (a[mid]>target)
                e = mid-1;
            else
                s = mid+1;        
        }
        return e+1;
    }
}
