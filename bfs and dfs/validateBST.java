public class validateBST {
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
        public boolean dfs(TreeNode root, Integer min, Integer max)
        {
            if(root == null)
            return true;

            if((min!= null && root.val <= min) || (max != null && root.val >= max))
            return false;

            boolean ld = dfs(root.left, min, root.val);
            boolean rd = dfs(root.right, root.val, max);

            return ld && rd;
        }
    public boolean isValidBST(TreeNode root) {

        if(root == null)
        return true;

        return dfs(root, null, null);

        



        
    }
}
