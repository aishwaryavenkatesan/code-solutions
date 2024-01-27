import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class binaryTreeLevelOrderTraversal {
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
        public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null)
        return res;

        queue.add(root);

        while(queue.size() != 0)
        {
            int len = queue.size();
            List<Integer> temp = new ArrayList<Integer>();
            for(int i =0; i < len; i++)
            {
                TreeNode tmp = queue.poll();

                temp.add(tmp.val);

                if(tmp.left != null)
                queue.add(tmp.left);

                if(tmp.right != null)
                queue.add(tmp.right);
            }

            res.add(temp);
        }

        return res;
        
    }
    
}
