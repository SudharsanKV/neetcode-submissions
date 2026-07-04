class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> hasValue = new HashSet<>();
        for(int n : nums){
            if(hasValue.contains(n)){
                return true;
            }
            hasValue.add(n);
        } 
        return false;
    }
}