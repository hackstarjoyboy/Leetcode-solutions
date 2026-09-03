class Solution {
    public int largestInteger(int num) {
      PriorityQueue<Integer> even=new PriorityQueue<>(Collections.reverseOrder());
      PriorityQueue<Integer> odds=new PriorityQueue<>(Collections.reverseOrder());

char[] digits=String.valueOf(num).toCharArray();
for(char c:digits){
    int digit=c-'0';
    if(digit%2==0){
        even.offer(digit);
    }else{
        odds.offer(digit);
    }
}
int result=0;
for(char c:digits){
    int digit=c-'0';
    result*=10;
    if(digit%2==0){
        result+=even.poll();
    }else{
        result+=odds.poll();
    }
}
return result;









    }
}