class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if (r * c != row * col) {
            return mat;
        }
        int[][] result = new int[r][c];
       
       
        
        
        int matRow=0;
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = mat[matRow][index];
                index++;
                if(index==col){
                    index=0;
                    matRow++;
                }
            }
        }
        return result;
    }
}