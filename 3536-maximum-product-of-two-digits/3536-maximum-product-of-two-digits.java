class Solution {
    public int maxProduct(int n) {
       List<Integer> ll=new ArrayList<>();
       while(n>0){
        int res=n%10;
        n/=10;
        ll.add(res);
       }
       int m1=0;
       int m2=0;
       for(int num:ll){
      if(m1<num){
        m2=m1;
        m1=num;
      }
      else if(num>m2){
        m2=num;
      }

       }

return m1*m2;


    }
}