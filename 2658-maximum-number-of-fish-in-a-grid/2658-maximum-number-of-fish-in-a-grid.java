class Solution {
    public int findMaxFish(int[][] grid) {
        int row=grid.length;
        int cols=grid[0].length;
        int maxFish=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]>0){
                    int countFish=dfs(grid,i,j);
                   maxFish=Math.max(countFish,maxFish);
                }
            }

        }
        return maxFish;
    }
    private int dfs(int[][] grid,int r,int c){
        if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]==0){
            return 0;
        } 
        int perimeter=grid[r][c];
        grid[r][c]=0;
       
        perimeter+=dfs(grid,r-1,c);
        perimeter+=dfs(grid,r+1,c);
        perimeter+=dfs(grid,r,c-1);
        perimeter+=dfs(grid,r,c+1);
        return perimeter;
    }
}