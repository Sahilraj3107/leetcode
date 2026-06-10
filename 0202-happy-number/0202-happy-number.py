class Solution:
    def isHappy(self, n: int) -> bool:
        s = set()

        while n!=1:
            curr = n
            temp =0
            while curr>0:
                part =curr%10
                temp+= part**2
                curr = curr//10
            if temp ==1:
                return True    
            elif temp in s:
                return False
            else:
                s.add(temp)
                n=temp
        return True            
