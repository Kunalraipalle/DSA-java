class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        int pow19=1162261467;
        return pow19 % n==0;
        
    }
}