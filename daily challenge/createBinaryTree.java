import java.util.HashMap;


public class createBinaryTree {

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

    public TreeNode createBinaryTreeFunc(int[][] descriptions) {
        
        int n = descriptions.length;
        HashMap<Integer, TreeNode> map = new HashMap<>();
        TreeNode root = null;

        for(int i =0; i <n ; i++)
        {
            int key = descriptions[i][1];
            TreeNode value = new TreeNode(key);

            if(!map.containsKey(key))
            {
                map.put(key, value);
            }

        }

        for(int i = 0; i < n; i++)
        {
            int parent = descriptions[i][0];
            int child = descriptions[i][1];
            TreeNode childNode = map.get(child);

            if(map.containsKey(parent))
            {
                TreeNode parentNode = map.get(parent);
                if(descriptions[i][2] == 1)
                {
                    parentNode.left = childNode;
                }

                else
                {
                    parentNode.right = childNode;
                }

                map.put(parent, parentNode);
            }

            else
            {
                root = new TreeNode(parent);
                if(descriptions[i][2] == 1)
                {
                    root.left = childNode;
                }

                else
                {
                    root.right = childNode;
                }                
                map.put(parent, root);    
            }
        }
        return root;
    }

}
