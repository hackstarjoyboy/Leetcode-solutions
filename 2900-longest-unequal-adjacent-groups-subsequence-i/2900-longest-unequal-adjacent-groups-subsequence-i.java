class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
         List<String> l=new ArrayList<>(); 
         if(words==null ||words.length==0) return l;
         l.add(words[0]);
      
        int lastPicked=groups[0];
        for(int i=1;i<groups.length;i++){
            if(groups[i]!=lastPicked){
                l.add(words[i]);
                lastPicked=groups[i];
            }
        }
        return l;
    }
}