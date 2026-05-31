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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> response = new ArrayList<>();
        bfs(root, response);
        return response;
    }

    void bfs(TreeNode root, List<Integer> response){
        if(root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int num = queue.size();
            Stack<Integer> subList = new Stack<>();

            for(int i = 0 ; i < num; i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                subList.push(queue.poll().val);
            }
            response.add(subList.pop());
        }
    }
}
