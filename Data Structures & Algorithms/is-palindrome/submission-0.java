class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            char si = s.charAt(i);
            char ei = s.charAt(j);

            if(Character.toLowerCase(si) == Character.toLowerCase(ei)){
                i++;
                j--;
            } else if(i!=j && !Character.isLetterOrDigit(si)){
                i++;
            } else if(i!=j && !Character.isLetterOrDigit(ei)){
                j--;
            } else{
                return false;
            }
        }
        return true;
        
    }
}
