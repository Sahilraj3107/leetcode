class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        b =text.count('b')
        a = text.count('a')
        l = text.count('l')//2
        o = text.count('o')//2
        n = text.count('n')

        r1 = min(b,a)
        r2 = min(l,o)
        r3 = min(r1,r2)
        res = min(r3,n)
        return res