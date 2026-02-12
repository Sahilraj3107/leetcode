class Solution:
    def mergeAdjacent(self, nums: List[int]) -> List[int]:
        n =len(nums)
        
        stack=[]
        stack.append(nums[0])

        for i in range(1,n):
            top=stack.pop()

            if nums[i]==top:
                curr = nums[i]+nums[i]
                while len(stack)!=0 :
                    new_top =stack.pop()
                    if new_top!=curr:
                        stack.append(new_top)
                        break
                    else:
                        curr+=new_top
                stack.append(curr)            
            else :
                stack.append(top)
                stack.append(nums[i])
        return stack            