class Solution {
    public int appendCharacters(String t, String s) {
        int a=s.length();
        int b=t.length();
        int j=0;
       for(int i=0;(i<b && j<a);i++){
        if(t.charAt(i)==s.charAt(j)){
          j++;
        }
       }
       return (a-j);
       
    }
    }
