class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;

        int i = 0, j = 0;

        int minSum = 0;
        while( j < n ) {
            minSum += nums[j];

            if( minSum >= target ) {
                res = Math.min( (j - i + 1), res );
                
                while( minSum >= target ) {
                    res = Math.min( (j - i + 1), res );
                    minSum -= nums[i];
                    i += 1;
                }
            }
            
            j += 1;
        }   
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}