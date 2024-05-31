public class isSubsequence {
    public boolean isSubsequenceFunc(String s, String t) {
        
        if(s == null && t== null)
        return true;

        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length())
        {
            if(s.charAt(i) == t.charAt(j))
            {
                i++;
                j++;
            }

            else {
                j++;
            }
        }

        if( i >= s.length())
        {
            return true;
        }

        return false;
    }
}
