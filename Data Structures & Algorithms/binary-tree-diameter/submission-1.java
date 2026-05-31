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
    public int diameterOfBinaryTree(TreeNode root) {
       int[] resp = new int[1];
       dfp(root, resp);
       return resp[0];
    }

    int dfp(TreeNode root, int[] arr){
        if(root == null) return 0;

        int left = dfp(root.left, arr);
        int right = dfp(root.right, arr);
        arr[0] = Math.max( arr[0] ,left + right);
        return 1 + Math.max(left, right);
    }
}
