package com.algr0511;

import com.util.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        boolean re = helper(root,null,null);
        return re;
    }

    private boolean helper(TreeNode root,Integer lower,Integer upper){
        if(root == null){
            return true;
        }
        int val = root.val;
        if(lower != null && val < lower) return false;
        if(upper != null && val > upper) return false;
        if(!(helper(root.left,lower,val))) {
            return false;
        }
        if(!(helper(root.right,val,upper))) {
            return false;
        }
        return true;
    }
}
