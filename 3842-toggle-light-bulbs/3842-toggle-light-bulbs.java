class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int[] freq=new int[101];
        for(int num:bulbs){
        freq[num]++;
        }
    List<Integer> ans=new ArrayList<>();
    for(int i=1;i<freq.length;i++){
    if(freq[i]!=0 & (freq[i]&1)==1){
        ans.add(i);
    }
    }
return ans;
    
    }

}