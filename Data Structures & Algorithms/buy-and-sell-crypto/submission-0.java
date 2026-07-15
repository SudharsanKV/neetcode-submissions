class Solution {
    public int maxProfit(int[] prices) {
        int b = 0, s = 1;
        int result = 0;
        while(s < prices.length){
            if(prices[s] >= prices[b]){
                int currentSum = prices[s] - prices[b];
                result = Math.max(result, currentSum);
            } else {
                b=s;
            }
                s++;
        }
        return result;
        
    }
}
