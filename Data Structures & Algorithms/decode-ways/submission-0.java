class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0) == '0'){
            return 0;
        }
        int[] dp = new int[s.length()+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<= s.length(); i++){

            //Check the previous character and if it is not 0,
            int singleDigit = s.charAt(i-1) - '0';
            if(singleDigit >=1 && singleDigit <=9){
                dp[i] += dp[i-1];
            }

            //Checking the last 2 characters and if it fals under range, using it values
            int doubleDigit = Integer.parseInt(s.substring(i-2, i));
            if(doubleDigit >= 10 && doubleDigit <=26){
                dp[i]+= dp[i-2];
            }
        }
        return dp[s.length()];
    }
}
