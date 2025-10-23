class Solution:
    def hasSameDigits(self, s: str) -> bool:

        nums = [int(digit) for digit in s]
    
        while True:
            if len(nums)==2:
                if nums[0]==nums[1]:
                    return True
                else:
                    return False

            temp =[]

            for i in range(1, len(nums)):
                temp.append((nums[i-1]+nums[i])%10)

            nums =temp
            
        return True                     
        