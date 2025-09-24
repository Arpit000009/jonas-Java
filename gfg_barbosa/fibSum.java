package gfg_barbosa;
import java.util.Scanner;

class Solution {
    static long fibSum(long N) {
        // code here
        long one = 0;
        long two = 1;
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        long sum = 1;
        for (int i = 2; i <= N; i++) {
            long num = two;
            two = (one + two) % 1000000007;
            one = num;
            sum = (sum + two) % 1000000007;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       System.out.println(fibSum(n));
       s.close();
    }
}