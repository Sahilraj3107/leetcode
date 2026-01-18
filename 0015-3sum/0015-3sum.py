class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        res =[]
        for i in range(n):
            if i>0 and nums[i]==nums[i-1]:
                continue
            target = -nums[i]
            seen =set()
            seen_pair =set()
            for j in range(i+1,n):
                req = target -nums[j]
                if req in seen:
                    if nums[j] not in seen_pair:
                        lst =[nums[i], req, nums[j]]
                        res.append(lst)
                        seen_pair.add(nums[j]) 

                    while j+1<n and nums[j]==nums[j+1]:
                        j+=1
                
                seen.add(nums[j])

        return res                     