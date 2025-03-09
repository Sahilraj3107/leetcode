class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int cnt=0, n=colors.length;
        
        for(int i=1;i<n-1;i++){
            if(colors[i]!=colors[i-1] && colors[i]!=colors[i+1])cnt++;
        }

        if(colors[0]!=colors[1] && colors[n-1]!=colors[0])cnt++;
        if(colors[0]!=colors[n-1] && colors[n-1]!=colors[n-2])cnt++;
        return cnt;
    }
}