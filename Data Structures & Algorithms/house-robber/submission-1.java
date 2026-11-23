class Solution {
    public int rob(int[] nums) {
        int a = 0;
        int b = 0;
        for(int n : nums){
            int c = Math.max(b, a+n);
            a=b;
            b=c;
        }
        return b;
    }
}
