public class subtreeOfAnotherTree {
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
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root == null || subRoot == null)
        return false;

        if(root.val == subRoot.val && sameTree(root, subRoot))
        return true;
        
        boolean lSubTree = isSubtree(root.left , subRoot);
        boolean rSubTree = isSubtree(root.right, subRoot);

        return lSubTree || rSubTree;
    }

    public boolean sameTree(TreeNode root, TreeNode subRoot)
    {
        if(root == null && subRoot == null)
        return true;

        if(root == null || subRoot==null)
        return false;

        if(root.val != subRoot.val)
        return false;

        boolean ld = sameTree(root.left, subRoot.left);
        boolean rd = sameTree(root.right, subRoot.right);

        return ld && rd;
    }
}
