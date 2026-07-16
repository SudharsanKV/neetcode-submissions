class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            while(i<j && !isAlphaNumeric(s.charAt(i))){
                i++;
            }
            while(j>i && !isAlphaNumeric(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;

        }
        return true;
        
    }
    public boolean isAlphaNumeric(char c){
        return (c>='A' && c<='Z' || c>='a' && c<='z' || c>='0' && c<='9');
    }
}
