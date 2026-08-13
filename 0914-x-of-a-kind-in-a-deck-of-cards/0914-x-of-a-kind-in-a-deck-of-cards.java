class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
      Map<Integer,Integer> map=new HashMap<>();
        for(int card: deck){
            map.put(card, map.getOrDefault(card,0)+1);
        }
      int currentGcd=0;
      for(int freq: map.values()){
        currentGcd=gcd(currentGcd,freq);
        if(currentGcd==1){
            return false;
        }
      }
      return currentGcd>=2;
            }


 private int gcd(int a,int b){
    if(b==0){
        return a;

    }
    return gcd(b,a%b);
 }   
}