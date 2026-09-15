class Solution {
    public int[] twoSum(int[] nums, int target) {


        for(int i=0; i<nums.length-1; i++){
            for (int n=i+1; n<nums.length; n++){
                if(nums[i]+nums[n]==target){
                    return new int[]{i,n};
                }
            }
        }
        return null;
        
    }
}
