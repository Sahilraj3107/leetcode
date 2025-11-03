class Solution:
    def minCost(self, colors: str, neededTime: List[int]) -> int:
        if len(colors)<2:
            return 0
        minTime =0
        prev_idx =0

        for i in range(1,len(colors)):
            if colors[i]==colors[prev_idx]:
                if neededTime[prev_idx]> neededTime[i]:
                    minTime+=neededTime[i]
                else:
                    minTime += neededTime[prev_idx]
                    prev_idx=i
            else:
                prev_idx=i
        return minTime               