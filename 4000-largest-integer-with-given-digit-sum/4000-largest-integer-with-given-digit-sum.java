class Solution {
    public int largestInteger(int n, int s) {
        
        //The only non-negative integer whose digits sum to 0 is 0.
        if (s == 0) 
         {
             return 0;
         }
        //There is no integer with at most 2 digits that has a sum of digits of 19,
       // so the answer is -1
        if (s > (9 * n)) 
        {
            return -1;
        }

         int result = 0;
        //The largest integer with at most 2 digits that has a sum of digits of 9 is 90.
        for (int i = 0; i < n; i++) {
            int digit = Math.min(9, s);
            result = result * 10 + digit;
            s -= digit;
        }
        return result;
        
        
    }
}