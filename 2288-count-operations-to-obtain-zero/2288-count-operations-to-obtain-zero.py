class Solution:
    def countOperations(self, num1: int, num2: int) -> int:
        cnt=0
        while num1>0 and num2>0:
            if num1>num2:
                x =num1//num2
                num1 -= x*num2
                cnt+=x
            else:
                x =num2//num1
                num2 -=x*num1
                cnt+=x
              
        return cnt          
        