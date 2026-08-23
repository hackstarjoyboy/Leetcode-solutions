class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0;
        int sumB=0;
        for(int a:aliceSizes){
            sumA+=a;
        }
        Set<Integer> setB=new HashSet<>();
        for(int b:bobSizes){
            sumB+=b;
            setB.add(b);
        }
        int diff=(sumA-sumB)/2;
        for(int a:aliceSizes){
            int targetB=a-diff;
            if(setB.contains(targetB)){
                return new int[]{a,targetB};
            }
        }
        return new int[0];
    }
}