import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int ele = arr[0];
		int count = 1;
		for (int i=1; i<arr.length; i++)
		{
			if (count==0) ele = arr[i];
			if (ele==arr[i]) count++;
			else count--;
		}
		count = 0;
		for (int e : arr)
		{
			if (e==ele)
				count++;
		}
		return count>n/2?ele:-1;
	}
}
