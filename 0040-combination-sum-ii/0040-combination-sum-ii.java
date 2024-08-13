class Solution {
    public void f(int[] c,int t,int i,List<Integer> temp,List<List<Integer>> L){
     if(t==0){
         L.add(new ArrayList<>(temp));
         return;
     }
    
     for(int j=i;j<c.length;j++){
         if(j>i && c[j]==c[j-1]){
             continue;
         }
         if(c[j]>t){
             break;
         }
         temp.add(c[j]);
         t=t-c[j];
         f(c,t,j+1,temp,L);
         temp.remove(temp.size()-1);
         t=t+c[j];
     }
    }

    public List<List<Integer>> combinationSum2(int[] c, int t) {
        Arrays.sort(c);
       List<List<Integer>> ans=new ArrayList<>();
       List<Integer> temp=new ArrayList<>();
       f(c,t,0,temp,ans);
       return ans;
    }
}