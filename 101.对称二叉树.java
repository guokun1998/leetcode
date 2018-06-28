/*
给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3
但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3
说明:

如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private StringBuffer sb1 = new StringBuffer();
    private StringBuffer sb2 = new StringBuffer();
    public boolean isSymmetric(TreeNode root) {
        this.preOrderTraverse(root);
        this.afterOrderTraverse(root);
        if(sb1.length() != sb2.length()){
            return false;
        }
        else{
            for(int i=0;i<sb1.length();i++){
                if(!sb1.substring(i,i+1).equals(sb2.substring(i,i+1)))
                    return false;
            }
            return true;
        }
    }
    public void preOrderTraverse(TreeNode t){
        if(t != null){
            sb1.append(t.val);
            preOrderTraverse(t.left);
            preOrderTraverse(t.right);
        }
        else{
            sb1.append(" ");
        }
        
    }
    public void afterOrderTraverse(TreeNode t){
        if(t != null){
            sb2.append(t.val);
            afterOrderTraverse(t.right);
            afterOrderTraverse(t.left);
            
        }
        else{
            sb2.append(" ");
        }
        
    }
}
