class Solution {
    public int jump(int[] nums) {
        int goal = nums.length-1;
        int jumps = 0;
        int maxjumpFromCurrIdx = 0;
        int lastMaxJumpTo = 0;

        for(int i=0; i< nums.length-1; i++){

            maxjumpFromCurrIdx = Math.max(maxjumpFromCurrIdx, i+nums[i]);
            
            if(i == lastMaxJumpTo){
                jumps++;
                lastMaxJumpTo = maxjumpFromCurrIdx;

                if(lastMaxJumpTo >= nums.length-1){
                    break;
                }
            }
        }
        return jumps;
    }
}
