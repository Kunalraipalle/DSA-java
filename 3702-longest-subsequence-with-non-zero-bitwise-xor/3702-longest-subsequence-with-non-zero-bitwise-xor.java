class Solution {
    public int longestSubsequence(int[] nums) {

        int a = 0;
         boolean z = true;

        for (int i : nums) {
            if (i != 0) {
                z = false;
                break;
            }
        }

        if (z) {
            return 0;
        }

        for (int i : nums) {
            a ^= i;
        }
        if (a != 0) {
            return nums.length;
        }
        return nums.length - 1;
    }
}