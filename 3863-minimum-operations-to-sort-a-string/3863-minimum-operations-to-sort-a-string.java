import java.util.Arrays;

class Solution {
    public int minOperations(String s) {
        int n = s.length();

        char[] ans = s.toCharArray();
        Arrays.sort(ans);

        if (s.equals(new String(ans))) {
            return 0;
        }
        
        if (n == 2) {
            return -1;
        }

        char min = s.charAt(0);
        char max = s.charAt(0);

        for (int i = 1; i < n; i++) {
            min = (char) Math.min(min, s.charAt(i));
            max = (char) Math.max(max, s.charAt(i));
        }

        int idx1 = s.indexOf(min);
        int idx2 = s.lastIndexOf(max);

        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        } else if (idx1 != n - 1 || idx2 != 0) {
            return 2;
        } else {
            return 3;
        }
    }
}
