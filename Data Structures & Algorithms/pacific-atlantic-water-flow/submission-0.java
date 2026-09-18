class Solution {
    public int[][] DIR = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int r = heights.length;
        int c = heights[0].length;

        Queue<int[]> pacific = new LinkedList<>();
        Queue<int[]> atlantic = new LinkedList<>();

        boolean[][] canReachPacific = new boolean[r][c];
        boolean[][] canReachAtlantic = new boolean[r][c];

        for(int i=0; i<r; i++){
            pacific.offer(new int[]{i, 0});
            canReachPacific[i][0] = true;

            atlantic.offer(new int[]{i, c-1});
            canReachAtlantic[i][c-1] = true;
        }
        for(int i=0; i<c; i++){
            pacific.offer(new int[]{0, i});
            canReachPacific[0][i] = true;

            atlantic.offer(new int[]{r-1, i});
            canReachAtlantic[r-1][i] = true;
        }

        bfs(heights, pacific, canReachPacific);
        bfs(heights, atlantic, canReachAtlantic);

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(canReachPacific[i][j] && canReachAtlantic[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }

        return result;

    }

    public void bfs(int[][] heights, Queue<int[]> queue, boolean[][] visited){
        int maxr = heights.length;
        int maxc = heights[0].length;
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            for(int l=0; l<4; l++){
                int nr = r+ DIR[l][0];
                int nc = c+ DIR[l][1];

                if(nr<0 || nr>=maxr || nc<0 || nc>=maxc || visited[nr][nc]==true){
                    continue;
                }

                if(heights[nr][nc] >= heights[r][c]){
                    queue.offer(new int[]{nr,nc});
                    visited[nr][nc]=true;
                }
            }
        }
    }
}
