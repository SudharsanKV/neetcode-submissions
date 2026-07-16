class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> intMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            intMap.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int value = target-nums[i];
            if(intMap.containsKey(value) && intMap.get(value) != i){
                return new int[]{i, intMap.get(value)};
            }
        }
        return new int[0];
        
    }
}
