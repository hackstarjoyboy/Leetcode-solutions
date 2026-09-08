class Solution {
    public int deleteGreatestValue(int[][] grid) {
       for(int[] row:grid){
        Arrays.sort(row);
       }
       int totalSum=0;
       int rows=grid.length;
       int cols=grid[0].length;
       for(int col=0;col<cols;col++){
        int max=0;
        for(int row=0;row<rows;row++){
        if(grid[row][col]>max){
            max=grid[row][col];
        }
        }
        totalSum+=max;
       }
       return totalSum;
    }

}