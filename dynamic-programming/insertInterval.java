import java.util.ArrayList;
import java.util.List;

public class insertInterval {
        public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        for(int[] interval : intervals)
        {
            if(newInterval == null || newInterval[0] > interval[1])
            {
                res.add(interval);
            }

            else if(interval[0] > newInterval[1])
            {
                res.add(newInterval);
                res.add(interval);

                newInterval = null;
            }

            else
            {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
            
        }
        if(newInterval != null)
        res.add(newInterval);

        return res.toArray(new int[res.size()][]);
        
    }
    
}
