// code studio (constraints n>=1)
import java.io.*;
import java.util.*;
public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.        
        if (n == 0) return 1;
        long res = modularExponentiation(x, n / 2, m) % m;
        res = (res * res) % m;
        if (n % 2 == 1)
            res = (res * x) % m;
        return (int) res;
    }
}

// leetcode pow(x,y) [constraint n can be negative also]
// recursive method
    public double myPow(double x, int n) {
        double ans = helper(x, (long) n);
        return n >= 0 ? ans : 1.0 / ans;
    }

    private double helper(double x, long n) {
        if (n == 0) return 1.0;
        double res = helper(x, n / 2);
        if (n % 2 == 0)
            return res * res;
        return x * res * res;
    }

// iterative way
public double myPow(double x, int n) {
        long nn = n;
        if (n<0) nn *= -1;
        double ans = 1.0;
        while (nn>0)
        {
            if (nn%2==0)
            {
                x *= x;
                nn /= 2;
            }
            else
            {
                ans *= x;
                nn -= 1;
            }
        }
        System.out.println(ans);
        return n>=0? ans: 1.0/ans;
    }

