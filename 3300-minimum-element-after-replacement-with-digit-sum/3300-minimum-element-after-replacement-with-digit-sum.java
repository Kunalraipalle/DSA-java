class Solution {
    public int minElement(int[] nums) {
       int n=nums.length-1;
        int[] cpy=new int[n+1];

        for(int i=0;i<=n;i++){
            cpy[i]=sum(nums[i]);
        }
        int min = cpy[0]; 
        for (int i = 1; i <= n; i++) {
            if (cpy[i] < min) {
                min = cpy[i]; 
            }
        }
        
        return min;
        
        
    }
    int sum(int num){
       int sum=0;
       int rem=0;

        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
       return sum;
    }
}