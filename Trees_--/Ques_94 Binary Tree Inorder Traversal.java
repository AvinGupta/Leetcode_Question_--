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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst=new ArrayList<>();
        inOrder(root,lst);
        return lst;
    }
    public static void inOrder(TreeNode root,List<Integer> lst){
        if(root==null) return;
        inOrder(root.left,lst);
        lst.add(root.val);
        inOrder(root.right,lst);
    }
}
//Iterative solution using stack.
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null) return lst;
        TreeNode node=root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                node=st.pop();
                lst.add(node.val);
                node=node.right;
            }
        }
        return lst;
    }
}
