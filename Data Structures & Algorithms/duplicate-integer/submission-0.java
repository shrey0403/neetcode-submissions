class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int last= nums.length-1;
        while(i<last){
            if (nums[i]==nums[i+1]) {
                return true;
            }
            i++;
        }
        return false;
    }
}