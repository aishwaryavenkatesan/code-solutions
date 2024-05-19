class houseRobber2 {
    public int rob1(int[] nums) {
        if(nums.length == 1)
        return nums[0];

        if(nums.length == 2)
        return Math.max(nums[0], nums[1]);
        
        int r1 = robHouses1(nums, 0, nums.length - 2);
        int r2 = robHouses1(nums, 1, nums.length - 1);
        return Math.max(r1, r2);
    }

    public int robHouses1(int[] nums, int start, int end)
    {
        int dp0 = 0;
        int dp1 = 0;
        int curr;
        
        for(int i = start; i <= end; i++)
        {
            curr = Math.max((dp0 + nums[i]), dp1);
            dp0 = dp1;
            dp1 = curr;
        }
        return dp1;
    }
}