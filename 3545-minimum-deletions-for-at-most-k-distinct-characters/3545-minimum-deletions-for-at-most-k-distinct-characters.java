class Solution {
    public int minDeletion(String s, int k) {
    int[] count=new int[26];
    int distinctCount=0;
    for(char c:s.toCharArray()){
        if(count[c-'a']==0){
            distinctCount++;
        }
        count[c-'a']++;
    }
    if(distinctCount<=k){
        return 0;
    }
    int[] freq=new int[distinctCount];
    int index=0;
    for(int f:count){
        if(f>0){
            freq[index++]=f;
              }
    }
    Arrays.sort(freq);
    int deletions=0;
    int charToRemove=distinctCount-k;
    for(int i=0;i<charToRemove;i++){
        deletions+=freq[i];
   }
    return deletions;
     }
}