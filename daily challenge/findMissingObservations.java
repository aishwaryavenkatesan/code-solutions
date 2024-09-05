public class findMissingObservations {

        public int[] missingRolls(int[] rolls, int mean, int n) {
            
            int m = rolls.length;
            int sum = 0;
            int temp = 0;
            int[] res = new int[n];
    
            for(int i : rolls)
            {
                sum+= i;
            }
    
            temp = (mean * (n + m)) - sum;
    
            if(temp < 0 || temp < n )
            return new int[] {};
    
            while(n > 0)
            {
                int r = temp / n;
    
                if(r > 6)
                {
                    return new int[] {};
                }
    
                // digits.add(r);
                res[n - 1] = r;
                temp-= r;
                n--;
    
            }
    
            return res;
        }
    
}
