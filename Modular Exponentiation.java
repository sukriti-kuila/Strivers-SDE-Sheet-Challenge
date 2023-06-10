import java.io.*;
import java.util.*;

public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        long result = myPow(x, n, m);
        return (int) result;
    }
    
    public static long myPow(int x, int n, int m) {
        if (n == 0) {
            return 1;
        }
        
        long temp = myPow(x, n / 2, m) % m;
        long result = (temp * temp) % m;
        
        if (n % 2 == 1) {
            result = (result * x) % m;
        }
        
        return result;
    }
}
