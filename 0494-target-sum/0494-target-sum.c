#include<stdlib.h>
#include<string.h>

int findTargetSumWays(int* nums, int numsSize, int target) {
    int totalSum=0;
    for(int i=0;i<numsSize;i++){
        totalSum+=nums[i];
    }
    if(abs(target)>totalSum || (target + totalSum)%2 !=0){
        return 0;
    }
    int subsetSum= (target + totalSum ) /2;
    int dp[1001];
    memset(dp,0,(subsetSum+1) * sizeof(int));
    dp[0]=1;
    for(int i=0;i<numsSize;i++){
        int num=nums[i];
        for(int j=subsetSum;j>=num;j--){
            dp[j]+=dp[j-num];
        }
    }
    return dp[subsetSum];
    }