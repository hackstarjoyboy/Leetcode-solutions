class Solution {
    public int maxAreaOfIsland(int[][] grid) {
         int row=grid.length;
      int cols=grid[0].length;
    
      int max=0;
      for(int r=0;r<row;r++){ 
        for(int c=0;c<cols;c++){int perimeter=0;
           
            if(grid[r][c]==1){
                int currentArea=dfs(grid,r,c);
                max=Math.max(currentArea,max);
        }
        
      }   
    
      
    }
     return max;
    }

private int dfs(int[][] grid,int r,int c){
    if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]==0){
        return 0;
    }
    grid[r][c]=0;



   return 1+
   dfs(grid,r-1,c)+
   dfs(grid,r+1,c)+
   dfs(grid,r,c+1)+
    dfs(grid,r,c-1);
}



}