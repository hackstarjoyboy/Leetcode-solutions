class Solution {
    public int gcdOfOddEvenSums(int n) {
      long sumOdd=0;
      long sumEven=0;
        for(int i=1;i<=n;i++){
            sumOdd+=(2*i-1);
            sumEven+=(2*i);
        }
        return (int) gcd(sumOdd,sumEven);
    }
    private long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}