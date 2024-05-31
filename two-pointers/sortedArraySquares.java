public class sortedArraySquares {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] result = new int[nums.length];
        int temp = nums.length-1;

        while(left<=right)
        {
        if(Math.abs(nums[left]) > Math.abs(nums[right]))
        {
            result[temp] = nums[left] * nums[left];
            temp--;
            left++;
        }

        else
        {
            result[temp] = nums[right] * nums[right];
            temp--;
            right--;
        }
        // temp--;
        }

        return result;
        
    }
}
