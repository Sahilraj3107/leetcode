class Solution {
public:
    int countDays(int days, vector<vector<int>>& meetings) {
        sort(meetings.begin(), meetings.end());
        set<pair<int, int>> uniqueMeetings;
        vector<pair<int, int>> mergedMeetings;

        int start = meetings[0][0], end = meetings[0][1];

        for (int i = 1; i < meetings.size(); i++) {
            int s = meetings[i][0], e = meetings[i][1];
            pair<int, int> currentPair = {s, e};
            
            if (uniqueMeetings.count(currentPair)) continue;
            uniqueMeetings.insert(currentPair);

            if (s > start && s < end) {
                if (e > end) {
                    end = e;
                }
            } else if (s == start) {
                if (e > end) {
                    end = e;
                }
            } else if (s == end) {
                end = e;
            } else {
                mergedMeetings.push_back({start, end});
                start = s;
                end = e;
            }
        }
        
        mergedMeetings.push_back({start, end});
        
        long long cnt = 0;
        for (auto& it : mergedMeetings) {
            cnt += (it.second - it.first + 1);
        }
        
        return days - (int)cnt;
    
    }
};