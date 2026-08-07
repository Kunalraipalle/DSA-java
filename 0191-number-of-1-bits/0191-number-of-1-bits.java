class Solution {
    public int hammingWeight(int n) {

        String binary = "";
        int count = 0;

        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }
        for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                count++;
            }
        }
        return count;

    }
}