import java.util.ArrayList;

public class balanceBst {

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

        ArrayList<Integer> res = new ArrayList<>();
    
        public TreeNode balanceBST(TreeNode root) {
    
            inorder(root);
            return bbst(0, res.size()-1);
            
        }
    
        public void inorder(TreeNode root)
        {
            if(root == null) return;
            inorder(root.left);
            res.add(root.val);
            inorder(root.right);
        }
    
        private TreeNode bbst(int low, int high)
        {
            if(low > high) return null;
            int mid = low + (high - low) / 2;
            TreeNode node = new TreeNode(res.get(mid));
            node.left = bbst(low, mid -1);
            node.right = bbst(mid + 1, high);
            return node;
    
        }

}
