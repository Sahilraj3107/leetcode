class Solution {
    public String intToRoman(int num) {
        // String str = Integer.toString(num);
        String ans = "";
        while (num > 0) {
            String str = Integer.toString(num);
            int start = str.charAt(0) - '0';
            if (start != 4 && start != 9) {
                if (num >= 1000) {
                    num -= 1000;
                    ans += 'M';
                } else if (num >= 500) {
                    num -= 500;
                    ans = ans + 'D';
                } else if (num >= 100) {
                    num -= 100;
                    ans = ans + 'C';
                } else if (num >= 50) {
                    num -= 50;
                    ans = ans + 'L';
                } else if (num >= 10) {
                    num -= 10;
                    ans = ans + 'X';
                } else if (num >= 5) {
                    num -= 5;
                    ans = ans + 'V';
                } else {
                    while (num != 0) {
                        ans += 'I';
                        num--;
                    }
                }
            }

            else {
                if (num >= 900) {
                    ans = ans + "CM";
                    num -= 900;
                } else if (num >= 400) {
                    ans = ans + "CD";
                    num -= 400;
                } else if (num >= 90) {
                    ans = ans + "XC";
                    num -= 90;
                } else if (num >= 40) {
                    ans = ans + "XL";
                    num -= 40;
                } else if (num >= 9) {
                    ans = ans + "IX";
                    num -= 9;
                } else if (num >= 4) {
                    ans = ans + "IV";
                    num -= 4;
                }
            }
        }
        return ans;
    }
}