class Solution {
    public int maxFreqSum(String s) {

        int a=0,e=0,i=0,o=0,u=0;
        int[] c = new int[26];

        for(char ch : s.toCharArray()) {
            if(ch=='a') a++;
            else if(ch=='e') e++;
            else if(ch=='i') i++;
            else if(ch=='o') o++;
            else if(ch=='u') u++;
            else c[ch-'a']++;
        }

        int max = Math.max(a, Math.max(e, Math.max(i, Math.max(o,u))));

        int freq = 0;
        for(int x : c)
            freq = Math.max(freq, x);

        return max + freq;
    }
}