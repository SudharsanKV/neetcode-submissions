class Solution {
    public List<String> generateParenthesis(int n) {
        String str = "";
        List<String> ans = new ArrayList<>();
        generateString(n, 0, 0, str, ans);
        return ans;
    }

    public void generateString(int n, int open, int close, String str, List<String> ans){
        if(str.length() >= n*2 ){
            ans.add(str);
            return;
        }
        if(open<n){
            generateString(n, open+1, close, str+"(", ans);
        }
        if(close<open){
            generateString(n, open, close+1, str+")", ans);
        }
    }
}
