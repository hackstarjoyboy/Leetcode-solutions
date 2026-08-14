class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
             int first=getFirstDigit(nums[i]);
            for(int j=i+1;j<nums.length;j++){
              
               int last=nums[j]%10;
                if(gcd(first,last)==1){
                    count++;
                }
            }
        }
        return count;
    }
    private int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    private int getFirstDigit(int num){
        while(num>=10){
            num/=10;
        }
        return num;
    }
}