class Solution {
    public int missingInteger(int[] nums) {

    Set<Integer> set =new HashSet<>();
    set.add(nums[0]);   
    int j=1;
    int sum =nums[0];
    for(;j<nums.length;j++){
        set.add(nums[j]);
        if(nums[j]!=nums[j-1]+1)break;
        sum += nums[j];
    }

    for (int i=j+1;j<nums.length;j++){
        set.add(nums[j]);
    }

    while(set.contains(sum))sum++;
    return sum;


    }
}