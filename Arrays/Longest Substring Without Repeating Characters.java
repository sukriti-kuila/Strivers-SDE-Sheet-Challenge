// Brute
class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList <Character> list = new ArrayList();
        int l = 0, r=0;
        int len = 0;
        while (r<s.length())
        {
            char ch = s.charAt(r);
            if (!list.contains(ch))
            {
                list.add(ch);
                len = Math.max(len, (r-l)+1);
                r++;
            }
            else
            {
                while (list.contains(ch))
                {
                    list.remove(0);
                    l++;
                }
            }
        }
        return len;
    }
}

// optimal

import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String s) 
    {
		int l = 0;
        int r = 0;
        int len = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r<s.length())
        {
            char ch = s.charAt(r);
            if (map.containsKey(ch))
            {
                l = Math.max(map.get(ch)+1, l);
            }
            map.put(ch,r);
            len = Math.max(len, r-l+1);
            r++;
        }
        return len;
	}
}
