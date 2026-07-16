class Solution {
    public int coinChange(int[] coins, int amount) {
   
   Integer[] memo=new Integer[amount+1];
   int result=dfs(coins,amount,memo);
   return  result==Integer.MAX_VALUE?-1:result;
   }
   private int dfs(int[] coins,int rem,Integer[] memo){
 if(rem==0) return 0;
 if(rem<0) return Integer.MAX_VALUE;
 if(memo[rem]!=null) return memo[rem];
 int minCoins=Integer.MAX_VALUE;
 for(int coin:coins){
    int res=dfs(coins,rem-coin,memo);
    if(res!=Integer.MAX_VALUE){
        minCoins=Math.min(minCoins,1+res);
    }
 }
 memo[rem]=minCoins;
  return memo[rem];
   }
}
   
 
 
