import java.util.ArrayList;
import java.util.List;

public class combinationSum {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> tempList = new ArrayList<>();

    public List<List<Integer>> combinationSumValue(int[] candidates, int target) {
        combination(candidates, target, 0);
        return res;
        
    }

    public void combination(int[] candidates, int target, int start)
    {
        if(target == 0)
        {
        res.add(new ArrayList<>(tempList));
        return;
        }

        for(int i = start; i < candidates.length; i++)
        {
            if(candidates[i] <= target)
            {
            tempList.add(candidates[i]);
            combination(candidates, target - candidates[i], i);
            tempList.remove(tempList.size() - 1);
            }
        }
    }
    
}
