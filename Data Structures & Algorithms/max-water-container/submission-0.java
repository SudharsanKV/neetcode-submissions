class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int ans = 0;
        while(i<j){
            int left = heights[i];
            int right = heights[j];
            ans = Math.max(ans, (j-i) * Math.min(left, right));
            if(left<right){
                i++;
            } else{
                j--;
            }
        }
        return ans;
        
    }
}
