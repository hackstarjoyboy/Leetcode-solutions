class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int candy:candyType){
            map.put(candy,map.getOrDefault(candy,0)+1);
        }
        int n=candyType.length;
        if(map.size()>n/2){
            return n/2;
        }
        return map.size();

    }
}