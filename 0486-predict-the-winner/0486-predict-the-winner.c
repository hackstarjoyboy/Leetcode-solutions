#include<stdbool.h>
bool predictTheWinner(int* nums, int numsSize) {
    int dp[20];
    for(int i=numsSize-1;i>=0;i--){
        dp[i]=nums[i];
        for(int j=i+1;j<numsSize;j++){
            int pickLeft=nums[i]-dp[j];
            int pickRight=nums[j]-dp[j-1];
            dp[j]=pickLeft>pickRight?pickLeft:pickRight;
        }
    }
    return dp[numsSize-1]>=0;
}