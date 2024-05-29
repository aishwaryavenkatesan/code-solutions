public class validPalindrome {
    public boolean isPalindrome(String s) {

        if(s.isEmpty()) {
            return true;
        }

        int l = 0; 
        int r = s.length()-1;

        while(l <= r)
        {
            char currFirst = s.charAt(l);
            char currLast = s.charAt(r);

            if(!Character.isLetterOrDigit(currFirst))
            {
                l++;
            }
            else if(!Character.isLetterOrDigit(currLast))
            {
                r--;
            }
            else {
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast))
                {
                    return false;
                }

            l++;
            r--;

            }

        }

        return true;
        
    }
}
