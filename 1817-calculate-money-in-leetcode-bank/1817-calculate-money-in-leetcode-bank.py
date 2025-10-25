class Solution:
    def totalMoney(self, n: int) -> int:
        monday,total_saving =0,0

        while n>0:
            if n>=7:
                sum =monday+7
                total_saving += (sum*(sum+1))//2
                total_saving -= ((monday)*(monday+1))//2
                n-=7
                monday+=1
            else:
                sum = monday +n
                total_saving += (sum*(sum+1))//2
                total_saving -= ((monday)*(monday+1))//2
                n=0

        return total_saving        

        