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
    public boolean f(TreeNode left, TreeNode right){
        if(left==null || right==null)return left==right;

        if(left.val!=right.val)return false;

        boolean l =f(left.left, right.right);
        boolean r =f(left.right, right.left);

        return (l && r);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return f(root.left,root.right);
    }
}