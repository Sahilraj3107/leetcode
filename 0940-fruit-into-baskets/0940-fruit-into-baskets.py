class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        uniqueFruits = {}

        l,r,res =0,0,0

        while r< len(fruits):
            if fruits[r] not in uniqueFruits:
                uniqueFruits[fruits[r]]=1
            else:    
                uniqueFruits[fruits[r]]+=1
          

            while l<r and len(uniqueFruits)>2:
                uniqueFruits[fruits[l]]-=1
                if uniqueFruits[fruits[l]]==0:
                    del uniqueFruits[fruits[l]]
                l+=1    
            
            res =max(res,(r-l+1))
            r+=1

        return  res    
        