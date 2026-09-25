class Solution {
    public int minDeletionSize(String[] strs) {
        int numCols=strs[0].length();
        int numRows=strs.length;
        int count=0;

     for(int col = 0 ; col < numCols ; col++){

       for(int row = 1 ; row < numRows ; row++){

      if(strs[row-1].charAt(col) > strs[row].charAt(col)){
        count++;
        break;
      }

       }



     }

   return count;

    }
}