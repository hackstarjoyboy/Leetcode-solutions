#include<stdio.h>
int robLinear(int* nums,int start,int end){
    int prev2=0;
    int prev1=0;
    for(int i=start;i<=end;i++){
        int currentMax=(prev1>prev2+nums[i]?prev1:(prev2+nums[i]));
        prev2=prev1;
        prev1=currentMax;
    }
    return prev1;
}




int rob(int* nums, int numsSize) {
    if(numsSize==0) return 0;
    if(numsSize==1) return nums[0];
    if(numsSize==2)return (nums[0]>nums[1] ?nums[0]:nums[1]);
    int max1=robLinear(nums,0,numsSize-2);
    int max2=robLinear(nums,1,numsSize-1);
    return (max1>max2) ? max1:max2;
}