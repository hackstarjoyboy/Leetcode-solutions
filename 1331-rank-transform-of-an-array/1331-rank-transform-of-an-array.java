class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] nums=arr.clone();
                 Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            
            map.putIfAbsent(nums[i],map.size()+1);
        }
        for(int j=0;j<arr.length;j++){
            arr[j]=map.get(arr[j]);
        }
        return arr;
    }
}