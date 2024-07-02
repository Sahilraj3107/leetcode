class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l1 =new ArrayList<>();

        for(int x : nums1){
            if(!l1.contains(x))
            l1.add(x);
        }

         List<Integer> l2 =new ArrayList<>();
         List<Integer> common =new ArrayList<>();
         for(int y: nums2){
            if(!l1.contains(y) && !l2.contains(y)) l2.add(y);
            else  if(l1.contains(y) && !common.contains(y))common.add(y);
         }
         l1.clear();

         for(int x : nums1){
            if(!common.contains(x) && !l1.contains(x))
            l1.add(x);
        }
         List<List<Integer>> res =new ArrayList<>();
         res.add(l1);
         res.add(l2);
         return res;
    }
}