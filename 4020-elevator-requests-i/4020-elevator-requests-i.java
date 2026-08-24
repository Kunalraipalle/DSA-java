class Solution {
    public int elevatorRequests(int n, int[] requests) {

        if(requests[0]==n) return 0;
        int sec=requests[0];
        for(int i=1;i<requests.length;i++){
            if(requests[i]==n){
                return sec;
            }
            else{
                sec+=Math.abs(requests[i]-requests[i-1]);
            }
        }
        return sec;
        
    }
}