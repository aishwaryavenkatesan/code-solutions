import java.util.ArrayList;
import java.util.List;

public class kthSmallestElementInBST {
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
        public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<Integer>();
        dfs(root, result);
        return result.get(k-1);

        
    }

    public void dfs(TreeNode root, List<Integer> result)
    {
        if(root == null)
        return;

        dfs(root.left, result);
        result.add(root.val);
        dfs(root.right, result);

    }
}
