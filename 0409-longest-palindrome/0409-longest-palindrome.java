class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hash=new HashSet<>();
        int length=0;
        for(char c:s.toCharArray()){
            if(hash.contains(c)){
                length+=2;
                hash.remove(c);
            }else{
                hash.add(c);
            }
        }
        return hash.isEmpty() ? length:length+1;
        
    }
}