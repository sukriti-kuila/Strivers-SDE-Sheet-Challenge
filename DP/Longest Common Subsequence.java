import java.util.*;
// memoize
public class Solution {

	public static int lcs(String s, String t) {
		int [][] dp = new int [s.length()][t.length()];
		for (int [] arr : dp)
		Arrays.fill(arr,-1);
		return helper(s.length()-1, t.length()-1, s, t, dp);
    }
	private static int helper(int i, int j, String s, String t, int [][] dp) {
		if (i==-1 || j==-1) return 0;
		if (dp[i][j] != -1) return dp[i][j];
		int equal = 0;
		int notEqual = 0;
		if (s.charAt(i)==t.charAt(j))
		{
			equal = 1+helper(i-1,j-1,s,t, dp);
		}
		else
		{
			notEqual = Math.max(helper(i-1, j, s, t,dp), helper(i, j-1, s, t, dp));
		}
		return dp[i][j] = Math.max(equal, notEqual);
	}

}
