class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int[] res = new int[n + 1];

        res[n] = 0;
        res[n-1] = cost[n-1];

        for(int i = n -2; i >=0; i--)
        {
            res[i] = Math.min((cost[i] + res[i+1]), (cost[i] + res[i+2]));
        }

        return Math.min(res[0], res[1]);
        
    }
}