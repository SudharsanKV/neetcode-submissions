class Solution {
    public int rob(int[] nums) {
        int a = 0;
        int b = 0;
        for(int num : nums){
            int c = Math.max(b, num+a);
            a=b;
            b=c;
        }
        return b;
        
    }
}
