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
    public int findBottomLeftValue(TreeNode root) {
        //perform the level order  traversal and from right to left and return the last value of the 
        // list.
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        ArrayList<Integer> lst=new ArrayList<>();
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                if(q.peek().right!=null) q.offer(q.peek().right);
                if(q.peek().left!=null) q.offer(q.peek().left);
                lst.add(q.poll().val);
            }
        }
        return lst.get(lst.size()-1);   
    }
}
