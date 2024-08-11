class Solution {
    public String removeStars(String s) {
        //Using Stack--------> 
        // if(s.length()=='1' && s.charAt(0)=='*') return "";
        // StringBuilder sb=new StringBuilder(s);
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<sb.length();i++){
        //     if(sb.charAt(i)!='*') st.push(sb.charAt(i));
        //     else st.pop();
        // }
        // sb=sb.delete(0,sb.length());
        // while(!st.isEmpty()) sb.append(st.pop());
        // sb=sb.reverse();
        // return sb.toString();

        //Using StringBuilder only
        if(s.length()=='1' && s.charAt(0)=='*') return "";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='*') sb.append(ch);
            else sb=sb.delete(sb.length()-1,sb.length());
        }
        return sb.toString();
    }
}
