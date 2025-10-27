class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        total_beam,a=0,0

        for row in range(len(bank)):
            b=0
            for security_device in bank[row]:
                if security_device=='1':
                    b+=1
            total_beam += a*b
            if b==0:
                continue
            a=b

        return total_beam    



        