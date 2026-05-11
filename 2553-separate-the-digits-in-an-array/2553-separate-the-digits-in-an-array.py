class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        n = len(nums)

        ans =[]

        for num in nums:
            curr = num
            stk = []
            while curr>0:
                rem = curr%10
                curr = curr//10
                stk.append(rem)
            while len(stk)>0:
                front = stk.pop()
                ans.append(front)
        return ans        