class Solution {
    public boolean isUgly(int n) {
        if(n<=0||n==7||n==11){
            return false;
        }
        int[] prime={2,3,5};
        for(int p:prime){
            while(n%p==0){
                n=n/p;
            }
        }
        return n==1;
    }
}
