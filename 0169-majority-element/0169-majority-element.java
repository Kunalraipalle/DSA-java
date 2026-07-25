class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }else if(nums.length==0){
            return 0;
        }
        nums = Arrays.stream(nums).sorted().toArray();
        int el=0,maxel=0;
        int temp=nums[0];
         int majorel = nums[0]; 
        
        for (int x : nums) {
            if (temp == x) {
                el++; 
            } else {
                temp = x;
                el = 1; 
            }
            
            if (el > maxel) {
                maxel = el;
                majorel = x;
            }
        }
        return majorel;

        
    }
}