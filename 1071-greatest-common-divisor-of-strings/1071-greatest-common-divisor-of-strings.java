class Solution {

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public String gcdOfStrings(String str1, String str2) {
         //S1+S2=S2+S1 
        // Commutative property for strings!
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
    
        int gcd = gcd(str1.length(), str2.length());

        return str1.substring(0, gcd);

    }

}