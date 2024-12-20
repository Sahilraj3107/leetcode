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
class Solution {
    public void solve(TreeNode left, TreeNode right,boolean flag){
        if(left==null || right==null)return;
         if(flag){
           left.val =left.val^right.val;
            right.val =left.val^right.val;
            left.val =left.val^right.val;
         }
          flag =!flag;
         solve(left.left, right.right, flag);
         solve(left.right, right.left, flag);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null)return null;
        
        solve(root.left,root.right,true);
        return root;

    }
}