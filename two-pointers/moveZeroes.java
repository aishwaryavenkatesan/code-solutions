public class moveZeroes {
    public void moveZeroesFunc(int[] nums) {
        
        int i =0;

        for(int n : nums)
        {
            if(n != 0)
            {
                nums[i] = n;
                i++;

            }
        }

            while(i < nums.length)
            {
                nums[i] = 0;
                i++;
            }

        
        }
}
