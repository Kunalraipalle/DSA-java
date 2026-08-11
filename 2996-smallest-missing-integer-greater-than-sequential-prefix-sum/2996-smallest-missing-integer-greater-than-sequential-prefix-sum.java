class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i] - 1) {
                sum += nums[i];

            } else {
                break;
            }
        }
        Set<Integer> numscopy = new HashSet<>();
        for (int num : nums) {
            numscopy.add(num);
        }
        while(numscopy.contains(sum)){
            sum++;
        }
        return sum;

    }
}