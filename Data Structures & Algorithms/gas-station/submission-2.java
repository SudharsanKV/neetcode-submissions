class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas =0;
        for(int g : gas){
            sumGas += g;
        }
        int sumCost =0;
        for(int c : cost){
            sumCost += c;
        }
        if(sumGas<sumCost){ // returning if the total gas < total cost
            return -1;
        }

        int total = 0;
        int result =0;
        for(int i=0; i< gas.length; i++){
            total += gas[i]-cost[i];
            if(total<0){
                total = 0;
                result = i+1;
            }
        }
        return result;

    }
}
