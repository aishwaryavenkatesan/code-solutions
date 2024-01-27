

public class invertBinaryTree {
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
    public TreeNode invertTree(TreeNode root) {

        if(root == null)
        return null;

        TreeNode ln = invertTree(root.left);
        TreeNode rn = invertTree(root.right);

        if(root.left == null && root.right == null)
        return root;

        TreeNode temp = new TreeNode();
        temp = rn;
        root.right = ln;
        root.left = temp;
        return root;
        
    }
    
}
