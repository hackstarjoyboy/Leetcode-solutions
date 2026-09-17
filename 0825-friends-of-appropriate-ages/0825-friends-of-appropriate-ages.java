class Solution {
    public int numFriendRequests(int[] ages) {
      int[] count=new int[121];
      for(int age:ages){
        count[age]++;
      }
      int totalRequests=0;
      for(int agex=15;agex<=120;agex++){
        if(count[agex]==0)continue;
        for(int agey=15;agey<=120;agey++){
            if(count[agey]==0) continue;
            if(agey>0.5*agex+7 && agey<=agex){
                totalRequests+=count[agex]*count[agey];
                if(agex==agey){
                    totalRequests-=count[agex];
                }
            }
        }
      }
return totalRequests;
    }
}