class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int max = -1;

        for (int i = 0; i <= n - k; i++) {
          
            if (max < i) {
                max = i;
                for (int j = i + 1; j < i + k; j++) {
                    if (nums[j] >= nums[max]) {
                        max = j;
                    }
                }
            } 
            else if (nums[i + k - 1] >= nums[max]) {
                max = i + k - 1;
            }

            ans[i] = nums[max];
        }

        return ans;
    }
}