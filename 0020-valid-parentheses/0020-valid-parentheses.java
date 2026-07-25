import java.util.Stack;
/*
 1. Initialize an empty stack to track opening brackets.
 2. Loop through each character of the string.
 3. If an opening bracket '(', '{', or '[' is found, push it onto the stack.
 4. If a closing bracket ')', '}', or ']' is found:
     - Return false if the stack is empty (no matching opener).
     - Pop the top element and return false if it doesn't match the       current closer.
 5. After the loop, return true if the stack is empty, otherwise false.
 */

class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')'|| ch == '}' || ch == ']')
             {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
              
              // If the current character is ')', ']', or '}' but the stack does not contain the corresponding matching opening bracket '(', '[', or '{', return false.

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; 
                }
            }
        }
        boolean result=(boolean) stack.isEmpty();
        return result ;
    }
}
