class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] arr=new int[1001];
        int r=nums.length;
        int c=nums[0].length;
        List<Integer> res=new ArrayList<>();
   
        for(int i=0;i<r;i++){
            for(int j=0;j<nums[i].length;j++){
              arr[nums[i][j]]++;

                }
            }

        for(int i=1;i<1001;i++){
            if(arr[i]==r){
                res.add(i);
            }

        }
       
        return res;
        
    }
}