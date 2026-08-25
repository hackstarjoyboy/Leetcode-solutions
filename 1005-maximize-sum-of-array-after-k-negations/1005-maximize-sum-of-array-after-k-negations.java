class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
       for(int num:nums){
        minHeap.offer(num);
       } 
       int sum=0;
       while(k>0){
        int smallest=minHeap.poll();
        minHeap.offer(-smallest);
        k--;
       }
    while(!minHeap.isEmpty()){
        sum+=minHeap.poll();
       }
       return sum;
    }
}