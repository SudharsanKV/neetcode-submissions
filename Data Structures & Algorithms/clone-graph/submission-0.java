/*
Definition for a Node.
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
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        HashMap<Node, Node> visited = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        visited.put(node, new Node(node.val));
        while(!q.isEmpty()){
            Node curr = q.remove();
            for(Node nbr: curr.neighbors){
                if(!visited.containsKey(nbr)){
                    visited.put(nbr, new Node(nbr.val));
                    q.add(nbr);
                }
                visited.get(curr).neighbors.add(visited.get(nbr));
            }
        }
        return visited.get(node);
        
    }
}