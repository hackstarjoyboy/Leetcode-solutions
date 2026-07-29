class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n=bombs.length;
        int maxdetonate=0;
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
           graph.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            long x1=bombs[i][0];
            long y1=bombs[i][1];
            long r1=bombs[i][2];
            for(int j=0;j<n;j++){
                if(i==j) continue;
             long x2=bombs[j][0];
             long y2=bombs[j][1];
             long dx=x1-x2;
             long dy=y1-y2;
             if(dx*dx+dy*dy<=r1*r1){
                graph.get(i).add(j);
             }
            }
        }
          for(int i=0;i<n;i++){
            maxdetonate=Math.max(maxdetonate,bfs(graph,i,n));
            if(maxdetonate==n){
                break;
            }
          }
          return maxdetonate;
       }
    private int bfs(List<List<Integer>> graph ,int start,int n){
        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[n];
        queue.offer(start);
        visited[start]=true;
        int count=0;
        while(!queue.isEmpty()){
            int currentbomb=queue.poll();
            count++;
            for(int neighbor:graph.get(currentbomb)){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.offer(neighbor);
                }
            }
        }
        return count;
    }
}