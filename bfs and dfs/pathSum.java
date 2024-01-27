public class pathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
       }
    }
    public boolean dfs(TreeNode root, int currentSum, int targetSum) {
        if(root == null)
        return false;

        currentSum = currentSum + root.val;

        if(Math.abs(currentSum) > Math.abs(targetSum))
        return false;

        if((root.left == null && root.right == null) && currentSum == targetSum)
        return true;

        boolean left = dfs(root.left, currentSum, targetSum);
        boolean right = dfs(root.right, currentSum, targetSum);

        return left || right;



    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int currentSum = 0;
        return dfs(root, currentSum, targetSum);
        
    }

}
