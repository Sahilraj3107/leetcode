class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> Character.compare(b, a));
        Map<Character, Integer> mpp = new HashMap<>();

       for(char ch :s.toCharArray()){
        mpp.put(ch, mpp.getOrDefault(ch,0)+1);
        if(!pq.contains(ch))pq.offer(ch);
       }

        StringBuilder ans = new StringBuilder();
        
        while (!pq.isEmpty()) {
          char ch =pq.poll();
          int cnt =mpp.get(ch);

          int iterate =Math.min(cnt,repeatLimit);
          for(int i=0;i<iterate;i++){
             ans.append(ch);
          }

          cnt -=iterate;

          mpp.put(ch,mpp.get(ch)-cnt);

          if(cnt>0){
            if(pq.isEmpty())break;
          
          char nextCh =pq.poll();
          ans.append(nextCh);

          mpp.put(nextCh, mpp.get(nextCh)-1);

          if(mpp.get(nextCh)>0)pq.offer(nextCh);
          
          pq.offer(ch);   

          }

          if(cnt>0){
            mpp.put(ch,cnt);
          }
          else{
            mpp.remove(ch);
          }
        }
           
       return ans.toString();
    }
}