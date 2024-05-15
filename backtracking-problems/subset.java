import java.util.ArrayList;
import java.util.List;

public class subset {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        helper(res, sub, 0, nums);
        return res;
        
    }

    public void helper(List<List<Integer>> res, List<Integer> sub, int start, int[] nums)
    {
        if(start >= nums.length)
        {
            res.add(new ArrayList<>(sub));
        }

        else
        {
            sub.add(nums[start]);
            helper(res, sub, start + 1, nums);
            sub.remove(sub.size() - 1);
            helper(res, sub, start + 1, nums);
        }

    }
}