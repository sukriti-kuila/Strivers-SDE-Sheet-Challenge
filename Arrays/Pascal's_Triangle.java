import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
            ArrayList<ArrayList<Long>> ans = new ArrayList<>();
			for (int i=0; i<n; i++)
			{
				ans.add(findRow(i+1,i+1));
			}
			return ans;
	}
	private static ArrayList<Long> findRow (int row, int col)
	{
		long ans = 1;
		ArrayList <Long> list = new ArrayList<>();
		list.add(ans);
		for (int i=1; i<col; i++)
		{
			ans = (long)(ans*(row - i));
			ans = (long) ans/i;
			list.add(ans);
		}
		return list; 
	}
}
