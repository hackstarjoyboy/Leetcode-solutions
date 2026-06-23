class Solution {
    public int arrangeCoins(int n) {
        if(n==0||n<0) return 0;
        int i=1;
        int count=0;
        while(n>=i){
            n=n-i;
            i++;
            count++;

        }
        return count;
    }
}