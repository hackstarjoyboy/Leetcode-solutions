class Solution {
    public int repeatedNTimes(int[] nums) {
    HashMap<Integer,Integer> map=new HashMap<>();
    int ans=0;
    int n=nums.length/2;
    for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
        if(map.get(num)==n){
            ans=num;
        }
    }
    return ans;
    }
}