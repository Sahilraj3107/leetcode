class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int maxLen =a+b+c, i=0;
        int currA=0, currB=0, currC=0;
       
       String str ="";
        while(i<maxLen){

            if((currA!=2 && a>=b && a>=c) || (a>0 && (currB==2 || currC==2))){
              str += 'a';
              currA++;
              currB=0;
              currC=0;
              a--;
            }

              else if((currB!=2 && b>=a && b>=c) || (b>0 && (currA==2 || currC==2))){
              str += 'b';
              currB++;
              currA=0;
              currC=0;
              b--;
            }

              else if((currC!=2 && c>=b && c>=a) || (c>0 && (currB==2 || currA==2))){
              str += 'c';
              currC++;
              currB=0;
              currA=0;
              c--;
            }
            i++;
        }
        return str;
    }
}