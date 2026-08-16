class Solution {
    public int[] getNoZeroIntegers(int n) 
    {   int sum=0;
       int[] arr=new int[2];
        for(int a=1,l=n-1;a<n;a++,l--){
             if (Zero(l) || Zero(a)) {
                continue;
            }else{
                arr[0]=a;
                arr[1]=l;
                return arr;
            }
        }

        return arr;
        
    }
    private boolean Zero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}