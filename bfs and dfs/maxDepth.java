public class maxDepth {
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
    public int maxDepthTree(TreeNode root) {

        if(root == null)
        return 0;

        int ld = maxDepthTree(root.left);
        int rd = maxDepthTree(root.right);

        if(root.left == null && root.right == null)
        return 1;

        if(root.left == null)
        return 1 + rd;

        if(root.right == null)
        return 1 + ld;

        return Math.max(ld, rd) + 1;
        
    }
    
}
