class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        temp = []

        for num in nums:
            if num in temp:
                return num
            temp.append(num)
        return 0        
        