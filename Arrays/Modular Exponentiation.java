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

