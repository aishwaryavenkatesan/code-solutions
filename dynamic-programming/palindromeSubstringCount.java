public class palindromeSubstringCount {
    public int countSubstrings(String s) {

        int len = s.length();

        if(len < 2)
        return len;

        int result = 0;

        for(int i =0; i < len; i++)
        {
            int left = i;
            int right = i;

            while(left >=0 && right < len && s.charAt(left) == s.charAt(right))
            {
                result++;
                left-=1;
                right+=1;

            }

            left = i;
            right = i+1;

                        while(left >=0 && right < len && s.charAt(left) == s.charAt(right))
            {
                result++;
                left-=1;
                right+=1;

            }

        }

        return result;
        
    }
    
}
