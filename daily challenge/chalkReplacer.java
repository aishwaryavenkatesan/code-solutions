public class chalkReplacer {
        public int chalkReplacerFunc(int[] chalk, int k) {
            
            int n = chalk.length;
            int i = 0;
    
            while(k >= chalk[i])
            {
                k = k - chalk[i];
                i++;
    
                if(i == n)
                {
                    i = 0;
                }
            }
    
            return i;
        }
    
}
