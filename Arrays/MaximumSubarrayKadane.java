public class MaximumSubarrayKadane {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int globalMaxSum = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            maxSum += nums[i];
            if(maxSum < 0){
                maxSum = 0;
            }else{
                globalMaxSum = Math.max(maxSum, globalMaxSum);
            }
        }

        if(globalMaxSum < 0){
            int maxi = Integer.MIN_VALUE;

            for(int x : nums){
                if(x > maxi){
                    maxi = x;
                }
            }
            return maxi;
        }

        return (globalMaxSum == Integer.MIN_VALUE) ? -1 : globalMaxSum;
    }
}
