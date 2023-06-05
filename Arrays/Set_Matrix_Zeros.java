import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        // brute
        // int n = matrix.length;
        // int m = matrix[0].length;
        // int [][] ans = new int [n][m];
        // for (int i=0; i<n; i++)
        // {
        //     for (int j=0; j<m; j++)
        //     {
        //             ans[i][j] = matrix[i][j];
        //     }
        // }
        // for (int i=0; i<n; i++)
        // {
        //     for (int j=0; j<m; j++)
        //     {
        //         if (matrix[i][j] ==0)
        //         {
        //             for (int c=0; c<m; c++)
        //             {
        //                 ans[i][c] = 0;
        //             }
        //             for (int r=0; r<n; r++)
        //             {
        //                 ans[r][j] = 0;
        //             }
        //         }
        //     }
        // }
        // for (int i=0; i<n; i++)
        // {
        //     for (int j=0; j<m; j++)
        //     {
        //             matrix[i][j] = ans[i][j];
        //     }
        // }

        //better
        // int n = matrix.length;
        // int m = matrix[0].length; 
        // int rowmap [] = new int [n];
        // int colmap [] = new int [m];
        // for (int i=0; i<n; i++)
        // {
        //     for (int j=0; j<m; j++)
        //     {
        //         if (matrix[i][j]==0)
        //         {
        //             rowmap[i] = 1;
        //             colmap[j] = 1;
        //         }
        //     }
        // } 
        // for (int i=0; i<n; i++)
        // {
        //     for (int j=0; j<m; j++)
        //     {
        //         if (rowmap[i]==1 || colmap[j]==1)
        //         {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // } 

        //optimal
        int n = matrix.length;
        int m = matrix[0].length; 
        boolean col0 = false;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                if (matrix[i][j]==0)
                {
                    if (j==0)
                        col0 = true;
                    else
                        matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        } 
        for (int i=1; i<n; i++)
        {
            for (int j=1; j<m; j++)
            {
                if (matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j] = 0;
                }
            }
        }
        if (matrix[0][0]==0)
        {
            for (int row=0; row<m; row++)
                matrix[0][row] = 0;
        }
        if (col0)
        {
            for (int col=0; col<n; col++)
                matrix[col][0] = 0;
        }

    }

}
