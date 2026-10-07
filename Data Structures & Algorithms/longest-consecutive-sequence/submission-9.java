class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }
        int ans = 1;
        for(int num: nums){
            if(!numSet.contains(num-1)){
                int count = 1;
                while(numSet.contains(num+1)){
                    num = num +1;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
