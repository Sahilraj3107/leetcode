class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.equals(s2)) return true;
        
        int count = 0;
        char firstS1 = ' ', firstS2 = ' ';
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count == 1) {
                    firstS1 = s1.charAt(i);
                    firstS2 = s2.charAt(i);
                } else if (count == 2) {
                    if (s1.charAt(i) != firstS2 || s2.charAt(i) != firstS1) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        
        return count == 2;
    }
}
