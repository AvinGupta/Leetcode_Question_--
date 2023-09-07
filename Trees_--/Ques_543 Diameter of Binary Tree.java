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


//Diameter of Bianry Tree.
// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null) return 0;
//         int leftDiameter=diameterOfBinaryTree(root.left);
//         int rightDiameter=diameterOfBinaryTree(root.right);
//         int selfDiameter=height(root.left)+height(root.right)+2;
//         return Math.max(selfDiameter,Math.max(leftDiameter,rightDiameter));

//     }
//     public static int height(TreeNode root){
//         if(root==null) return -1;
//         int left=height(root.left);
//         int right=height(root.right);
//         return Math.max(left,right)+1;
//     }
// }

//optimum diameter of the Binary 
class Pair{
    int ht=-1;
    int dmt=0;
}
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dmt;
    }
    public static Pair diameter(TreeNode root){
        if(root==null) return new Pair();
        Pair leftPair=diameter(root.left);
        Pair rightPair=diameter(root.right);
        int self=leftPair.ht+rightPair.ht+2;
        Pair selfPair=new Pair();
        selfPair.dmt=Math.max(self,Math.max(leftPair.dmt,rightPair.dmt));
        selfPair.ht=Math.max(leftPair.ht,rightPair.ht)+1;
        return selfPair;
    }
}
