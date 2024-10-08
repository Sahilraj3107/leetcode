class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk =new Stack<>();

        for(int i=0;i<s.length();i++){
           char ch =s.charAt(i);
           if(stk.isEmpty()){
            stk.add(ch);
            continue;
           }
           if(ch==')' && stk.peek()=='('){
           stk.pop();
           }
           else stk.push(ch);
        }
       return stk.size();
    }
}