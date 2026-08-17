class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1;
        int sum = 0;
        
        while (n > 0) {
            int temp = n % 10;
            p *= temp;
            sum += temp;
            n /= 10;
        }
        
        return p - sum;
    }
}