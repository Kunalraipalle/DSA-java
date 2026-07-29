import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int mid = n / 2;
        char[] ch = s.toCharArray();

        Arrays.sort(ch, 0, mid);

        int revst;
        if (n % 2 == 0) {
            revst = mid;
        } else {
            revst = mid + 1;
        }

        for (int i = revst; i < n; i++) {
          //The Mirror Formula
            ch[i] = ch[n - 1 - i];
        }

        return new String(ch);
    }
}
