class Solution {
    public void setZeroes(int[][] matrix) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int[] row = new int[rowLength];
        int[] column = new int[columnLength];
        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < columnLength; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }

        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < columnLength; j++){
                if(row[i] == 1){
                    matrix[i][j] = 0;
                }
                if(column[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
