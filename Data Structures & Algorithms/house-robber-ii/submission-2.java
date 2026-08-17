class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(linearRob(nums, 0, nums.length-2), linearRob(nums, 1, nums.length-1));
    }

    public int linearRob(int[] nums, int s,int e){
        int a = 0;
        int b = 0;
        for(int i = s; i<=e; i++){
            int c = Math.max(b, a+nums[i]);
            a=b;
            b=c;
        }
        return b;
    }
}
