class Solution {
    public boolean canChange(String start, String target) {
        if(!start.replace("_","").equals(target.replace("_","")))return false;
        int n =start.length(), i=0,j=0;

        while(i<n && j<n){

            while(i<n && start.charAt(i)=='_' )i++;
            while( j<n && target.charAt(j)=='_' )j++;

            if(i==n || j==n)break;

            if(start.charAt(i)!=target.charAt(j))return false;

            if(start.charAt(i)=='L' && i<j)return false;
            if(start.charAt(i)=='R' && i>j)return false;

            i++;
            j++;
        }
        return true;
    }
}