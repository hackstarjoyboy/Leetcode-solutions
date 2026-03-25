class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
          ArrayList<Integer> l=new ArrayList<>();
               HashMap<Integer,Integer> hm=new HashMap<>();
                for(int num:nums1){
                    hm.put(num,hm.getOrDefault(num,0)+1);
                  
                }
                for(int num:nums2){
                    if(hm.containsKey(num)&&hm.get(num)>0){
                        l.add(num);
                        hm.put(num,hm.get(num)-1);
                    }
                }
               
                
                int[] arr=new int[l.size()];
                int k=0;{
                    for(int num:l){
                        arr[k]=num;
                        k++;
                    }
        }
        return arr;
    }
}