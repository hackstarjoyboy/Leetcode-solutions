#include<stdlib.h>
#include <limits.h>
int nthSuperUglyNumber(int n, int* primes, int primesSize) {
  long long* dp=(long long*)malloc(n*sizeof(long long));
  int* pointers=(int*) calloc(primesSize,sizeof(int));
  long long* vals=(long long*)malloc(primesSize* sizeof(long long));
  dp[0]=1;
  for(int j=0;j<primesSize;j++){
    vals[j]=primes[j];

  } 
  for(int i=1;i<n;i++){
    long long minVal=LLONG_MAX;
    for(int j=0;j<primesSize;j++){
        if(vals[j]<minVal){
            minVal=vals[j];
        }
    }
    dp[i]=minVal;
    for(int j=0;j<primesSize;j++){
        if(vals[j]==minVal){
            pointers[j]++;
            vals[j]=dp[pointers[j]]*primes[j];
        }
    }
  } 
  int ans=(int )dp[n-1];
  free(dp);
  free(pointers);
  free(vals);
  return ans;
}