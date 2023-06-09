import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        long sumofnNum = (n*(n+1))/2;
        long sumofarr = 0;
        int m = 0;
        int r = 0;
        for (int e : arr)
            sumofarr += e;
        long sumofsqnum = (n*(n+1)*(2*n+1))/6;
        long sumofsqarr = 0;
        for (int e: arr)
            sumofsqarr += (e*e);
        long sub = sumofarr-sumofnNum;  
        long sum = (sumofsqarr-sumofsqnum)/sub;  
        // System.out.println(sub+" "+sum);  
        r = (int)(sub+sum)/2;
        m = (int) (sum-sub)/2;
        return new int[]{m,r};
    }
}

// using BigInteger instead of long (10/11 test cases passed using long)
import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        BigInteger sumofnNum = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n + 1)).divide(BigInteger.valueOf(2));
        BigInteger sumofarr = BigInteger.ZERO;
        BigInteger sumofsqnum = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n + 1)).multiply(BigInteger.valueOf(2 * n + 1)).divide(BigInteger.valueOf(6));
        BigInteger sumofsqarr = BigInteger.ZERO;
        int m = 0;
        int r = 0;
        
        for (int e : arr) {
            BigInteger bigE = BigInteger.valueOf(e);
            sumofarr = sumofarr.add(bigE);
            sumofsqarr = sumofsqarr.add(bigE.multiply(bigE));
        }
        
        BigInteger sub = sumofarr.subtract(sumofnNum);
        BigInteger sum = sumofsqarr.subtract(sumofsqnum).divide(sub);
        
        r = sub.add(sum).divide(BigInteger.valueOf(2)).intValue();
        m = sum.subtract(sub).divide(BigInteger.valueOf(2)).intValue();
        
        return new int[]{m, r};
    }
}
