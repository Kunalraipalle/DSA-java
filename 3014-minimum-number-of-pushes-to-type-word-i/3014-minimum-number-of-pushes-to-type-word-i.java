class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int r = 0;

        for (int x = 0; x < n; x++) {
            // x=8 then 8/8=1+1=2
            //x=16 then 16/8=2+1=3
            int temp=x/8+1;
            r = r + temp;
        }

        return r;
    }
}