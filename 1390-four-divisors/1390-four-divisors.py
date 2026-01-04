class Solution:
    def sumFourDivisors(self, nums: List[int]) -> int:
        res =0
        for num in nums:
            cnt, s =0,0
            for i in range(1,int(num**0.5)+1):
                if num%i==0:
                    if i*i==num:
                        cnt +=1
                        s+=i
                    else:
                        cnt+=2
                        s+= i + num//i  
                if cnt>4:
                    break
            if cnt==4:
                res+=s
        return res                        