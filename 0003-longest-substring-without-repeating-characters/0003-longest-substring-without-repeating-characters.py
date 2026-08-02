class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l=r=0
        n = len(s)
        arr =[]
        res =0
        while r<n:
            ch =s[r]

            while ch in arr:
                arr.remove(s[l])
                l+=1
            arr.append(s[r]) 
            res = max(res,r-l+1)

            r+=1
        return res        