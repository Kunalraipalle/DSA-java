class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> letter = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
            if (letter.contains(c)) {
                return c;
            }  
            letter.add(c);
        }
        
        return ' '; 
    }
}