class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        List<Integer> result = new ArrayList<>(rows*columns);
        int i = 0, j=0;
        while(rows>1 && columns >1){
            for(int k = 1; k<columns; k++){
                result.add(matrix[i][j]);
                j++;
            }
            for(int k = 1; k<rows; k++){
                result.add(matrix[i][j]);
                i++;
            }
            for(int k = 1; k<columns; k++){
                result.add(matrix[i][j]);
                j--;
            }
            for(int k = 1; k<rows; k++){
                result.add(matrix[i][j]);
                i--;
            }
            i++; j++; rows-=2; columns-=2;
        }
        if(rows==1){
            for(int k =0; k<columns; k++){
                result.add(matrix[i][j]);
                j++;
            }
        } else if(columns==1) {
            for(int k =0; k<rows; k++){
                result.add(matrix[i][j]);
                i++;
            }
        }
        return result;
        
    }
}
