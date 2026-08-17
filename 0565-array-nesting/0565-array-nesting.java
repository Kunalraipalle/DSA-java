class Solution {
    public int arrayNesting(int[] nums) {
        int max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                int cur = i;
                int c = 0;
                
                while (nums[cur] != -1) {
                    int next = nums[cur];
                    nums[cur] = -1; 
                    cur = next;
                    c++;
                }
                
                max = Math.max(max, c);
            }
        }
        
        return max;
    }
}