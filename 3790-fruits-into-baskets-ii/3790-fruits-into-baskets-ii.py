class Solution:
    def numOfUnplacedFruits(self, fruits: List[int], baskets: List[int]) -> int:
        cnt =0

        for fruit in fruits:
            unplaced =True
            for j in range(len(baskets)):
                if fruit<=baskets[j]:
                    unplaced =False
                    baskets[j] = -1
                    break
            if unplaced:
                cnt+=1
        return cnt         