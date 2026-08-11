class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jwel = new HashSet<>();
        int c = 0;
        for (int i = 0; i < jewels.length(); i++) {
            jwel.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (jwel.contains(stones.charAt(i))) {
                c++;
            }
        }
        return c;
    }
}