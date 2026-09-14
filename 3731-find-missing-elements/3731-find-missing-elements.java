class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int[] freq=new int[101];
        List<Integer> l=new ArrayList<>();
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
        for(int num:nums){
            if(min>num){
                min=num;
            }
             if(max<num){
                max=num;
            }
          freq[num]++;
        }
     for(int i=min;i<max;i++){
        if(freq[i]==0){
            l.add(i);
        }
     }
return l;

    }
}