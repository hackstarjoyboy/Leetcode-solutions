class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] freq=new int[101];
        for(int num:nums){
            freq[num]++;
        }
        for(int count:freq){
            if(count>0 && isPrime(count)){
                return true;
            }
        }
        return false;
        
    }
    private boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        if(num<=3){
            return true;
        }
        if(num%2==0 || num%3 ==0){
            return false;
        }
        for(int i=5;i*i<=num;i+=6){
            if(num%i==0 || num%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}