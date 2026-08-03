/*
  ALGORITHM
 1. Loop backwards from n - 1 to 0.
 2. Try taking 1, 2, or 3 stones and compute: takeSum - nextDp.
 3. Track the maximum score difference using maxDiff.
 4. Shift variables dp3, dp2, dp1 leftward.
 5. Return "Alice" if dp1 > 0, "Bob" if dp1 < 0, else "Tie".
 */
class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int a = 0, b = 0, c = 0, t = 0;

        for (int i = stoneValue.length - 1; i >= 0; i--) {
            t += stoneValue[i];
            int cur = t - Math.min(a, Math.min(b, c));
            c = b;
            b = a;
            a = cur;
        }
        int bob = t - a;
        if (a > bob) {
            return "Alice";
        }

        if (a < bob) {
            return "Bob";
        }

        return "Tie";
    }
}