class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        findCombinations(0, nums, target, curr, ans);
        return ans;
        
    }
    public void findCombinations(int idx, int[] nums, int target, List<Integer> curr, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target<0 || idx >=nums.length){
            return;
        }
        curr.add(nums[idx]);
        findCombinations(idx, nums, target - nums[idx], curr, ans);
        curr.remove(curr.size()-1);
        findCombinations(idx+1, nums, target, curr, ans);
    }
}
