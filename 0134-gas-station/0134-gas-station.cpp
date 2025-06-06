class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
      int totalGas =0, need =0;
      for(int i=0;i<gas.size();i++){
        totalGas += gas[i];
        need +=cost[i];
      }
      if(need>totalGas)return -1;
      
      int currGas =0, start =0;
      for(int i=0;i<gas.size();i++){
          currGas += gas[i] - cost[i];
          if(currGas<0){
           currGas =0;
           start =i+1;
          }
      }

    return start;

    }
};