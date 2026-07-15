import java.util.Arrays;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return new int[0];
        
        int[][] paired = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            paired[i][0] = arr[i];
            paired[i][1] = i;
        }
        
        Arrays.sort(paired, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] rank = new int[arr.length];
        int currentRank = 1;
        
        for (int j = 0; j < paired.length; j++) {
            if (j > 0 && paired[j][0] > paired[j - 1][0]) {
                currentRank++;
            }
            int originalIndex = paired[j][1];
            rank[originalIndex] = currentRank;
        }
        
        return rank;
    }
}
