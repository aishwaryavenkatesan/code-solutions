class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        if(n == 1)
        return nums[0];

        if(n == 2)
        return Math.max(nums[0], nums[1]);

        nums[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++)
        {
            nums[i] = Math.max((nums[i] + nums[i-2]), nums[i-1]);
        }

        return nums[n-1];
        
    }
}