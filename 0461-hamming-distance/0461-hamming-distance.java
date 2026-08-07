class Solution {
    public int hammingDistance(int x, int y) {
        String b_x = "";
        String b_y = "";
        while (x > 0) {
            int remainder = x % 2;
            b_x = remainder + b_x;
            x = x / 2;
        }
        while (y > 0) {
            int remainder = y % 2;
            b_y = remainder + b_y;
            y = y / 2;
        }
        // try to make same both digit  in  binary 
        while (b_x.length() < b_y.length()) {
            b_x = "0" + b_x;
        }
        while (b_y.length() < b_x.length()) {
            b_y = "0" + b_y;
        }

        int dist = 0;
        for (int i = 0; i < b_x.length(); i++) {

            if (b_x.charAt(i) != b_y.charAt(i)) {
                dist++;
            }
        }
        return dist;

    }
}