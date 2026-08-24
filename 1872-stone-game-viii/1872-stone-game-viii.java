class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;

        int[] prefix = stones.clone();

        //sum of all prefix nums
        for (int i = 1; i < n; i++) {
            prefix[i] += prefix[i - 1];
        }

       //calculate the best score for alice
        int best = prefix[n - 1];

       // max diff for bob
        for (int i = n - 2; i >= 1; i--) {
            best = Math.max(best, prefix[i] - best);
        }

        return best;
    }
}