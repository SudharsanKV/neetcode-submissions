class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length-1;
        for(int i = nums.length-2; i>=0; i--){
            if(nums[i] >= goal-i){ // If I am standing at index i, can my maximum possible jump reach or overshoot the current goal post (length)?
                goal = i;
            }
        }
        return goal == 0;
        
    }
}
