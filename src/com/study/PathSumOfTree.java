package com.study;

import java.util.LinkedList;
import java.util.Queue;

public class PathSumOfTree {
    static TreeNode root= null;
    static Queue queue ;
    static  Integer max =0;
    public static void main(String args[]) {
        Integer[] data = {5, 4, 8, 11, 13};
        queue = new LinkedList();
        root = new TreeNode(data[0]);
        queue.add(root);
        for (int i = 1; i < data.length; i++) {
            TreeNode node = new TreeNode(data[i]);
            insertelementInTree(node);
        }
       // System.out.print(hasPathSum(root, 26));
        System.out.print("--------->"+diameterOfBinaryTree(root));
    }


    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        if(root.left == null && root.right == null && sum - root.val == 0) return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    private static void insertelementInTree( TreeNode node) {
        TreeNode ptr = (TreeNode) queue.peek();
        if (ptr.left == null) {
            ptr.left=node;
        } else {
            if (ptr.right == null) {
                ptr.right=node;
            }
        }
        if (ptr.left != null && ptr.right != null) {
            queue.remove();
        }
        queue.add(node);
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;
    }
}


