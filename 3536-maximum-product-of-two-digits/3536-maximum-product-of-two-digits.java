class Solution {
    public int maxProduct(int n) {

        int rem =0;
        int[] digit = new int[10]; 
        int i=0;
        while(n!=0){
            rem=n%10;
            digit[i]=rem;
            n/=10;
            i++;
        }
        int product=0,tempprod=0;
        for(int x=0;x<=digit.length-2;x++)
        {
            for(int y=x+1;y<digit.length-1;y++){
            tempprod=digit[x]*digit[y];
            if(tempprod>product){
                product=tempprod;
            }
            
            }
            
        }
        return product;
    }
}