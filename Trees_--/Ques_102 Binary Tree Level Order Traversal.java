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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> lst=new ArrayList<>();
        if(root==null) return lst;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> lst_1=new ArrayList<>();
            for(int i=0;i<size;i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                lst_1.add(q.poll().val);
            }
            lst.add(lst_1);
        }
        return lst;
    }
}
