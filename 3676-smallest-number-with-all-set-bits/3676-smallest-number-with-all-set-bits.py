class Solution:
    def smallestNumber(self, n: int) -> int:
        x =1

        for i in range(31):
            if x<<i >n:
                return (x<<i) -1

        return 0        
        