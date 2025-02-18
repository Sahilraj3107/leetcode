class Solution {
    public void swap(int[] arr, int s, int e) {

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public String smallestNumber(String pattern) {
        int n = pattern.length();
        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++)
            arr[i] = i + 1;

        int i = 1, strt = -1;

        for (i = 1; i <= n; i++) {
            char ch = pattern.charAt(i - 1);
            if (ch == 'D') {
                if (strt == -1)
                    strt = i - 1;
            } else {
                if (strt != -1) {
                    swap(arr, strt, i - 1);
                    strt = -1;
                }
            }
        }
        if (strt != -1) {
            swap(arr, strt, i - 1);
        }
        String ans = "";
        for (int num : arr)
            ans = ans + (char) (num + '0');
        return ans;
    }
}