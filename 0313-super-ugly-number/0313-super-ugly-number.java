class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
       int k=primes.length;
       long[] dp=new long[n];
       dp[0]=1;
       int[] pointers=new int[k];
       long[] vals=new long[k];
       for(int j=0;j<k;j++){
        vals[j]=primes[j];
       } 
       for(int i=1;i<n;i++){
        long minVal=Long.MAX_VALUE;
        for(int j=0;j<k;j++){
            if(vals[j]<minVal){
                minVal=vals[j];
            }
        }
        dp[i]=minVal;
        for(int j=0;j<k;j++){
            if(vals[j]==minVal){
                pointers[j]++;
                vals[j]=dp[pointers[j]]*primes[j];
            }
        }
       }
       return (int) dp[n-1];
    }
}