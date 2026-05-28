class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        n = len(arr)
        subarray_sum =0
        for i in range(n):
            prefix = 0
            for j in range(i,n):
                prefix +=arr[j]
                if (j-i)%2==0:
                    subarray_sum +=prefix
        return subarray_sum            