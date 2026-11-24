class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> result = new ArrayList<>(row*col);
        int i=0, j=0;
        while(row>1 && col>1){
            for(int k=1; k<col; k++){
                result.add(matrix[i][j]);
                j++;
            }
            for(int k=1; k<row; k++){
                result.add(matrix[i][j]);
                i++;
            }
            for(int k=1; k<col; k++){
                result.add(matrix[i][j]);
                j--;
            }
            for(int k=1; k<row; k++){
                result.add(matrix[i][j]);
                i--;
            }
            row-=2;
            col-=2;
            i++;
            j++;
        }
        if(col==1){
            for(int k=0; k<row; k++){
                result.add(matrix[i][j]);
                i++;
            }
        } else if(row==1){
            for(int k=0; k<col; k++){
                result.add(matrix[i][j]);
                j++;
            }
        }
        return result;

    }
}