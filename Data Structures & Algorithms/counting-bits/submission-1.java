class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        result[0] = 0;;
        for(int i=1; i<=n; i++){
            int count = 0;
            int j = 0;
            while(j<32){
                if((i&(1<<j)) !=0 ){
                    count ++;
                }
                j++;
            }
            result[i] = count;
        }
        return result;
    }
}
