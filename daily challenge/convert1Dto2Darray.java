public class convert1Dto2Darray {
        public int[][] construct2DArray(int[] original, int m, int n) {
            
            int row = original.length;
            int[][] res = new int[m][n];
    
            if(row != m * n)
            return new int[][] {};
    
            int count = 0;
    
            for(int i = 0; i < m; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    res[i][j] = original[count++];
                }
            }
    
            return res;
        }
}
