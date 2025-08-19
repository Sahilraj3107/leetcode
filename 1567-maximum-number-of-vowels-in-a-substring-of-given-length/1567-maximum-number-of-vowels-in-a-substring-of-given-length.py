class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        l,r,cnt,res=0,0,0,0

        while r<len(s):
            if s[r] in {'a','e','i','o','u'}:
                cnt+=1
            while (r-l)>=k:
                if s[l] in  {'a','e','i','o','u'}:
                    cnt-=1
                l+=1
            res =max(res,cnt)
            r+=1
        return res            