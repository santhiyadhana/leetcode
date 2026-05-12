class Solution {
    public boolean canJump(int[] nums) {
        int finalPosition = nums.length-1;

        for(int idx = finalPosition - 1; idx >= 0; idx--){
           
            if(idx + nums[idx] >= finalPosition){
                finalPosition = idx;
            }
        }

        return finalPosition == 0;
    }
}