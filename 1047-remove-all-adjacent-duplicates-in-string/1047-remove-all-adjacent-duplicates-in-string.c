char* removeDuplicates(char* s) {
    int write=0;
    for(int read=0;s[read]!='\0';read++){
        if(write>0&& s[write-1]==s[read]){
            write--;
        }else{
            s[write]=s[read];
            write++;
        }
        
    }
    s[write]='\0';
    return  s;
}