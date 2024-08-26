/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> list =new ArrayList<>();
    private void dfs(Node root){
          if(root==null)return;
        for(Node ch: root.children){
             dfs(ch);
        }
        list.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        dfs(root);
       return list;
    }
}