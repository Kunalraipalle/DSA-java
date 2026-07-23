class Solution {
    public boolean isNumber(String s) {
        boolean digit = false;
        boolean dot = false;
        boolean ex = false;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                digit = true;
            } else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                 {
                    return false;
                }
            } else if (c == '.') {
            
                if (dot || ex)
                 {
                    return false;
                }
                dot = true;
            } else if (c == 'e' || c == 'E') 
            {
                
                if (ex || !digit)
                 {
                    return false;
                }
                ex = true;
                digit = false;
            } else {
                return false; 
            }
        }
        
        return digit; 
    }
}
