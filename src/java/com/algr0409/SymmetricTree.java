package com.algr0409;
import com.util.TreeNode;

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
