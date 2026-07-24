class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int t=0;
        for(int x=0;x<tickets.length;x++)
        {
            if(x<=k){
                t+=Math.min(tickets[x],tickets[k]);
            }
            else{
                t+=Math.min(tickets[x],tickets[k]-1);

            }
        }
        return t;


        
    }
}