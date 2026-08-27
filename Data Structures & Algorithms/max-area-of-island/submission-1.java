class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                int currentArea = bfs(grid, i, j);
                maxArea = Math.max(currentArea,maxArea);
            }
        }
        return maxArea;
    }

    public int bfs(int[][] grid, int r, int c){
        if(r<0 || r >= grid.length || c<0 || c >= grid[0].length || grid[r][c] == 0){
            return 0;
        }

        grid[r][c] = 0;

        return 1 + bfs(grid, r+1, c)
        + bfs(grid, r-1, c)
        + bfs(grid, r, c+1)
        + bfs(grid, r, c-1);
    }
}
