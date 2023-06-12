import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) {
		int [][] dp = new int [m][n];
        for (int [] arr : dp)
            Arrays.fill(arr,-1);
        return memoization(m-1,n-1,dp);
    }
    private static int memoization(int r, int c,int [][]dp)
    {
        if (r==0 && c==0) return 1;
        if (r==-1||c==-1) return 0;
        if (dp[r][c] != -1) return dp[r][c];
        int up = memoization(r-1,c,dp);
        int left = memoization(r,c-1,dp);
        return dp[r][c] = up+left;
    }
}
