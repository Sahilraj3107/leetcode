class Solution:
    def minimumPushes(self, word: str) -> int:
        i =0
        add =1
        cnt =0
        for ch in word:
            if i!=0 and i%8==0:
                add+=1
            cnt+=add
            i+=1
        return cnt    

