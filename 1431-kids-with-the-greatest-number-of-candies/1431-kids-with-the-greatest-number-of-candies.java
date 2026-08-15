class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for (int i:candies){
            max=Math.max(i,max);
        }
        List<Boolean> result=new ArrayList<>();
        int x=0;
        for(int i:candies){
            if(i+extraCandies>=max){
                result.add(true);
                
            }
            else{
                result.add(false);
            }
            x++;
        }       
        return result ;
    }
}