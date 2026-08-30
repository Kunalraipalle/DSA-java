class Solution {
    public int kthFactor(int n, int k) {

        int[] temp =new int[n];
        int c=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                temp[c]=i;
                c++;

            }
        }
        temp[c]=n;

         if(temp[k-1]>0){
            return temp[k-1];
         }
         return -1;
        
    }
}