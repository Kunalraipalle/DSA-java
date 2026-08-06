class Solution {
    public int smallestNumber(int n, int t) {
        for (int i = n; ; i++) {
            int prod = 1, num = i;
            for (int j=0;num > 0 && prod > 0; num /= 10) {
                prod *= num % 10;
            }
            if (prod % t == 0) return i;
        }
    }
}
