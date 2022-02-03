package com.study;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    static TreeNode root= null;
    static Queue queue ;
    public static void main(String args[]){

        int data[] = {1,2,3,4,5,6,7,8,9,10};
        queue = new LinkedList();
        root= new TreeNode(data[0]);
        queue.add(root);
        for(int i=1;i<data.length;i++){
            TreeNode node= new TreeNode(data[i]);
            insertelementInTree(node);
        }

    }

    private static void insertelementInTree( TreeNode node) {
        TreeNode ptr = (TreeNode) queue.peek();
        if (ptr.left == null) {
            ptr.left=node;
        } else {
            if (ptr.right == null) {
                ptr.right =node;
            }
        }
        if (ptr.left != null && ptr.right != null) {
            queue.remove();
        }
        queue.add(node);
    }
}
