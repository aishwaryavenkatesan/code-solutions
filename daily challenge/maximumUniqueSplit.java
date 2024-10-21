import java.util.HashSet;
import java.util.Set;

public class maximumUniqueSplit {

    public int maxUniqueSplit(String s) {

        Set<String> subStrings = new HashSet<String>();
        return backtrack(0, s, subStrings);
        
    }

    public int backtrack(int start, String s, Set<String> substrings)
    {
        if(start == s.length())
        return 0;

        int maxSplits = 0;
        for(int end = start + 1; end <= s.length(); end++)
        {
            String temp = s.substring(start, end);
            if(!substrings.contains(temp))
            {
                substrings.add(temp);
                maxSplits = Math.max( maxSplits, 1 + backtrack(end, s , substrings));
                substrings.remove(temp);
            }

        }

        return maxSplits;
    }

}
