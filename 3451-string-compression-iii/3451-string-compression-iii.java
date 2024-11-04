class Solution {
    public String compressedString(String word) {
        int n = word.length();
        Map<Character, Integer> map = new HashMap<>();
        String ans = "";
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (map.isEmpty() || (map.containsKey(ch) && map.get(ch) < 9)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                String num = String.valueOf(map.get(word.charAt(i - 1)));
                ans = ans + num + word.charAt(i - 1);
                map.remove(word.charAt(i - 1));
                map.put(word.charAt(i), 1);
            }
        }

        String num = String.valueOf(map.get(word.charAt(n - 1)));
        ans = ans + num + word.charAt(n - 1);
        return ans;
    }
}