class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=new int[heights.length];
        int i=0;
        for(int x:heights){
            arr[i++]=x;
        } int ans=0;
        Arrays.sort(arr);
        for(int j=0;j<heights.length;j++){
            if(heights[j]!=arr[j]){
            ans=ans+1;
            }
        }
        return ans;
    }
}