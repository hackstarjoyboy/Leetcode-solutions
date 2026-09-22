class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
     for(int i=left;i<=right;i++){
        boolean isPrime=countBits(i);
        if(isPrime){
            count++;
        }
     }
     return count;
    }
    private boolean countBits(int n){
    if(n==1) return false;
     int count=0;
     while(n>0){
        if((n&1)==1){
            count++;
        }
        n=n>>1;
     }
   return isPrime(count);
}

private boolean isPrime(int n){
    return n==2||n==3||n==5||n==7||n==11||n==13||n==17||n==19||n==23||n==29||n==31;
}



}
