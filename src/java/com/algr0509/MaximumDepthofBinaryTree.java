package com.algr0509;

import com.util.TreeNode;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left + right+1;
    }
}
