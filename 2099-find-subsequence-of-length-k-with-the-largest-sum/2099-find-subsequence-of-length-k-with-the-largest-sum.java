class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
     List<Integer> list=new ArrayList<>();
     for(int num:nums){
        list.add(num);
     }
     while(list.size()>k){
        int minIndex=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<list.get(minIndex)){
                minIndex=i;
            }
        }
        list.remove(minIndex);
     }
     int[] result=new int[k];
     for(int i=0;i<k;i++){
        result[i]=list.get(i);
     }
     return result;
    }
}