class Solution {
    public void reverseString(char[] s) {
        StringBuilder a=new StringBuilder();
        a.append(s);
        a.reverse();
        for(int i=0;i<s.length;i++)s[i]=a.charAt(i);
    }
}