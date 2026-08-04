import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        
        boolean[] pr = new boolean[max + 1];
        for (int num : nums) {
            pr[num] = true;
        }

        for (int i = min + 1; i < max; i++) {
            if (!pr[i]) {
                result.add(i);
            }
        }
        
        return result;
    }
}
