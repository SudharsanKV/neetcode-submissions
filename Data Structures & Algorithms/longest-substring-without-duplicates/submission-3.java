class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int j = 0;
        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(ch);
            maxLength = Math.max(maxLength, i-j+1);
        }
        return maxLength;
    }
}