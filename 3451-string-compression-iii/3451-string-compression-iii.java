class Solution {
    public String compressedString(String word) {

        StringBuilder str = new StringBuilder("");
        int cnt = 1;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                cnt++;
                if (cnt == 9) {
                    String x = Integer.toString(cnt);
                    str.append(cnt);
                    str.append(word.charAt(i));
                    cnt = 0;
                }
            } else {
                if (cnt == 0) {
                    cnt = 1;
                    continue;
                }
                String x = Integer.toString(cnt);
                str.append(cnt);
                str.append(word.charAt(i - 1));
                cnt = 1;
            }
        }
        if (cnt != 0) {
            String x = Integer.toString(cnt);
            str.append(cnt);
            str.append(word.charAt(word.length() - 1));
        }
        return str.toString();
    }
}