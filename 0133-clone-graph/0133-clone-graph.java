/*
// Definition for a Node.
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

        Queue<Node> q = new LinkedList<>();
        HashMap<Integer, Node> visited = new HashMap<>();
        Node root = new Node(node.val);

        q.add(node);
        visited.put(node.val, root);
        while(!q.isEmpty()){
            Node nd = q.poll();
            Node currNode = visited.get(nd.val);

            for(Node adj : nd.neighbors){
                if(visited.containsKey(adj.val)){
                    Node newAdj = visited.get(adj.val);
                    currNode.neighbors.add(newAdj);
                    continue;
                }

                Node newAdj = new Node(adj.val);
                currNode.neighbors.add(newAdj);

                visited.put(newAdj.val, newAdj);
                q.add(adj);
            }
        }

        return root;
    }
}