class Solution {
    public boolean isSubsequence(String s, String t) {
    int f=0,sec=0;
    while(f<s.length() && sec<t.length()){
        if(s.charAt(f)==t.charAt(sec)){
            f++;
        }
        sec++;
    }
    
    
    return f==s.length();
    
    
    }
}