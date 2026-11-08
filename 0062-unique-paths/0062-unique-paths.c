int uniquePaths(int m, int n) {
    long path=1;
    for(int i=1;i<=m-1;i++){
        path=path*(n-1+i)/i;

    }
    return path;
}