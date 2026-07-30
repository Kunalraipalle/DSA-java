class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length(), n2 = word2.length();
        char[] result = new char[n1 + n2];

        if (n1 == n2) {
            for (int i = 0, x = 0; i < n1; i++) {
                result[x] = word1.charAt(i);
                x = x + 1;
                result[x] = word2.charAt(i);
                x++;
            }
            return new String(result);
        }

        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);

        int x = 0;
        for (int i = 0; i < max; i++) {

            if (i < n1) {
                result[x] = word1.charAt(i);
                x = x + 1;
            }

            if (i < n2) {
                result[x] = word2.charAt(i);
                x = x + 1;
            }
        }
        return new String(result);
    }
}
