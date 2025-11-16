class Solution:
    def numSub(self, s: str) -> int:
        mod= 1e9+7
        cnt =0
        res=0

        for ch in s:
            if ch=='1':
                cnt+=1
            else:
                if cnt!=0:
                    res += ((cnt*(cnt+1))//2)
                cnt =0
        res += ((cnt*(cnt+1))//2)
        return int(res%mod)      