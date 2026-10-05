class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0); 
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(0);
            } else {
                int inner = st.pop();
                int cuur = 0;
                if (inner == 0) {
                    cuur = 1; 
                } else {
                    cuur = 2 * inner; 
                }
                int outer = st.pop();
                st.push(outer + cuur);
            }
        }

        return st.peek();
    }
}