class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        Stack<Character> stack=new Stack<>();
       
        for(int i=s.length()-1;i>=0;i--)
        {
           stack.push(s.charAt(i));
        }

        for(char c:t.toCharArray()) {
            if (!stack.isEmpty()&&stack.peek()== c) {
                stack.pop();

            }
        }
        return stack.size()==0 ;
    
    }
}