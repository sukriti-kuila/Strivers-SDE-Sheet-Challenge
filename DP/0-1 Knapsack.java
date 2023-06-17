// Memoization
import java.util.ArrayList;
import java.util.*;
public class Solution {
	public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
		int [][] dp = new int [n][w+1];
		for (int [] arr : dp)
			Arrays.fill(arr,-1);
		return memoization(n-1,w,values,weights,dp);
	}
	private static int memoization (int ind, int w, ArrayList<Integer>val, ArrayList<Integer>wt, int[][] dp)
	{
		if (ind==0)
		{
			if (wt.get(0)<=w)
				return val.get(0);
			else 
				return 0;	
		}
		if (dp[ind][w] != -1) return dp[ind][w];
		int notPick = memoization(ind-1,w,val,wt,dp);
		int pick = Integer.MIN_VALUE;
		if (wt.get(ind)<=w)
			pick = val.get(ind)+memoization(ind-1,w-wt.get(ind),val,wt,dp);
		return dp[ind][w]=Math.max(notPick, pick);
	}
}
