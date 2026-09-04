class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int r=nums.length;
        int c=nums[0].length;
        List<Integer> res=new ArrayList<>();
   
        for(int i=0;i<r;i++){
            for(int j=0;j<nums[i].length;j++){
                map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
                if(map.get(nums[i][j])==r){
                    res.add(nums[i][j]);
                }
            }

        }
        Collections.sort(res);
        return res;
        
    }
}