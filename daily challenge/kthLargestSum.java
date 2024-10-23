import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class kthLargestSum {
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

    public long kthLargestLevelSum(TreeNode root, int k) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<Long> maxArray = new ArrayList<>();

        q.add(root);

        while(!q.isEmpty())
        {
            long sum = 0;
            int count = q.size();

            for(int i = 0; i < count; i++)
            {
                TreeNode temp = q.poll();
                sum+= temp.val;
                System.out.println("Sum " + sum);

                if(temp.left != null)
                q.add(temp.left);

                if(temp.right != null)
                q.add(temp.right);
            }
            maxArray.add(sum);

        }

        if(maxArray.size() < k)
        return -1;

        Collections.sort(maxArray);
        return maxArray.get(maxArray.size() - k);
    }

}
