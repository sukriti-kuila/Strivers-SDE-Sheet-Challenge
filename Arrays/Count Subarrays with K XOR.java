import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0,1);
		int xr = 0;
		int count = 0;
		for (int i=0; i<arr.size(); i++)
		{
			xr ^= arr.get(i);
			int x = xr^k;
			if (map.containsKey(x))
			{
				count += map.get(x);
			}
			map.put(xr, map.getOrDefault(xr, 0)+1);
		}
		return count;
	}
}
