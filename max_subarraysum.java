class Solution {
    public int maxSubArray(int[] nums) {
        return solution(nums,0, nums.length-1);
    }
    
    static int solution(int[] nums,int low,int high){
        if(low == high)
            return nums[low];
        int middle = (low + high)/2;
        int leftSum = solution(nums,low, middle);
        int rightSum = solution(nums,middle+1,high);
        
        int leftCross = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=middle; i>=low; i--){
            sum += nums[i];
            leftCross = Math.max(leftCross, sum);
        }
        int rightCross = Integer.MIN_VALUE;
        sum = 0;
        for(int i=middle+1;i<=high;i++){
            sum += nums[i];
            rightCross = Math.max(rightCross, sum);
        }
        return Math.max(Math.max(leftSum, rightSum), leftCross + rightCross);
        
    }
}
