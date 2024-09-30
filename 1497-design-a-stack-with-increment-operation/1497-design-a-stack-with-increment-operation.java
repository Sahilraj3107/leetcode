class CustomStack {
   int[] arr ;
   int i=0;
    public CustomStack(int maxSize) {
        arr =new int[maxSize];
    }
    
    public void push(int x) {
        if(i>=(arr.length))return;
        arr[i]=x;
        i++;
    }
    
    public int pop() {
        if(i==0)return -1;
        int element =arr[i-1];
        i--;
        return element;
    }
    
    public void increment(int k, int val) {
        if(i==0)return;
        for(int j=0;j<k && j<arr.length;j++){
            arr[j] +=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */