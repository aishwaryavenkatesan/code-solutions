import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
        List<List<Integer>> res = new ArrayList<>();
    List<Integer> sub = new ArrayList<>();

    public List<List<Integer>> combinationSum2func(int[] candidates, int target) {

        Arrays.sort(candidates);
        combination(candidates, target, 0);
        return res;
    }

    public void combination(int[] candidates, int target, int start)
    {
        if(target == 0)
        {
            res.add(new ArrayList<>(sub));
            return;
        }

        for(int i = start; i < candidates.length; i++)
        {
            if(i > start && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] <= target)
            {
                sub.add(candidates[i]);
                combination(candidates, target - candidates[i], i + 1);
                sub.remove(sub.size() - 1);

            }

            

        }
    }
}
