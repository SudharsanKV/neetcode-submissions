/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString(); 
    }

    public void buildString(TreeNode root, StringBuilder sb){
        if(root==null){
            sb.append("#,");
            return;
        }
        sb.append(root.val).append(",");
        buildString(root.left, sb);
        buildString(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList(Arrays.asList(data.split(",")));
        return buildTree(q);
    }
    
    public TreeNode buildTree(Queue<String> nodes){
        String str = nodes.poll();
        if(str.equals("#")){
            return null;
        }
        TreeNode curr = new TreeNode(Integer.parseInt(str));
        curr.left = buildTree(nodes);
        curr.right = buildTree(nodes);
        return curr;
    }   
}
