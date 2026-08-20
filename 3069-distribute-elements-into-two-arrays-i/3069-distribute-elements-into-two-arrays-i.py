class Solution:
    def resultArray(self, nums: List[int]) -> List[int]:
        if len(nums)<3:
            return nums

        n = len(nums)    
        arr1=[]
        arr2=[]
        arr1.append(nums[0])
        arr2.append(nums[1])
        j=k=0
        for i in range(2,n):
            if arr1[j]> arr2[k]:
                arr1.append(nums[i])
                j+=1
            else:
                arr2.append(nums[i])
                k+=1

        res = arr1 + arr2
        return res            