class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        n =len(nums)
        list1 =[]

        set1 =set(nums)

        for i in range(1,n+1):
            if i not in set1:
                list1.append(i)
        return list1           
        