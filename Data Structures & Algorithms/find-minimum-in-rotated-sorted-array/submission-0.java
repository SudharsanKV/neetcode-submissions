class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int length = nums.length;
        int high = length - 1;
        int ans = nums[0];
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] > nums[low] && nums[high] < nums[mid]){
                low = mid+1;
            } else if(nums[mid] < nums[low] && nums[high] > nums[mid]){
                high = mid - 1;
            } else {
                if(nums[mid]> nums[low]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            ans = Math.min(ans, nums[mid]);
        }
        return ans;
        
    }
}
