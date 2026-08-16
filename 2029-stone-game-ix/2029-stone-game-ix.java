class Solution {
    public boolean stoneGameIX(int[] stones) {
        int sum = 0;
        int a=0,b=0,c=0;
        for (int s : stones) {

            if(s%3==0){
                a++;
            }
            else if(s%3==1){
                b++;
            }
            else{
                c++;
            }
        }
        if(a%2==0){
            return c>0 && b>0;
        }
        else {
            return Math.abs(b-c) >2;
        }
    }
}