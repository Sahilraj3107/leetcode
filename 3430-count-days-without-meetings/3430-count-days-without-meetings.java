class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second =second;
    }
}
class Solution {
    public int countDays(int days, int[][] meetings) {
        
        Arrays.sort(meetings, (a, b) -> {
            return a[0] - b[0];
        });
        Set<Pair> set =new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();

        int start = meetings[0][0], end = meetings[0][1];

        for (int i = 1; i < meetings.length; i++) {
            int s =meetings[i][0], e =meetings[i][1];
            Pair currentPair = new Pair(s, e);
            if(set.contains(currentPair))continue;
            else {
                set.add(currentPair);
            }
            if (s > start && s < end) {
                if (e < end) {
                    continue;
                } else {
                    end = e;
                }
            }else if(s==start){
                  if(e>end){
                    end =e;
                  }
                  else continue;
            }
            else if(s==end){
                 end =e;
            }
             else {
                List<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);
                list.add(temp);
                start = meetings[i][0];
                end = meetings[i][1];
            }
        }

        List<Integer> temp = new ArrayList<>();
        temp.add(start);
        temp.add(end);
        list.add(temp);

       long cnt=0;
        for(List<Integer> it: list){
            cnt +=(it.get(1)-it.get(0)+1);
        }
         int res =days -(int)(cnt);
        // System.out.println(list);
        return res;
    }
}