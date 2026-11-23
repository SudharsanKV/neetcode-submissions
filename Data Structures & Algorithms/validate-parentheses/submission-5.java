class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else{
                if(st.size() == 0){
                    return false;
                } else{
                    char peek = st.peek();
                    if(ch == ')' && (peek == '{' || peek == '[')){
                        return false;
                    } else if(ch == '}' && (peek == '(' || peek == '[')){
                        return false;
                    } else if(ch == ']' && (peek == '{' || peek == '(')){
                        return false;
                    }
                    st.pop();
                }
            }
        }
        return st.size() == 0 ? true : false;
    }
}
