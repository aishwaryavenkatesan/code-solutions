import java.util.Arrays;

public class minimumDifference {

    public int minDifference(int[] nums) {
        
        if(nums.length <= 4)
        return 0;

        Arrays.sort(nums);
        int n = nums.length;

        int res = nums[n-1] - nums[0];

        for(int i =0; i<=3; i++)
        {
            res = Math.min(res, nums[n - (3-i) - 1] - nums[i]);
        }

        return res;
    }

}
