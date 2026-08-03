class Solution {
    public int characterReplacement(String s, int k) {
        int [] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){
            char rChar = s.charAt(right);
            count[rChar - 'A']++;
            maxFreq = Math.max(maxFreq, count[rChar - 'A']);

            if((right - left + 1) - maxFreq > k){
                char sChar = s.charAt(left);
                count[sChar - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);

        }
        return maxLength;
    }
}
