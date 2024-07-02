import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> res = new ArrayList<>();

        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;

        while(i < m && j < n)
        {
            if(nums1[i] == nums2[j])
            {
                res.add(nums1[i]);
                i++;
                j++;
            }

            else if(nums1[i] < nums2[j])
            {
                i++;
            }

            else
            {
                j++;
            }

        }


        int[] intArray = res.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
    }

}
