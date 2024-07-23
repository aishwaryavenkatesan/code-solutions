import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sortArrayFrequency {

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i =0; i< nums.length; i++)
        {
            {
                hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            }
        }

        return Arrays.stream(nums)
        .boxed()
        .sorted((a,b) -> hm.get(a) != hm.get(b) ? hm.get(a) - hm.get(b) : b - a)
        .mapToInt(n -> n)
        .toArray();
        
    }

}
