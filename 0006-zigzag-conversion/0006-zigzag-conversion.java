class Solution {
    public String convert(String s, int numRows) {
       if(s.length()==1 ||numRows>=s.length() || numRows==1)return s;

       String[] row =new String[numRows];
       for(int i=0;i<numRows;i++)row[i]="";

        int idx =0;
        boolean flag =true;
       for(char ch:s.toCharArray()){
         row[idx] =row[idx] + ch;
         if(idx==0)flag=true;
         if(idx ==(numRows-1))flag=false;

         if(flag)idx++;
         else idx--;
       }

       String ans ="";

       for(String str: row){
        ans =ans +str;
       }

       return ans;



    }
}