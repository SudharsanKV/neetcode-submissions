class Solution {
    public int maxSubArray(int[] nums) {
        int largestSum = nums[0];
        int length = nums.length;
        int currentSum = nums[0];
        for(int i=1; i < length; i++){
            int localSum = currentSum + nums[i];
            currentSum = (nums[i] > localSum) ? nums[i] : localSum;
            largestSum = (currentSum > largestSum) ? currentSum : largestSum;
        }
        return largestSum;
    }
}
