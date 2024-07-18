class Solution {
    public int[] plusOne(int[] digits) {

        Stack<Integer> stk = new Stack<>();
        int n = digits.length - 1;
        int rem = 0;


        for (int i = n; i >= 0; i--) {
            if (i == n) {
                int x = digits[i] + 1;
               if(x<=9){
                stk.push(x);
                rem =0;
                }
               else{
                rem =x/10;
                x=x%10;
                stk.push(x);
               }
               System.out.print(stk.peek()+ " ");
            } else {
                int x = digits[i] + rem;
              if(x<=9){
                stk.push(x);
                rem =0;
                }
               else{
                rem =x/10;
                x=x%10;
                stk.push(x);
               }
               System.out.print(stk.peek()+ " ");
            }
        }


        if (rem != 0){
            stk.push(rem);
             System.out.print(stk.peek() +" ");
        }

        int[] res = new int[stk.size()];
        int i=0;
        while(!stk.isEmpty()){
            res[i++]=stk.pop();
        }
        return res;
    }
}