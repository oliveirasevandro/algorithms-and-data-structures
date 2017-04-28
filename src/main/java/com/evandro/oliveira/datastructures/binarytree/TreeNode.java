package com.evandro.oliveira.datastructures.binarytree;

/**
 * <p>Implementation of BinaryTree Structure</p>
 * <p>Elements to the left are smaller than the root</p>
 * <p>Elements to the right are greater than the root</p>
 *
 * Created by eso on 28/04/17.
 */
public class TreeNode {

    public int root;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(int root) {
        this.root = root;
    }


    public void addNode(int newRoot) {
        if (newRoot < root) {
            if (left == null) left = new TreeNode(newRoot);
            else left.addNode(newRoot);
        } else {
            if (right == null) right = new TreeNode(newRoot);
            else right.addNode(newRoot);
        }
    }

    public void preOrderTraversal() {

        if (left != null) left.preOrderTraversal();
        System.out.println(root);
        if (right != null) right.preOrderTraversal();
        System.out.println(root);
    }

    public void postOrderTraversal() {

        if (right != null) right.preOrderTraversal();
        System.out.println(root);
        if (left != null) left.preOrderTraversal();
        System.out.println(root);
    }


}
