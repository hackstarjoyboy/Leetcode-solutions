class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] count=new int[10];
        for(int d:digits){
            count[d]++;

        }
        List<Integer> result=new ArrayList<>();
        for(int i=100;i<=998;i+=2){
            int d1=i/100;
            int d2=(i/10)%10;
            int d3=i%10;
            count[d1]--;
            count[d2]--;
            count[d3]--;
            if(count[d1]>=0&&count[d2]>=0&&count[d3]>=0){
                result.add(i);
            }
            count[d1]++;
            count[d2]++;
            count[d3]++;
        }
        int[] ans=new int[result.size()];
       for(int j=0;j<result.size();j++){
        ans[j]=result.get(j);
       }
        return ans;
        
    }
}