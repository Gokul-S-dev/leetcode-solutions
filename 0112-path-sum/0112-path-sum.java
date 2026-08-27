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
    public boolean traversal(TreeNode root, int targetSum, int sum){
        if(root==null){
            return false;
        }
        sum+=root.val;
        if (root.left == null && root.right == null) {
            return sum == targetSum;
        }

        return 
        traversal(root.left,targetSum,sum) || 
        traversal(root.right,targetSum,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return traversal(root,targetSum,0);
        
    }
}