class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length <= 1){
            return nums;
        }
        int length = nums.length;
        int[] presum = new int[length];
        presum[0] = nums[0];
        for(int i=1; i< length; i++){
            presum[i] = presum[i-1] * nums[i];
        }
        int[] postsum = new int[length];
        postsum[length -1] = nums[length -1];
        for(int i=length-2; i>=0; i--){
            postsum[i] = postsum[i+1] * nums[i];
        }
        int[] result = new int[length];
        for(int i=0; i< length; i++){
            if(i == 0){
                result[i] = postsum[i+1];
            } else if(i == length-1){
                result[i] = presum[length-2];
            } else {
                result[i] = presum[i-1] * postsum[i+1];
            }
        }
        return result;
        
    }
}  
