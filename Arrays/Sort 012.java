import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        // Brute O(N)+O(N)
        // int c0 = 0;
        // int c1 = 0;
        // int c2 = 0;
        // for (int i=0; i<arr.length; i++)
        // {
        //     if (arr[i]==0) c0++;
        //     else if (arr[i]==1) c1++;
        //     else c2++;
        // }
        // for (int i=0; i<c0; i++)
        //     arr[i]=0;
        // for (int i=0;i<c1; i++)
        //     arr[i+c0] = 1;
        // for (int i=0; i<c2; i++)
        //     arr[i+c1+c0] = 2;        

        // Optimal
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high)
        {
            if (arr[mid]==0)
            {
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if (arr[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(arr,mid,high);
                high--;
            }
        }    
    }
    private static void swap(int []a, int i, int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
