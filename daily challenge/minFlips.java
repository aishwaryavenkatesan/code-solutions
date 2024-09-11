public class minFlips {

        public int minBitFlips(int start, int goal) {
    
            int count = start ^ goal;
            String s1 = Integer.toBinaryString(count);
            int res = 0;
    
            for(char ch : s1.toCharArray())
            {
                if(ch == '1')
                res++;
            }
    
    
    
            
            return res;
        }
    
}
