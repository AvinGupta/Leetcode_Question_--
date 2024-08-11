class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String ch = tokens[i];
            if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
                int val1 = st.pop();
                int val2 = st.pop();
                int res = 0;
                if (ch.equals("+")) {
                    res = val2 + val1;
                } else if (ch.equals("-")) {
                    res = val2 - val1;
                } else if (ch.equals("*")) {
                    res = val2 * val1;
                } else if (ch.equals("/")) {
                    res = val2 / val1;
                }
                st.push(res);
            } else {
                st.push(Integer.valueOf(ch));
            }
        }
        return st.peek();
    }
}
