import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
         List<Integer> result = new ArrayList<>();
         
        int n = nums.length , max = nums[0], min = nums[0];

        for(int i : nums){
            max = Math.max(i, max);
            min = Math.min(i, min);
        }

        
        int[] arr = new int[max + 1];
        //every available elment is contain 1
        for(int i : nums){
            arr[i]++;
        }
        // if any number not available they are conatining the 0
        for(int i=min;i<max;i++){
            if(arr[i] == 0)
                result.add(i);
        }
        return result;


    }
}
