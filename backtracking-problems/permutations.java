import java.util.ArrayList;
import java.util.List;

public class permutations {


        public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        function(ans, nums, 0);
        return ans;
    }


        public void function(List<List<Integer>> ans, int[] nums, int start)
        {
            if(start == nums.length)
            {
                List<Integer> arr = new ArrayList<>();
                for(int i =0; i < nums.length; i++)
                {
                    arr.add(nums[i]);
                }
                ans.add(arr);
                return;
            }

            for(int i = start; i< nums.length; i++)
            {
                swap(nums, start, i);
                function(ans, nums, start + 1);
                swap(nums, start, i);
            }
        }

        public void swap(int[] nums, int start, int i)
        {
            int temp = nums[start];
            nums[start] = nums[i];
            nums[i] = temp;
        }

}