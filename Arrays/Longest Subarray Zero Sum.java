import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		int sum = 0;
		int ans = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<arr.size(); i++)
		{
			sum += arr.get(i);
			if (sum==0)
			{
				ans = Math.max(ans,i+1);
			}
			else if (map.containsKey(sum))
			{
				int size = i-map.get(sum);
				ans = Math.max(ans, size);
			}
			else
			{
				map.put(sum, i);
			}
		}
		return ans;
	}
}
