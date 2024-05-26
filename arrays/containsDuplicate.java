package arrays;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {

        public boolean containsDuplicatFunc(int[] nums) {
        
        Set<Integer> res = new HashSet<>();

        for(int i : nums)
        {
            if(res.contains(i))
            return true;

            res.add(i);
        }

        return false;
    }
    
}
