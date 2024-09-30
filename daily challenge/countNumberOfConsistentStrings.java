import java.util.HashSet;
import java.util.Set;

public class countNumberOfConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        
        Set<Character> word = new HashSet<>();
        boolean res = true;
        int count = 0;

        for(int i = 0; i < allowed.length(); i++)
        {
            word.add(allowed.charAt(i));
        }

        for(int i =0; i < words.length; i++)
        {
            String str = words[i];
            for(int j =0; j < str.length(); j++)
            {
                res = true;
                if(!(word.contains(str.charAt(j))))
                {
                    res = false;
                    break;    
                }
            }

            if(res)
            count++;

            // System.out.println(res);
         
        }


        return count;
    }

}
