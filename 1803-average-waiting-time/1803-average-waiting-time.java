class Solution {
    public double averageWaitingTime(int[][] customers) {

        int n = customers.length;
        double time_waiting = customers[0][1];
        int finish = customers[0][0] + customers[0][1];

        for (int i = 1; i < n; i++) {
            int[] times = customers[i];
            int arrive = times[0];

            int start_cook = Math.max(arrive, finish);
            int end_time = start_cook + times[1];
            finish = end_time;
            time_waiting += end_time - arrive;
        }
        return time_waiting / n;
    }
}