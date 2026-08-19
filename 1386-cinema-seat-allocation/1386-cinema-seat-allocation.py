class Solution:
    def maxNumberOfFamilies(self, n: int, pos: List[List[int]]) -> int:

        #Step 1
        mpp=defaultdict(set)
        for x in pos:
            row, col= x[0], x[1]
            mpp[row].add(col)
        # print(mpp)
        res =2*n
        #Step 2
        for i in mpp:
            a=b=c=False
            #here:
            # a=2,3,4,5
            # b=4,5,6,7
            # c=6,7,8,9

            #for a
            x = (2 in mpp[i]) or (3 in mpp[i]) or (4 in mpp[i]) or (5 in mpp[i])
            if x == False:
                a =True

            #for b
            if a == False:
                y = (4 in mpp[i]) or (5 in mpp[i]) or (6 in mpp[i]) or (7 in mpp[i])
                if y ==False:
                    b = True

            #for c
            if b == False:
                z =(6 in mpp[i]) or (7 in mpp[i]) or (8 in mpp[i]) or (9 in mpp[i])    
                if z == False:
                    c= True    

            if a and c:
                pass
            elif a or b or c:
                res -=1
            else:
                res-=2   

        return res                