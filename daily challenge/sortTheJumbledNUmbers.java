import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class sortTheJumbledNUmbers {

    public int[] sortJumbled(int[] mapping, int[] nums) {
        int [] res = new int[nums.length];
        List<Integer> temp = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        int digit = 0;
        int n = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < nums.length; i++)
        {
            String str1 = Integer.toString(nums[i]);

            for(int j = 0; j < str1.length(); j++)
            {
                char ch = str1.charAt(j);
                int m = ch - '0';
                sb.append(mapping[m]);
            }
            hm.put(i, Integer.parseInt(sb.toString()));
            sb.setLength(0);
        }

        HashMap<Integer, Integer> map1 = hm.entrySet().stream().sorted((a,b) -> a.getValue() - b.getValue())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        temp = map1.keySet().stream().toList();
        for(int i = 0; i < nums.length; i ++)
        {
            res[i] = nums[temp.get(i)];
        }
        return res;
    }

}
