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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> lst=new ArrayList<>();
        if(root==null) return lst;
        //0--> left to right
        //1--> right to left
        int flag=1;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> lst_1=new ArrayList<>();
            while(size-->0){
                TreeNode node=q.peek();
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
                lst_1.add(q.poll().val); 
            }
            if(flag%2!=0){
                lst.add(lst_1);
            }
            else{
                Collections.reverse(lst_1);
                lst.add(lst_1);
            }
            flag++;
        }
        return lst;
    }
}
