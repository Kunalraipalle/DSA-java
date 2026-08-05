import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        // sorted duplicate String[]
        String[] dupli = new String[n];
        for (int i = 0; i < n; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            dupli[i] = new String(c);
        }

        List<List<String>> result = new ArrayList<>();
        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (vis[i])
            {
                 continue;
            }
            List<String> l1 = new ArrayList<>();
            
            l1.add(strs[i]);
            vis[i] = true;

            for (int j = i + 1; j < n; j++) {
                if (!vis[j] && dupli[i].equals(dupli[j])) {
                    l1.add(strs[j]);
                    vis[j] = true;
                }
            }

            result.add(l1);
        }

        return result;
    }
}