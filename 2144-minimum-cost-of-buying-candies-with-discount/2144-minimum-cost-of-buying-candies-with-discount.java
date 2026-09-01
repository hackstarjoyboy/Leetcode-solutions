class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int counter=0;
        int sum=0;
        int n=cost.length;
        for(int i=n-1;i>=0;i--){
            if(counter==2){
                counter=0;
                continue;
            }
            sum+=cost[i];
            counter+=1;
        }
        return sum;
    }
}