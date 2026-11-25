class Solution:
    def nthSuperUglyNumber(self, n: int, primes: list[int]) -> int:
        k=len(primes)
        dp=[1]*n
        pointers=[0]*k
        vals=list(primes)
        for i in range(1,n):
            min_val=min(vals)
            dp[i]=min_val
            for j in range(k):
                if vals[j]==min_val:
                    pointers[j]+=1
                    vals[j]=dp[pointers[j]]*primes[j]
        return dp[n-1]