class Solution:
    def maxTwoEvents(self, events: List[List[int]]) -> int:
        n = len(events)
        events.sort(key=lambda x: x[1])
        max_val =[0]*n

        max_val[0]=events[0][2]

        for i in range(1,n):
            max_val[i] = max(max_val[i-1],events[i][2])
             
        maxsum =0
        for i in range(n):
            s,e,v =events[i]
            maxsum =max(maxsum,v)


            l,r =0,i-1
            idx =-1

            while l<=r:
                mid = (l+r)//2

                if events[mid][1]< s:
                    idx =mid
                    l =mid +1
                else:
                    r =mid -1
            if idx !=-1:
                maxsum = max(maxsum, v+max_val[idx])

        return maxsum                         



        