class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a' + 1;
            str.append(Integer.toString(num));
        }

        System.out.println(str);

        while (k-- > 0) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += (str.charAt(i) - '0');
            }
            System.out.println(sum);
            s = Integer.toString(sum);
            str.setLength(0);
            str.append(s);
        }
        int res = Integer.parseInt(str.toString());
        return res;
    }
}