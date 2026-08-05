class Solution {
    public void setZeroes(int[][] matrix) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        boolean firstRow = false;
        boolean firstColumn = false;
        for(int i = 0; i < rowLength; i++){
            if(matrix[i][0] == 0){
                firstColumn = true;
            }
        }
        for(int j = 0; j < columnLength; j++){
            if(matrix[0][j] == 0){
                firstRow = true;
            }
        }


        for(int i = 1; i < rowLength; i++){
            for(int j = 1; j < columnLength; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < rowLength; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < columnLength; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j = 1; j < columnLength; j++){
            if(matrix[0][j] == 0){
                for(int i = 1; i < rowLength; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        if (firstRow) {
            for (int j = 0; j < columnLength; j++) {
                matrix[0][j] = 0;
            }
        }
        if (firstColumn) {
            for (int i = 0; i < rowLength; i++) {
                matrix[i][0] = 0;
            }
        }

    }
}
