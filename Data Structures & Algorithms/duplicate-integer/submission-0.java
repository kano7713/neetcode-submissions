class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i=0; i<nums.length-1; i++){

            for(int n=i+1; n<nums.length; n++){
                if(nums[i]==nums[n]){return true;}
            }
        }
        return false;
    }
}