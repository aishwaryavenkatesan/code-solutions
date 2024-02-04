import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class cloneGraph {

    class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}



    public HashMap<Integer, Node> result = new HashMap<>();
    public Node cloneGraphMethod(Node node) {

        
        if(node == null) return null;
        
        if(result.containsKey(node.val))
        return result.get(node.val);
        
        Node newNode = new Node(node.val, new ArrayList<Node>());
        result.put(node.val, newNode);
        
        for(Node n : node.neighbors)
        {
            newNode.neighbors.add(cloneGraphMethod(n));
        }
        
        return newNode;

    }
}
