#include<stdlib.h>
static int min3(int a,int b,int c){
    int m=a<b?a:b;
    return m<c?m:c;
}

int nthUglyNumber(int n) {
    int* dp=(int*)malloc(n*sizeof(int));
    dp[0]=1;
    int p2=0,p3=0,p5=0;
    for(int i=1;i<n;i++){
        int next2=dp[p2]*2;
        int next3=dp[p3]*3;
        int next5=dp[p5]*5;
        int minval=min3(next2,next3,next5);
        dp[i]=minval;
        if(minval==next2)p2++;
        if(minval==next3)p3++;
        if(minval==next5)p5++;
    }
    int ans=dp[n-1];
    free(dp);
    return ans;
}