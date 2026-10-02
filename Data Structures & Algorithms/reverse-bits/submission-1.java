class Solution {
    public int reverseBits(int n) {

        int res = 0;
        for(int i=0; i<32; i++){
            // 1. Shift your result left to make room for the new bit
            res <<= 1;
            
            // 2. Grab the rightmost bit of n and add it to res
            res |= (n & 1);
            
            // 3. Shift n right using the UNSIGNED shift (>>>) 
            // This brings down the next bit to the 0th position
            n >>>= 1;
        }
        return res;
    }
}
