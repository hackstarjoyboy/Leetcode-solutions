#include<stdbool.h>
#include<stdlib.h>
#include<string.h>

bool wordBreak(char* s, char** wordDict, int wordDictSize) {
    int n=strlen(s);
    int* wordLens =(int*) malloc(wordDictSize * sizeof(int));
    for(int w =0; w< wordDictSize;w++){
        wordLens[w]= strlen(wordDict[w]);
    }
    bool* dp=(bool*)calloc(n+1,sizeof(bool));
    dp[0]=true;
    for(int i=1;i<=n;i++){
        for(int w=0;w<wordDictSize;w++){
            int len=wordLens[w];
            if(i>=len && dp[i-len] && strncmp(s+i-len,wordDict[w],len)==0){
                dp[i]=true;
                break;
            }
        }
    }
    bool result= dp[n];
    free(wordLens);
    free(dp);
    return result;
}