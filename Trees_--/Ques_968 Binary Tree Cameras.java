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
    int count=0;
    public int minCameraCover(TreeNode root) {
        int val=check(root);
        if(val==-1) count++;
        return count;
    }
    public int check(TreeNode root){
        if(root==null){ 
            return 0;
        }
        int left=check(root.left);
        int right=check(root.right);
        if(left==-1 || right==-1){
            count++;
            return 1;
        }
        else if(left==1 || right==1){
            return 0;
        }
        return -1;
    }
}
//0-->covered
//-1-->need to cover
//1-->camera itself.
