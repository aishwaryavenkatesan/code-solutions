import java.util.ArrayList;
import java.util.List;

public class findTheWinner {

    public int findTheWinnerFunc(int n, int k) {
        List<Integer> res = new ArrayList<>();

        for(int i = 1; i <=n; i++)
        {
            res.add(i);
        }

        int current = 0;

        while(res.size() > 1)
        {
            int nextToRemove = (current + k - 1) % res.size();
            res.remove(nextToRemove);
            current = nextToRemove;
        }

        return res.get(0);
    }

}
