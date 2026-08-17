class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        double avg = Double.MAX_VALUE;
        
        while (l < r) {
            double avg1 = (nums[l] + nums[r]) / 2.0;
            avg = Math.min(avg, avg1);
            l++;
            r--;
        }
        
        return avg;
    }
}