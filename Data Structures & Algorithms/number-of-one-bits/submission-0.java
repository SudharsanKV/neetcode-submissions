class Solution {
    public int hammingWeight(int n) {
        int a = 1;
        int count = 0;
        while(n > 0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
