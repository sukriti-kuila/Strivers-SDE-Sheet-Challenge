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
