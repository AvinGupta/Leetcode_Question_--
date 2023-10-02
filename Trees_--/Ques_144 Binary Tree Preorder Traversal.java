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
// recursive solution.
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst=new ArrayList<>();
        preOrder(root,lst);
        return lst;
    }
    public static void preOrder(TreeNode root,List<Integer> lst){
        if(root==null) return;
        lst.add(root.val);
        preOrder(root.left,lst);
        preOrder(root.right,lst);
    }
}
//Iterative solution using stack.
class Solution{
    public List<Integer> preorderTraversal(){
        List<Integer> lst=new ArrayList<>();
        if(root==null) return lst;
        Stack<TreeNode> st=new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            lst.add(root);
            if(root.right!=null) st.push(root.right);
            if(root.left!=null) st.push(root.left);
        }   
        return lst;
    }
}
