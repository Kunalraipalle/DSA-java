class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length, l = 0, r = n - 1;

        return helper(nums, l, r) >= 0;
    }

    private int helper(int[] nums, int l, int r) {
        if (l == r) {
            return nums[l];
        }
        int pl =nums[r] - helper(nums, l, r - 1);
        int pr = nums[l] - helper(nums, l + 1, r);

        return Math.max(pl, pr);
    }
}
