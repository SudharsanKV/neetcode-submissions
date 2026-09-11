class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int max=nums[0];
        int cMax = nums[0];
        int cMin = nums[0];
        for(int i=1; i< n; i++){
            int num = nums[i];

            if(num<0){
                int temp = cMax;
                cMax = cMin;
                cMin = temp;
            }

            cMax = Math.max(num, cMax*num);
            cMin = Math.min(num, cMin*num);

            max = Math.max(max, cMax);
        }
        return max;
    }
}
