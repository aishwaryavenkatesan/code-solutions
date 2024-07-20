import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class luckyNumbers {

    public List<Integer> luckyNumbersFunc(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int min = 0;
        int max = 0;
        Set<Integer> minMax = new HashSet<Integer>();
        List<Integer> res = new ArrayList<>();

        for(int i =0; i < m; i++)
        {
            min = matrix[i][0];
            for( int j = 1; j < n; j++)
            {
                min = Math.min(min, matrix[i][j]);
            }
            minMax.add(min); 
        }

        for(int i = 0; i < n; i++)
        {
            max = matrix[0][i];
            for(int j = 1; j < m; j++)
            {
                max = Math.max(max, matrix[j][i]);
            }

            if(minMax.contains(max))
                {
                    res.add(max);
                }            
        }
        return res;
    }

}
