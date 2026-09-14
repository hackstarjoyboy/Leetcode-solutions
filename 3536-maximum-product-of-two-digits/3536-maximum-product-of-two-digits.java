class Solution {
    public int maxProduct(int n) {
        int m1=0;
       int m2=0;
       while(n>0){
        int res=n%10;
        n/=10;
      if(m1<res){
        m2=m1;
        m1=res;
      }
      else if(res>m2){
        m2=res;
      }

       }

return m1*m2;


    }
}