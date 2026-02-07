class Solution:
    def minimumDeletions(self, s: str) -> int:
        ans =cnt=0

        for ch in s:
            if ch=='b':
                cnt+=1
            elif cnt:
                ans+=1
                cnt -=1

        return ans            