class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length, l = 0, r = n - 1;

        return helper(nums, l, r) >= 0;
    }

    private int helper(int[] nums, int l, int r) {
        if (l == r) {
            return nums[l];
        }
        int pl = left(nums, l, r);
        int pr = right(nums, l, r);

        return Math.max(pl, pr);
    }

    private int right(int nums[], int l, int r) {

        return nums[r] - helper(nums, l, r - 1);
    }

    private int left(int nums[], int l, int r) {
        return nums[l] - helper(nums, l + 1, r);
    }
}
