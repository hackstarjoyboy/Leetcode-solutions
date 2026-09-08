class Solution {
    public int splitNum(int num) {
       char[] digits=String.valueOf(num).toCharArray();
       Arrays.sort(digits);
       int num1=0;
       int num2=0;
       for(int i=0;i<digits.length;i++){
        int current=digits[i]-'0';
        if(i%2==0){
            num1=num1*10+current;
        }else{
            num2=num2*10+current;
        
       }
       }
       return num1+num2;
    }
}