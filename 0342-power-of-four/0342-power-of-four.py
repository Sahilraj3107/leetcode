class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n<=0: 
            return False

        for i in range(16):
            num = (1<<2*i)
            if num==n: return True
        return False    