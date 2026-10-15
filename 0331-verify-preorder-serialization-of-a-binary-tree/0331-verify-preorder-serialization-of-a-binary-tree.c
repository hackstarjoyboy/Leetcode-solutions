#include<stdbool.h>
bool isValidSerialization(char* preorder) {
    int capct=1;
    int i=0;
    while(preorder[i] != '\0'){
        if(capct<=0) return false;
        if(preorder[i]=='#'){
            capct -= 1;
            i++;
            if(preorder[i]==',') i++;
        }else{
            capct += 1;
            while(preorder[i]!='\0' && preorder[i]!=','){
                i++;
            }
            if(preorder[i]==',') i++;
        }
    }
    return capct==0;
}