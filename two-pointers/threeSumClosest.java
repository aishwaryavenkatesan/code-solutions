import java.util.Arrays;

public class threeSumClosest {

    public int threeSumClosestFunc(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < nums.length - 2; i++)
        {
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k)
            {
                int sum = nums[i] + nums[j] + nums[k];

                if(Math.abs(target - sum) < Math.abs(target -res))
                {
                    res= sum;
                }

                if(sum < target)
                {
                    j++;
                }

                else
                {
                    k--;
                }

            }
        }

        return res;
    }
}

