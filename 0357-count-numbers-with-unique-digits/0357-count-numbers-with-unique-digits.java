class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int total=10;
        int current=9;
        int avail=9;
        for(int i=2;i<=n && avail>0;i++){
            current=current*avail;
            total=total+current;
            avail--;
        }
        return total;
    }
}