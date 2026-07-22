class Solution {
    public int longestConsecutive(int[] nums) {  
        if(nums.length == 0){
            return 0;
        }

        Set<Integer> hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }
        int result = 1;
        for(int num : nums){
            if(!hashSet.contains(num-1)){
                int count = 1;
                while(hashSet.contains(num+count)){
                    count++;
                    result = Math.max(result, count);
                }
            }
        }
        return result;
    }
}
