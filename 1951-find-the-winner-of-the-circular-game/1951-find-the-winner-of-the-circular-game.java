class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q =new LinkedList<>();

        for(int i=1;i<=n;i++)q.offer(i);
        
        int cnt=0;
        while(q.size()!=1){
           cnt++;
           int node =q.poll();
           if(cnt==k){
            cnt=0;
            continue;
           }
           else q.offer(node);
        }
        return q.peek();
    }
}