import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class kthDiistinctString {

    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> hm = new LinkedHashMap<>();
        int count = 0;
        String res = "";

        for(int i =0; i < arr.length; i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i], 1);
            }

            else
            {
                hm.put(arr[i], hm.getOrDefault(arr[i], 1) + 1);   
            }
            
        }

        System.out.println(hm);
        System.out.println(hm.entrySet());

          for (Map.Entry<String, Integer> entry : hm.entrySet())
        {
            if(entry.getValue() == 1)
            {
                System.out.println(entry.getKey());
                if(count == k-1)
                {
                    return entry.getKey();
                }
                
                else
                {
                    count++;
                }
            }
        }

        return res;
    }

}
