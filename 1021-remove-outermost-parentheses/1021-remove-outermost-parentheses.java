class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(ch);
                count++;
                if(count>1){
                    sb.append(st.peek());
                }
            }else{
                count--;
                if(count>=1){
                    sb.append(ch);
                    st.pop();
                }else{
                    st.pop();
                }
            }

        }
        return sb.toString();
    }
}