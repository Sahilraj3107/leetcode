class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        long sum =0;
        int nm = n + rolls.length;
        for(int i=0;i<rolls.length;i++){
            sum +=(long)rolls[i];
        }

       int totalSum = mean *nm;
       long remSum =totalSum -sum;
       
       System.out.println(remSum);
       if(remSum<n || remSum>6*n){
           return new int[0];
       }

     int num =(int)remSum/n;   
     int[] res =new int[n];
     Arrays.fill(res, num);

     num =(int)remSum%n;

     for(int i=0;i<num;i++){
        res[i]++;
     }

    
       return res;
    }
}
