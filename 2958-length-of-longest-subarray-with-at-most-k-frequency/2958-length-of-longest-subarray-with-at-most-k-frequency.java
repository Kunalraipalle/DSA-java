class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int cnt = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            int x = nums[r];
            freq.put(x, freq.getOrDefault(x, 0) + 1);
           
            while (freq.get(x) > k) {
                freq.put(nums[l], freq.get(nums[l]) - 1);
                l += 1;
            }
            cnt = Math.max(cnt, r - l + 1);
        }

        return cnt;
    }
}