class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum=0;
        int x=Math.max(1,n-k);
        int y=n+k;
       for(int i=x;i<=y;i++){
        if((n&i)==0){
            sum=sum+i;
        }
       }
       return sum;
    }
}