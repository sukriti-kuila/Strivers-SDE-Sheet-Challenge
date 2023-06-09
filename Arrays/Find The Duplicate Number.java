import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        // 10/11 test cases are passed O(n^2)
        // int index = 0;
        // while(true)
        // {
        //     while (arr.get(index) != index+1)
        //     {
        //         int correctIndex = arr.get(index)-1;
        //         if (arr.get(correctIndex)==arr.get(index))
        //             return arr.get(index);
        //         else
        //         {
        //             int temp = arr.get(correctIndex);
        //             arr.set(correctIndex, arr.get(index));
        //             arr.set(index, temp);    
        //         }
        //     }
        //     index++;
        // }
      
        // slow-fast pointer method
        int slow = arr.get(0);
        int fast = arr.get(0);
        do 
        {
            slow = arr.get(slow);
            fast = arr.get(arr.get(fast));

        }while(slow != fast);
        slow = arr.get(0);
        while (slow != fast)
        {
            slow = arr.get(slow);
            fast = arr.get(fast);
        }
        return fast;

    }
}
