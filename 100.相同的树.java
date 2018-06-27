/*
给定两个二叉树，编写一个函数来检验它们是否相同。

如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

示例 1:

输入:       1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

输出: true
示例 2:

输入:      1          1
          /           \
         2             2

        [1,2],     [1,null,2]

输出: false
示例 3:

输入:       1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

输出: false
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
    private StringBuffer ib = new StringBuffer();
    private StringBuffer ib2 = new StringBuffer();
    public boolean isSameTree(TreeNode p, TreeNode q) {
        this.preOrderTraverse(p);
        this.preOrderTraverse2(q);
        if(ib.length() != ib2.length())
            return false;
        else{
           for(int i =0;i<ib.length();i++){
               if(!ib.substring(i,i+1).equals(ib2.substring(i,i+1))){
                   return false;
               }
           }
            return true;
        }
    }
    public void preOrderTraverse(TreeNode t){
        if(t != null){
            ib.append(t.val);
            preOrderTraverse(t.left);
            preOrderTraverse(t.right);
        }
        else{
            ib.append(" ");
        }
        
    }
    public void preOrderTraverse2(TreeNode t){
        if(t != null){
            ib2.append(t.val);
             preOrderTraverse2(t.left);
             preOrderTraverse2(t.right);
        }
        else{
            ib2.append(" ");
        }
            
        
    }
}
