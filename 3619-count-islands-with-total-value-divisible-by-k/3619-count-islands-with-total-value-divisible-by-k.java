class Solution {
    public int countIslands(int[][] grid, int k) {
        if(grid==null||grid.length==0||k==0){
            return 0;
        }
        int row=grid.length;
        int col=grid[0].length;
        int count=0;

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(grid[r][c]>0){
                    long number=dfs(grid,r,c);
                    if(number>0&number%k==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    private long  dfs(int[][] grid,int r,int c){
        if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]==0){
            return 0;
        }
     long sum=grid[r][c];
        grid[r][c]=0;
        sum+=dfs(grid,r-1,c);
        sum+=dfs(grid,r+1,c);
        sum+=dfs(grid,r,c+1);
        sum+=dfs(grid,r,c-1);
        return sum;

    }
}