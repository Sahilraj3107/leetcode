class Solution:
    def checkDivisibility(self, n: int) -> bool:
        
        curr = n
        tot =0
        prod = 1
        while curr>0:
            x = curr%10
            curr = curr//10
            prod = prod*x
            tot+=x

        if n%(tot+ prod) ==0:
            return True

        return False        

