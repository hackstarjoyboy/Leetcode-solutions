class Solution {
    public int minDistance(String word1, String word2) {
     
        int m = word1.length();
        int n = word2.length();
        
        // 1D DP array to store the current row's edit distances
        int[] dp = new int[n + 1];
        
        // Initialize base case: converting an empty word1 to word2 of length j
        // requires j insertions.
        for (int j = 0; j <= n; j++) {
            dp[j] = j;
        }
        
        // Iterate through word1 characters (rows)
        for (int i = 1; i <= m; i++) {
            // prev tracks the diagonal value dp[i-1][j-1]
            int prev = dp[0];
            
            // Base case for the current row: converting word1 of length i 
            // to an empty word2 requires i deletions.
            dp[0] = i;
            
            // Iterate through word2 characters (columns)
            for (int j = 1; j <= n; j++) {
                // Temporarily store the cell directly above before overwriting it
                int temp = dp[j]; 
                
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    // Characters match: cost remains the same as the diagonal
                    dp[j] = prev;
                } else {
                    // Characters mismatch: 1 + min(Replace, Delete, Insert)
                    // prev     = Replace (diagonal)
                    // temp     = Delete (above)
                    // dp[j-1]  = Insert (left)
                    dp[j] = 1 + Math.min(prev, Math.min(temp, dp[j - 1]));
                }
                
                // The cell directly above becomes the diagonal for the next iteration
                prev = temp; 
            }
        }
        
        return dp[n];
    }

}