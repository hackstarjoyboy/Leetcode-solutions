class Solution {
    public int[] sortByReflection(int[] nums) {
        Integer[] arr=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b)->{
            int refA=getReflection(a);
            int refB=getReflection(b);
            if(refA==refB){
                return Integer.compare(a,b);
            }
            return Integer.compare(refA,refB);
        });
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        return nums;
}
 private int getReflection(int num){
        int reflection=0;
        while(num>0){
            reflection=(reflection<<1)|(num&1);
            num>>=1;
        }
        return reflection;
    }
}
