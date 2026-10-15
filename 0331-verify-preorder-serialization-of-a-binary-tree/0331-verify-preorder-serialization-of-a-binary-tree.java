class Solution {
    public boolean isValidSerialization(String preorder) {
      int capct=1;
      int i=0;
      int n=preorder.length();
      while(i<n){
        if(capct<=0){
            return false;
        }
        if( preorder.charAt(i)=='#'){
            capct-=1;
            i+=2;
        }else{
            capct=capct+1;
            while(i<n && preorder.charAt(i)!=','){
                i++;
            } i++;
        }
       
      }  
      return capct==0;
    }
}