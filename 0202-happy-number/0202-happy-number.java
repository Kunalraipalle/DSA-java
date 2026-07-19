class Solution {
    public boolean isHappy(int n) {
        //When you square the digits of 1, the result is always 1: 1^2 =1 
        if (n == 1) return true;
        // 4 hit the unhappy loop 4 -> 16-> 37-> 58-> 145-> 42-> 20-> 4
        if (n == 4) return false; 
        return isHappy(Next(n));
    }
    
    private int Next(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            totalSum += d * d;
            n = n / 10;
        }
        return totalSum;
    }
}
