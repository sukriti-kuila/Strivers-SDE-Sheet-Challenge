import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n = arr.size();
        int ele1 = Integer.MAX_VALUE;
        int ele2 = Integer.MAX_VALUE;
        int c1 = 0;
        int c2 = 0;
        for (int i=0; i<arr.size(); i++)
        {
            if (c1==0 && arr.get(i)!=ele2)
            {
                c1++;
                ele1 = arr.get(i);
            }
            else if (c2==0 && arr.get(i)!=ele1)
            {
                c2++;
                ele2 = arr.get(i);
            }
            else if (arr.get(i)==ele1)
            {
                c1++;
            }
            else if (arr.get(i)==ele2)
            {
                c2++;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
		for (int e : arr)
		{
			if (e==ele1)
				c1++;
            else if (e==ele2)
                c2++;    
		}
        ArrayList <Integer> list = new ArrayList<>();
        if (c1>n/3) list.add(ele1);
        if (c2>n/3) list.add(ele2);
        return list;
    }
}
