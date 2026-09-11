class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        int slen = s.length();
        boolean []dp = new boolean[slen+1];
        dp[0]=true;

        for(int i=1; i<=slen; i++){
            for(int j=0; j<i; j++){
                if(dp[j] && wordSet.contains(s.substring(j,i))){ // checking set has substring words, If so, mark till that substring end, there is a word in Dict
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[slen];
        
    }
}
