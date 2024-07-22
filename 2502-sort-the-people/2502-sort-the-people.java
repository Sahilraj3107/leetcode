class Solution {
    public String[] sortPeople(String[] n, int[] h) {
     int i, j, temp1;
     String temp2;
        boolean swapped;
        for (i = 0; i < h.length - 1; i++) {
            swapped = false;
            for (j = 0; j < h.length - i - 1; j++) {
                if (h[j] < h[j + 1]) {
                      
                    // Swap arr[j] and arr[j+1]
                    temp1 = h[j];
                    h[j] = h[j + 1];
                    h[j + 1] = temp1;
                    temp2=n[j];
                    n[j]=n[j+1];
                   n[j+1]=temp2;
                    swapped = true;
                }
            }
  
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
        return n;
    }
}