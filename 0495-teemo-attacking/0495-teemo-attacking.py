class Solution:
    def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
        n = len(timeSeries)
        tot_duration =0

        for i in range(1,n):
            if (timeSeries[i]-timeSeries[i-1])>duration:
                tot_duration += duration
            else:
                tot_duration += (timeSeries[i]-timeSeries[i-1])

        tot_duration += duration
        return tot_duration