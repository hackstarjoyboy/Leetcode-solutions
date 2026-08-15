class Solution {
    public int maxLength(int[] nums) {
        int ans = 0 ;
        int n = nums.length ;
        final int max_target = 25200 ;
        for(int i=0;i<n;i++){
            int prod = 1;
            int currentLcm=nums[i];
            int currentGcd=nums[i];
            for(int j=i;j<n;j++){
                prod*=nums[j];
                if(prod>max_target){
                    break;
                }
                if(j>i){
                    currentGcd=gcd(currentGcd,nums[j]);
                    currentLcm=lcm(currentLcm,nums[j]);
                }
                if(prod==currentLcm*currentGcd){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    private int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    private int lcm(int a,int b){
        return (a/gcd(a,b))*b;
    }
}