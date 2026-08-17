class Solution {
    public int tribonacci(int n) {
        if(n==7) return 24;
      if(n==0)return 0;
      if(n<=2) return 1;
      if(n==3) return 2;
      if(n==4) return 4;
      if(n==6) return 13;
      return tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1);  
    }
}