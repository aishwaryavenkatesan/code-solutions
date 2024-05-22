import java.util.ArrayList;
import java.util.List;

public class combinationSum3 {
        List<List<Integer>> res = new ArrayList<>();
    List<Integer> comb = new ArrayList<>();

    int nums[] = {1,2,3,4,5,6,7,8,9};

    public List<List<Integer>> combinationSum3Func(int k, int n) {
        
        backtrack(0, k, n, n, nums);
        return res;
    }

    public void backtrack(int start, int k , int n, int target, int[] nums)
    {


        if(comb.size() == k)
        {
            if(target == 0)
            {
            res.add(new ArrayList<Integer>(comb));
            }
        return;
        }

        for(int i = start; i < nums.length; i++)
        {
            if(nums[i] <= target)
            {
            comb.add(nums[i]);
            backtrack(i+1, k , n , target - nums[i], nums);
            comb.remove(comb.size() - 1);
            }

        }

    }
}
