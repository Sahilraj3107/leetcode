class Solution {
    public int compress(char[] chars) {
        char ch = chars[0];
        int cnt = 1, n = chars.length;
        int ans = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (chars[i] == ch)
                cnt++;
            else {
                if (cnt == 1)
                    list.add(ch);
                else {
                    list.add(ch);
                    String cntString = Integer.toString(cnt);
                    for (char c : cntString.toCharArray()) {
                        list.add(c);
                    }
                }
                cnt = 1;
                ch = chars[i];
            }
        }
        if (cnt == 1)
            list.add(ch);
        else {
            list.add(ch);
            String cntString = Integer.toString(cnt);
            for (char c : cntString.toCharArray()) {
                list.add(c);
            }
        }

        for(int i=0;i<list.size();i++){
            chars[i]= list.get(i);
        }
        return list.size();
    }
}