class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> set =new HashSet<>();
        List<String> rep =new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           if(set.contains(arr[i])){
            if(!rep.contains(arr[i]))rep.add(arr[i]);
           }
           else set.add(arr[i]);
        }
        
        int cnt=1;
        for(int i=0;i<arr.length;i++){
            if(!rep.contains(arr[i])){
                if(cnt==k)return arr[i];
                cnt++;
            }
        }

        return "";
    }
}