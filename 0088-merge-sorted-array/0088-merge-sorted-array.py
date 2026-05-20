class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        #if any one of them are empty
        if m==0:
            nums1[:] = nums2
            return

        elif n==0:
            return

        i,j,k=0,0,0
        res =[0]*(len(nums1))


        while i<m and j<n:
            if nums1[i]> nums2[j]:
                res[k]= nums2[j]
                j+=1
            else:
                res[k]= nums1[i]
                i+=1
            k+=1

        while i<m:
            res[k]=nums1[i]
            i+=1
            k+=1
        while j<n:
            res[k]= nums2[j]
            j+=1
            k+=1


        for idx in range(len(res)):
            nums1[idx]= res[idx]            
