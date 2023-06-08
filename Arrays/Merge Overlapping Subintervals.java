import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;

import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        List <Interval> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b)-> a.start-b.start);
        int prevST = intervals[0].start;
        int prevFT = intervals[0].finish;
        for (Interval in : intervals)
        {
            if (prevFT>=in.start)
            {
                prevFT = Math.max(prevFT, in.finish);
            }
            else
            {
                ans.add(new Interval(prevST, prevFT));
                prevST = in.start;
                prevFT = in.finish;
            }
        }
        ans.add(new Interval(prevST, prevFT));
        return ans;
    }
}
