/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
#include <stdlib.h>
#include<string.h>
typedef struct{
    int* vals;
    int size;
    int computed;
}Result; 
static Result solve(const char* expr,int start,int end,Result memo[21][21]){
if(memo[start][end].computed){
    return memo[start][end];
}
int cap=16,size=0;
int* vals =(int*) malloc(cap*sizeof(int));
for(int i=start;i<=end;i++){
    char c=expr[i];
    if(c=='+'||c=='-'||c=='*'){
        Result left=solve(expr,start,i-1,memo);
        Result right=solve(expr,i+1,end,memo);
        int needed=size+left.size*right.size;
        if(needed>cap){
            while(cap<needed)cap*=2;
            vals=(int*)realloc(vals,cap*sizeof(int));
        }
        for(int l=0;l<left.size;l++){
            for(int r=0;r<right.size;r++){
                if(c=='+') vals[size++]=left.vals[l]+right.vals[r];
                else if(c=='-')vals[size++]=left.vals[l]-right.vals[r];
                else vals[size++]=left.vals[l]*right.vals[r];
            }
        }
    }
}
if(size==0){
    int num=0;
    for(int i=start;i<=end;i++){
        num=num*10+(expr[i]-'0');
    }
    vals[size++]=num;
}
memo[start][end].vals=vals;
memo[start][end].size=size;
memo[start][end].computed=1;
return memo[start][end];
}


int* diffWaysToCompute(char* expression, int* returnSize) {
   int n=strlen(expression);
   Result memo[21][21];
   memset(memo,0,sizeof(memo));
   Result finalRes=solve(expression,0,n-1,memo);
   int* ans=(int*) malloc(finalRes.size*sizeof(int));
   memcpy(ans,finalRes.vals,finalRes.size*sizeof(int));
   *returnSize=finalRes.size;
   for(int i=0;i<n;i++){
    for(int j=i;j<n;j++){
        if(memo[i][j].computed){
            free(memo[i][j].vals);
        }
    }
   } 
   return ans;
}