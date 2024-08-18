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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> lst=new ArrayList<>();
        findPath(lst,new ArrayList<Integer>(),root,targetSum);
        return lst;
    }
    public static void findPath(List<List<Integer>> lst,List<Integer> arr,TreeNode root,int tar){
        if(root==null) return;
        if(root.left==null && root.right==null){
            if(tar-root.val==0){
                arr.add(root.val);
                lst.add(new ArrayList<>(arr));
                arr.remove(arr.size()-1);
            }
            return;
        }
        arr.add(root.val);
        findPath(lst,arr,root.left,tar-root.val);
        findPath(lst,arr,root.right,tar-root.val);
        arr.remove(arr.size()-1);
    }
}
