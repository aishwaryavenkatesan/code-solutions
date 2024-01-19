import java.util.Arrays;

public class longestIncreasingSubsequence {
        public int lengthOfLIS(int[] nums) {
        if(nums.length == 1) return 1;

        int[] dp = new int[nums.length];
        dp[nums.length -1] = 1;
        Arrays.fill(dp, 1);

        int maximumLength = 1;

        for(int i = nums.length - 1; i>= 0; i--)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] < nums[j])
                {
                    dp[i] = Math.max(dp[i], 1+ dp[j]);
                }
            }

            maximumLength = Math.max(maximumLength, dp[i]);

        }


        return maximumLength;
    }
}
