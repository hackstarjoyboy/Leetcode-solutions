class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Integer[] boxednum=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            boxednum[i]=nums[i];
        }
        Arrays.sort(boxednum,(a,b)->
        {
            Integer freqA=map.get(a);
            Integer freqB=map.get(b);
            if(freqA!=freqB){
                return Integer.compare(freqA,freqB);
            }
         return Integer.compare(b,a);

        });
        for(int i=0;i<boxednum.length;i++){
            nums[i]=boxednum[i];
        }
        return nums;
    }
}