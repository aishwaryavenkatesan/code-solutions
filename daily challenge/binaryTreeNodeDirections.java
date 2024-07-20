public class binaryTreeNodeDirections {

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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder s = new StringBuilder();
        StringBuilder d = new StringBuilder();
        TreeNode ancestor = lca(root, startValue, destValue);
        pathString(ancestor, startValue, s);
        pathString(ancestor, destValue, d);

        s.reverse().toString();


        return "U".repeat(s.length()) + d.reverse().toString();
    }

    public TreeNode lca(TreeNode root, int startValue, int destValue)
    {
        if(root == null)
        return null;


        if(root.val == startValue || root.val == destValue)
        return root;

        TreeNode lTree = lca(root.left, startValue, destValue);
        TreeNode rTree = lca(root.right, startValue, destValue);

        if(lTree != null && rTree != null)
        return root;

        return (lTree == null) ? rTree : lTree;
    }

    public boolean pathString(TreeNode root, int startValue, StringBuilder res)
    {
        if(root == null)
        return false;

        if(root.val == startValue)
        return true;

        boolean left = pathString(root.left, startValue, res);
        boolean right = pathString(root.right, startValue, res);

        if(left)
        res.append("L");

        else if(right)
        res.append("R");

        return left || right;

    }


}
