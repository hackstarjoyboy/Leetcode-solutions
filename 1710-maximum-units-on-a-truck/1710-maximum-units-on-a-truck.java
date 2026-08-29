class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       Arrays.sort(boxTypes,(a,b)-> Integer.compare(b[1],a[1]));
       int totalunits=0;
    for(int[] box:boxTypes){
        int boxcount=box[0];
        int unitsperBox=box[1];
        int boxesToTake=Math.min(truckSize,boxcount);
        totalunits+=boxesToTake*unitsperBox;
        truckSize-=boxesToTake;
        if(truckSize==0){
            break;
        }
    }
return totalunits;
    }
}