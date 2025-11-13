class Solution:
    def maxOperations(self, s: str) -> int:
        one_cnt, zero =0,False
        res=0

        for i in range(len(s)):
            if s[i]=='1':
                if zero and one_cnt>0:
                    res+=one_cnt
                one_cnt+=1
                zero=False
            else:
                zero=True

        if zero and one_cnt>0:
            res+=one_cnt
        return res           