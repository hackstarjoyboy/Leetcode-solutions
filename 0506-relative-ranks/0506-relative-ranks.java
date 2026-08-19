class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] result =new String[n]; 
        int[][] scorePairs=new int[n][2];
        for(int i=0;i<n;i++){
            scorePairs[i][0]=score[i];
            scorePairs[i][1]=i;
        }
        Arrays.sort(scorePairs,(a,b)->b[0]-a[0]);
        for(int i=0;i<n;i++){
            int originalIndex=scorePairs[i][1];
            if(i==0){
                result[originalIndex]="Gold Medal";

            }else if(i==1){
                result[originalIndex]="Silver Medal";
            }else if(i==2){
                result[originalIndex]="Bronze Medal";
            }else{
                result[originalIndex]=String.valueOf(i+1);
            }
        }
       
       return result;


    }
}