import java.util.HashSet;

class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer> no = new HashSet<>();

        for (int x : nums) {
            no.add(x);
        }

        int miss = 1;
        while (no.contains(miss)) {
            miss++;
        }

        return miss;
    }
}
