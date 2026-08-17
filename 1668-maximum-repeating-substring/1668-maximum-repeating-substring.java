class Solution {
    
    public int maxRepeating(String sequence, String word) {
    int count=0;
    String repeatingWord=word;
    while(sequence.contains(repeatingWord)){
        count++;
        repeatingWord+=word;
    }
       return count;
   
  
    }
  
}