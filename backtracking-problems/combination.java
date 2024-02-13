import java.util.ArrayList;
import java.util.List;

public class combination {
        List<List<Integer>> res;

    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        backtrack(1, new ArrayList<>(), n, k);
        return res;
        
    }

    public void backtrack(int start, List<Integer> combination, int n, int k)
    {
        if(combination.size() == k)
        {
            res.add(new ArrayList<>(combination));
            return;
        }

        for(int i = start; i<= n; i++)
        {
            combination.add(i);
            backtrack(i+1, combination, n, k);
            combination.remove(combination.size() - 1);
        }
    }
}
