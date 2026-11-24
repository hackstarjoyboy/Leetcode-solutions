class Solution:
    def nthUglyNumber(self, n: int) -> int:
        dp=[1]*n
        p2=p3=p5=0
        for i in range(1,n):
            next2,next3,next5=dp[p2]*2,dp[p3]*3,dp[p5]*5
            min_val=min(next2,next3,next5)
            dp[i]=min_val
            if min_val==next2:
                p2+=1
            if min_val==next3:
                p3+=1
            if min_val ==next5:
                p5+=1
        return dp[n-1]
        