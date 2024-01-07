public class longestPalindromeSubstring {
    public String longestPalindrome(String s) {

        int len = s.length();

        if(len < 2)
        return s;

        int resultLength = 0;
        String result = "";

        for(int i =0; i < len; i++)
        {
            int left = i;
            int right = i;

            while( left >=0 && right < len && s.charAt(left)==s.charAt(right))
            {
                if(right - left + 1 > resultLength)
                {
                    resultLength = right - left + 1;
                    result = s.substring(left, right + 1);

                }

                left-=1;
                right+=1;
            }

            left = i;
            right = i+1;


            while( left >=0 && right < len && s.charAt(left)==s.charAt(right))
            {
                if(right - left + 1 > resultLength)
                {
                    resultLength = right - left + 1;
                    result = s.substring(left, right + 1);

                }

                left-=1;
                right+=1;
            }


        }

        return result;


        
    }

    public static void main(String[] args) {
        longestPalindromeSubstring obj = new longestPalindromeSubstring();
        System.out.println(obj.longestPalindrome("babad"));
        
    }
    
}
