class Solution {
    
    public int[] shortestToChar(String s, char c) {
        int[] result=new int[s.length()];
        int count=0;
      for(int i=0;i<s.length();i++){
         if(s.charAt(i)==c){
            count++;
         }
      }
      int index=0;
      int[] occurence=new int[count];
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)==c){
            occurence[index++]=i;
        }
      }
 index=0;
 int j=0;
 for(int i=0;i<s.length();i++){
    result[index++]=reAns(occurence,i,count);
    
 }
  return result;
    }
    private int reAns(int[] occurence,int sInt,int count){
   int nearest=Integer.MAX_VALUE;
   int k=0;
   while(k<count){
    if(Math.abs(occurence[k]-sInt)<nearest){
        nearest=Math.abs(occurence[k]-sInt);
    }
    k++;
   }
return nearest;
    }
}