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
        int[] dmt=new int[1];
        height(root,dmt);
        return dmt[0];
    }
    public int height(TreeNode root,int[] dmt){
        if(root==null) return 0;
        int left=height(root.left,dmt);
        int right=height(root.right,dmt);
        dmt[0]=Math.max(dmt[0],right+left);
        return 1+Math.max(left,right);
    }
}
