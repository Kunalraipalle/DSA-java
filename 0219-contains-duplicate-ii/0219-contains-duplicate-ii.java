
// I found the solution right in the question! The problem asks for abs(i - j) <= k
import java.util.HashMap;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                // check the duplicate number is in range or not 
                if (i - j <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }
}