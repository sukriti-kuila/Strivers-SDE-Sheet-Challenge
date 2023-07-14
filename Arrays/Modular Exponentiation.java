// code studio (constraints n>=1) 
// Luv method
public static int modularExponentiation(int a, int b, int n) {
    if (a == 0) {
        return 0;
    }
    int ans = 1;
    while (b > 0) {
        if ((b & 1) != 0) {
            ans = (int) (((long) ans * a) % n);
        }
        a = (int) (((long) a * a) % n);
        b = b >> 1;
    }
    return ans;
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
class Solution {
    public double myPow(double a, int m) {
        if (a==0) return 0;
        if (m==0) return 1;
        long n = m;
        double ans = 1;
        long b = n>=0?n:-n;
        while (b>0)
        {
            if ((b&1)==1)
            {
                ans = ans*a;
            }
            a = a*a;
            b >>= 1;
        }
        return n>0?ans:(1.0/ans);
    }
}

