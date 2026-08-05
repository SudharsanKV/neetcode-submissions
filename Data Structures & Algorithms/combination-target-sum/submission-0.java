class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, ans, curr, nums, target);
        return ans;
    }

    public void findCombination(int index, List<List<Integer>> ans, List<Integer> curr, int[] nums, int target){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if (target < 0 || index >= nums.length) {
            return;
        }

        curr.add(nums[index]);
        findCombination(index, ans, curr, nums, target - nums[index]);
        curr.remove(curr.size() - 1);
        findCombination(index + 1, ans, curr, nums, target);
    }
}
