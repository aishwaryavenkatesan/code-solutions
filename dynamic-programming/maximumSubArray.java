public class maximumSubArray {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];

int res = nums[0];
int max = 1;
int min = 1;

for (int n : nums) {
    int tmp = max * n;
    System.out.println("n value " + n);
    System.out.println("tmp " + tmp);
    max = Math.max(n, Math.max(tmp, min * n));
    System.out.println("max " + max);
    min = Math.min(n, Math.min(tmp, min * n));
    System.out.println("min " + min);
    res = Math.max(res, max);
    System.out.println("res " + res);
}
return res;

}
    
}
