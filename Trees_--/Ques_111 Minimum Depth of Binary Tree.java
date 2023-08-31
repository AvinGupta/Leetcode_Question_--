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

    //Using BFS.
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        int depth=1;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                root=q.poll();
                if(root.left==null && root.right==null) return depth;
                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
            }
            depth++;
        }
        return 0; //dead line.
    }


    //Using DFS.
    public int minDepth(TreeNode root){
        if(root==null) return 0;
        if(root.right==null && root.left==null) return 1;
        if(root.left==null) return 1+minDepth(root.right);
        if(root.right==null) return 1+minDepth(root.left);
        else return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
}
