class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        int index = -1;
        while(low<=high){
            int mid =  low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= nums[0] && target < nums[0]){
                low = mid+1;
            } else if(nums[mid] < nums[0] && target >= nums[0]){
                high = mid-1;
            } else {
                if(nums[mid] > target){
                    high = mid-1;
                } else{
                    low = mid+1;
                }
            }
        }
        return index;        
    }
}
