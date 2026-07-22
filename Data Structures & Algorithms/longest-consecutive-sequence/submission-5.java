class Solution {
    public int longestConsecutive(int[] nums) {

        // int highest = Integer.MIN_VALUE;
        // for(int i =0; i<nums.length; i++){
        //     if(nums[i] >= highest){
        //         highest = nums[i];
        //     }
        // }
        // int[] fmap = new int[highest+1];
        // for(int j=0; j< nums.length; j++){
        //     fmap[nums[j]]++;
        // }
        // int largestString = 0;
        // int curr = 0;
        // for(int i=0; i< highest; i++){
        //     if(fmap[i] != 0){
        //         curr++;
        //     } else{
        //         curr = 0;
        //     }
        //     largestString = Math.max(largestString, curr);
        // }
        // return largestString;

        if(nums.length < 1){
            return 0;
        }
        Arrays.sort(nums);
        int curr = 1;
        int largestString = 1;
        for(int i=1; i< nums.length; i++){
            if(nums[i] == nums[i-1]){
                continue;
            } else if(nums[i] == (nums[i-1] + 1)){
                curr++;
            } else{
                curr=1;
            }
            largestString = Math.max(largestString, curr);
        }
        return largestString;
    }
}
