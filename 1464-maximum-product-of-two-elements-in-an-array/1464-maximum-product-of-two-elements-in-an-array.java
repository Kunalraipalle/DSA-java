class Solution {
    public int maxProduct(int[] nums) {

       int x=0,y=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>=x)
        {
            y=x;
            x=nums[i];
            
        }
        else if(y<nums[i]){
            y=nums[i];
        }
       }
       return (x-1)*(y-1);
        
    }
}