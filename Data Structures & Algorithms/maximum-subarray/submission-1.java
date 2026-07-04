class Solution {
    public int maxSubArray(int[] nums) {
        int largestSum = nums[0];
        int currentSum = 0;
        for(int num : nums){
            if(currentSum < 0)
                currentSum = 0;
            currentSum += num;
            largestSum = Math.max(currentSum, largestSum);
        }
        return largestSum;
    }
}
