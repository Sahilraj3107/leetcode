class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        ans =[0]*(2*n)
        i,j,k =0,n,0
        
        while k<2*n:
            if k%2==0:
                ans[k]=nums[i]
                i+=1
            else:
                ans[k]=nums[j]
                j+=1
            k+=1     
        return ans            