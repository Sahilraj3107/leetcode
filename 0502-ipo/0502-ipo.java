
class Solution {
   private static class Pair{
    int capital;
    int profit;
    Pair( int capital, int profit){
        this.capital =capital;
        this.profit =profit;
    }
}
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

      int n =profits.length;
      List<Pair> pr =new ArrayList<>();

      for(int i=0;i<n;i++){
        pr.add(new Pair(capital[i], profits[i]));
      }  

      Collections.sort(pr, (x,y) -> x.capital -y.capital);

      PriorityQueue<Integer> maxHeap =new PriorityQueue<>((x,y) -> y-x);
      int i=0;

      for(int j=0;j<k;j++){
        while(i<n && pr.get(i).capital <= w){
            maxHeap.add(pr.get(i).profit);
            i++;
        }
        if(maxHeap.isEmpty())break;
        w += maxHeap.poll();
      }
     return w;
    }
}