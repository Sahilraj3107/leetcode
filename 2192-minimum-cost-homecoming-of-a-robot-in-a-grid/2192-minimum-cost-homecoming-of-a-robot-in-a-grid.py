class Solution:
    def minCost(self, startPos: List[int], homePos: List[int], rowCosts: List[int], colCosts: List[int]) -> int:
        stRow =min(startPos[0],homePos[0])
        endRow =max(startPos[0],homePos[0])
        stCol =min(startPos[1],homePos[1])  
        endCol =max(startPos[1],homePos[1]) 

        cost = 0
        if startPos[0]!=homePos[0]:
            cost +=rowCosts[homePos[0]] 

        if startPos[1]!=homePos[1]:
            cost +=colCosts[homePos[1]]      

        for row in range(stRow+1,endRow):
            cost += rowCosts[row]
        for col in  range(stCol+1,endCol):
            cost += colCosts[col]

        return cost      
