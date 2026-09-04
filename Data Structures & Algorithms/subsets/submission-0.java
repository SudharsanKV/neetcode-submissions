class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        generateSubsets(0, nums, curr, ans);
        return ans;
    }
    public void generateSubsets(int idx, int[] nums, List<Integer> curr, List<List<Integer>> ans){
        if(idx >= nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        generateSubsets(idx+1, nums, curr, ans);
        curr.add(nums[idx]);
        generateSubsets(idx+1, nums, curr, ans);
        curr.remove(curr.size()-1);
    }
}
