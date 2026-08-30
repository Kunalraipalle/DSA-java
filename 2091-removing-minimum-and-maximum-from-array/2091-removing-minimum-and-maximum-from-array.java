class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return 1;
        }
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[min]) {
                min = i;
            }
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        int l = Math.min(min, max);
        int r = Math.max(min, max);

        int a = r + 1;
        int b = n - l;
        int c = (l + 1) + (n - r);

        int x = a;

        if (b < x) {
            x = b;
        }
        if (c < x) {
            x = c;
        }

        return x;
    }
}
