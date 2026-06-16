class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int end = -1;
        int start = -1;

        for(int i=0;i<n;i++){
            if(nums[i]<max){
                end =i;
            }else{
                max=nums[i];
            }
        }

        for(int i=n-1;i>=0;i--){

            if(nums[i]>min){
                start =i ;
            }else{
                min = nums[i];
            }
        }

        return start==end?0:end-start+1;
    }
}