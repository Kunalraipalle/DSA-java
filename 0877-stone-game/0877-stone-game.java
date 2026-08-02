class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
      
        Integer[][] memo = new Integer[n][n]; 
        return helper(piles, 0, n - 1, memo) >= 0;
    }

    private int helper(int[] piles, int l, int r, Integer[][] memo) {
        if (l == r) {
            return piles[l];
        }
        
        if (memo[l][r] != null) {
            return memo[l][r];
        }
        int pl = piles[l] - helper(piles, l + 1, r, memo);
        int pr = piles[r] - helper(piles, l, r - 1, memo);
        
        memo[l][r] = Math.max(pl, pr);
        
        return memo[l][r];
    }
}
