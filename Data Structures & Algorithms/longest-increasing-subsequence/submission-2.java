class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n==1){
            return 1;
        }
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLength = 0;
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(nums[i]>nums[j]){ // Checking and storing how many previous elements are smaller than the current index.
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        return maxLength;
    }
}
