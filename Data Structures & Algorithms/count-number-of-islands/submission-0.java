
class Pair{
    int i;
    int j;
    public Pair(int i, int j){
        this.i = i;
        this.j = j;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;

        int count = 0; 
        for(int i=0; i< n; i++){
            for(int j=0; j<m; j++){

                if(grid[i][j] == '1'){
                    count++;
                    grid[i][j] = '0';
                    q.add(new Pair(i, j));
                    while(!q.isEmpty()){
                        Pair rp = q.remove();
                        for(int l=0; l<4; l++){
                            int ni = rp.i + dx[l];
                            int nj = rp.j + dy[l];
                            if(ni >=0 && ni<n && nj>=0 && nj<m && grid[ni][nj] == '1'){
                                grid[ni][nj] = '0';
                                q.add(new Pair(ni, nj));
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
