package com.algr0409;
import com.util.TreeNode;

/**
 * 101
 * 递归循环
 * 1.root的左子叶树和右子叶树是否为镜像
 * 2.判断条件为值不相等，或其中一个节点为空
 * 3.逐层每个节点进行对比
 *
 * 看了答案，比较两个二叉树和可以拿根的左子叶树和根的右子叶树进行比较
 * 相似问题：比较两个二叉树是否为镜像
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null){
            return true;
        }
        boolean res = isMirror(root.left,root.right);
        return res;
    }

    public boolean isMirror(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null){
            return true;
        }
        if(t1==null||t2==null){
            return false;
        }
        if(t1.val != t2.val){
            return false;
        }
        return isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);
    }
}
