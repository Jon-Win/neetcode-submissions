class Solution {
    public int numIslands(char[][] grid) {
        int count = 0; 

        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[r].length; c++){
                if (grid[r][c] == '1'){
                    count++;
                    bfs(grid,r,c);
                }
            }
        }

        return count;
    }

    public void bfs(char[][] grid, int row, int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[row].length || grid[row][col] == '0'){
            return; 
        }

        grid[row][col] = '0';
        bfs(grid, row-1, col); //up
        bfs(grid, row+1, col); //down
        bfs(grid, row, col-1); //left
        bfs(grid, row, col+1); //right
    }
}
