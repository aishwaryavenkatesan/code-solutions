public class sameTree {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null)
        return true;

        if(p == null || q == null)
        return false;

        if(p.val != q.val)
        return false;

        boolean ld = isSameTree(p.left, q.left);
        boolean rd = isSameTree(p.right , q.right);

        return ld && rd;



        
    }
    
}
