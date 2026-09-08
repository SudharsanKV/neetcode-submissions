class Solution {
    public boolean canJump(int[] nums) {
        int length = nums.length-1;
        for(int i = length-1; i>=0; i--){
            if(i + nums[i] >= length){
                length = i;
            }
        }
        return length == 0;
        
    }
}
