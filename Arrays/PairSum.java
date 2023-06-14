import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        HashMap <Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();
        for (int e: arr)
        {
            if (map.containsKey(s-e))
            {
                if (e>(s-e))
                {
                    for (int i=0; i<map.get(s-e); i++){
                        list.add(new int[]{s-e,e});
                    }
                }
                else
                {
                    for (int i=0; i<map.get(s-e); i++){
                        list.add(new int[]{e,s-e});
                    }
                }
            }
            map.put(e,map.getOrDefault(e, 0)+1);
        }
        Collections.sort(list, (a,b)->{
            return Integer.compare(a[0],b[0]);
            });
        return list;   
    }
}
