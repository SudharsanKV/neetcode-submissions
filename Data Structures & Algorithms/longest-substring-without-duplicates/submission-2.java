class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int result = 0;
        Set<Character> charSet = new HashSet<>();

        for(int j = 0; j< s.length(); j++){
            char currentChar = s.charAt(j);
            
            while(charSet.contains(currentChar)){
                charSet.remove(s.charAt(i));
                i++;
            }

            charSet.add(currentChar);
            result = Math.max(result, j-i+1);
        }
        return result;
        
    }
}
