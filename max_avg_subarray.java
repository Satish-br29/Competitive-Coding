public class max_avg_subarray {
    public double findMaxAverage(int[] nums, int k) {
        int window_sum=0;
     
        for(int i=0;i<k;i++){
            window_sum=window_sum+nums[i];
        }

       int max_sum=window_sum;

       for(int j=k;j<nums.length;j++){
        window_sum=window_sum-nums[j-k]+nums[j];
        max_sum=Math.max(window_sum,max_sum);
       }

        double result = (double)max_sum/k;
        return result;
    }
}
