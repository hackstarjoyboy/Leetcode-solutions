class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ll=new ArrayList<>();
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int currentDiff=arr[i]-arr[i-1];
         if(currentDiff<minDiff){
          ll.clear();
          ll.add(Arrays.asList(arr[i-1],arr[i]));
       minDiff=currentDiff;
        }else if(currentDiff==minDiff){
              ll.add(Arrays.asList(arr[i-1],arr[i]));
         }
        }
  return ll;



    }
}