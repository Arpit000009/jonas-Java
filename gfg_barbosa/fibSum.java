// User function Template for Java
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
}