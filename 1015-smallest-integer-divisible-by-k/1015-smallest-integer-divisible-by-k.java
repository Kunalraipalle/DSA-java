/*Find the number of digits in the smallest number made only of 1s (like 1, 11, 111, 1111) that can be divided perfectly by K without any remainder (0).
*/
class Solution {
    public int smallestRepunitDivByK(int K) {
        int rem = 0;


        for (int l = 1; l <= K; l++) 
        {   
            //remainder = (remainder * 10 + 1) % K;
            rem = (rem * 10 + 1) % K;
            if (rem == 0) {
                // returning l (number of 1's in digit which remainder is 0)
                return l;
            }
        }
        return -1;
    }
}