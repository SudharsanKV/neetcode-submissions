class Solution {
    public int uniquePaths(int m, int n) {
        int[] columns = new int[n];
        for(int i =0; i<n; i++){
            columns[i] = 1;
        }
        for(int i =1; i<m; i++){
            for(int j=1; j<n; j++){
                columns[j] += columns[j-1];
            }
        }
        return columns[n-1];
    }
}
