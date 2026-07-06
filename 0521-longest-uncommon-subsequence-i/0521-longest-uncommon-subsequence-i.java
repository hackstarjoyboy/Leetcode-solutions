class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return  -1; 
     return Math.max(a.trim().length(),b.trim().length());
    


}
}
