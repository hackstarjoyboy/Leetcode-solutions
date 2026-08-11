class Solution {
    public int findCenter(int[][] edges) {
int countN=edges.length+1;
  int[] degree=new int[countN+1];
  
   for(int[] relation: edges){
    int u=relation[0];
    int v=relation[1];
    degree[u]++;
    degree[v]++;
   }
   for(int i=1;i<=countN;i++){
    if(degree[i]==countN-1){
        return i;
    }

   }

return -1;





    }
}