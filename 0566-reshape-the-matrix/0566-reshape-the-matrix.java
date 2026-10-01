class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if (r * c != row * col) {
            return mat;
        }
        int[][] result = new int[r][c];
        int[] arr = new int[row * col];
        int index = 0;
        for (int[] nums : mat) {
            for (int num : nums) {
                arr[index++] = num;
            }
        }
        index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = arr[index++];
            }
        }
        return result;
    }
}