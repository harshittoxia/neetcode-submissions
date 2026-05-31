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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       if(root == null){
        return false;
       }

       if(subRoot == null){
        return true;
       }

       if(checkSameRoot(root, subRoot)){
        return true;
       }else{
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
       }
    }

    boolean checkSameRoot(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }

        if(root != null && subRoot != null && root.val == subRoot.val){
            return checkSameRoot(root.left, subRoot.left) && 
                    checkSameRoot(root.right, subRoot.right);
        }
        return false;
    }
}
