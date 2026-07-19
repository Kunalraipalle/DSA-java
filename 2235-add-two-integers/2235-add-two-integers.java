class Solution {
    public int sum(int num1, int num2) {
    return add(num1,num2);
    
    }
       
     static int add(int num1, int num2) 
    { 
        if (num2 == 0) 
    {
            return num1;
     }
        return add(num1 ^ num2, (num1 & num2) << 1);
    }
    
    
}