class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] w=s.split(" ");
        if(pattern.length()!=w.length) return false;
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String str=w[i];
            // pattern-->string mapping 
          if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(str)){
                    return false;
                }
          }else{
            map1.put(ch,str);
          }
         //string --> pattern mapping cross check
         if(map2.containsKey(str)){
            if(map2.get(str)!=ch){
                return false;
            }
         }else{
            map2.put(str,ch);
         }

        }
        return true;
    }
}