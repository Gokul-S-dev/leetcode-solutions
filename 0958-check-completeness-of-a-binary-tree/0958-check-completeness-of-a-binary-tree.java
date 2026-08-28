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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q =new LinkedList<>();
        boolean seenNull = false;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            
            if(temp.left!=null){
                if(seenNull){
                    return false;
                }
                q.add(temp.left);
            }else{
                seenNull=true;
            }
            if(temp.right!=null){
                if(seenNull){
                    return false;
                }
                q.add(temp.right);
            }else{
                seenNull = true;
            }
        }

        return true;
    }
}