class Solution {
    public String winningPlayer(int x, int y) {
        boolean turn=true;
        while(x>=1&& y>=4){
            turn=!turn;
            x=x-1;
            y=y-4;
        }
        if(turn){
            return "Bob";
        }else{
            return "Alice";
        }
    }
}