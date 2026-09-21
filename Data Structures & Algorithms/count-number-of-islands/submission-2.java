class Pair{
    int i;
    int j;
    public Pair(int i, int j){
        this.i=i;
        this.j=j;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int[] dx = {-1,0,1,0};
        int[] dy = {0,-1,0,1};

        int n = grid.length;
        int m = grid[0].length;
        int count =0;
        Queue<Pair> q = new LinkedList<>();

        for(int r=0; r<n; r++){
            for(int c=0; c<m; c++){
                if(grid[r][c]=='1'){
                    count++;
                    q.offer(new Pair(r,c));
                    grid[r][c] = '0';
                    while(!q.isEmpty()){
                        Pair pq = q.remove();
                        for(int l=0; l<4; l++){
                            int nr = pq.i+dx[l];
                            int nc = pq.j+dy[l];
                            if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc] == '1'){
                                grid[nr][nc] = '0';
                                q.offer(new Pair(nr,nc));
                            }
                        }
                    }
                }
            }
        }
        return count;

        
    }
}
