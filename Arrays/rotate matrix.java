// codestudio variant
import java.io.*; 

import java.util.* ;
public class Solution {    
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        int u = 0;
        int d = n-1;
        int l = 0;
        int r = m-1;
        while (l<r && u<d) {
            int prev = mat.get(u+1).get(l);
            for (int i=l;i<=r;i++) { 
                int curr = mat.get(u).get(i);
                mat.get(u).set(i,prev);
                prev = curr;
            }
            u++; 
           for (int i=u;i<=d;i++) {
                int curr = mat.get(i).get(r);
                mat.get(i).set(r,prev); 
                prev = curr;
            }
            r--;
            for (int i=r;i>=l;i--) {
                int curr = mat.get(d).get(i);
                mat.get(d).set(i,prev);
                prev = curr; 
           }
            d--;
            for (int i=d;i>=u;i--) {
                int curr = mat.get(i).get(l);
                mat.get(i).set(l,prev);
                prev = curr;
            }
            l++;
        }
    }
 }  
// leetcode
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        transpose(matrix);
        System.out.println(Arrays.deepToString(matrix));
        for (int i=0;i<n; i++)
        {
            for (int j=0; j<n/2; j++)
            {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n-j-1];
            matrix[i][n-j-1] = temp;
            }
        }
    }
    private void transpose (int [][] matrix) {
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=i+1; j<matrix.length; j++)
            {
                int temp = matrix[i][j];
                matrix [i][j] = matrix[j][i];
                matrix [j][i] = temp;
            }
        }
    }
}
