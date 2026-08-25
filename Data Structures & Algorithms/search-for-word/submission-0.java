class Solution {
    public boolean exist(char[][] board, String word) {
        char[] wordArr = word.toCharArray();
        int wordlength = word.length();
        int rows = board.length;
        int columns = board[0].length;
        boolean[][] used = new boolean[rows][columns];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j< board[0].length; j++){
                if(isWordExist(board, wordArr, 0, used, i, j)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWordExist(char[][] board, char[] wordArr, int idx, boolean[][] used, int crow, int ccol){
        if(crow<0 || crow >=board.length || ccol < 0 || ccol >= board[0].length || used[crow][ccol] == true || board[crow][ccol] != wordArr[idx]){
            return false;
        }
        if(idx == wordArr.length-1){
            return true;
        }
        used[crow][ccol] = true;
        boolean left = isWordExist(board, wordArr, idx+1, used, crow-1, ccol);
        boolean right = isWordExist(board, wordArr, idx+1, used, crow+1, ccol);
        boolean top = isWordExist(board, wordArr, idx+1, used, crow, ccol-1);
        boolean bottom = isWordExist(board, wordArr, idx+1, used, crow, ccol+1);
        used[crow][ccol] = false;
        return left || right || top || bottom;
    }
}
