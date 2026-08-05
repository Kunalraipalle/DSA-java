import java.util.*;
//solved same approch by using nested loop but runtime is 428ms so i made this solution hashmap based
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;

        Map<String, List<String>> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
           
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String dupli = new String(c);

            m.putIfAbsent(dupli, new ArrayList<>());
            List<String> l1 = m.get(dupli);
            l1.add(strs[i]);
        }

        return new ArrayList<>(m.values());
    }
}
/*
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
*/