import java.util.* ;
import java.io.*; 
// Memoization
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

// tabulation
public static int uniquePaths(int m, int n) {
		return tabulation(m,n);
	}
	private static int tabulation (int m, int n) {
		int [][] dp = new int [m][n];
		for (int i=0; i<m; i++)
		{
			for (int j=0; j<n; j++)
			{
				if (i==0&&j==0)
				{
					dp[0][0] = 1;
					continue;
				}
				int up = 0;
				int left = 0;
				if (i>0)
					up = dp[i-1][j];
				if (j>0)
					left = dp[i][j-1];
				dp[i][j] = left+up;		
			}
		}
		return dp[m-1][n-1];
	}

}
