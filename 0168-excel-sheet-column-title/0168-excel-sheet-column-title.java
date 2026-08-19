class Solution {
    public String convertToTitle(int col) {
        char[] arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        String ans = "";

        while (col > 0) {
            col--;
            int rem = col % 26;
            ans = arr[rem] + ans;
            col /= 26;
        }

        return ans;
    }
}