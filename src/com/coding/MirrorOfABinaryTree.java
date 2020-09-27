package com.coding;
import static com.coding.BinaryTree.*;
public class MirrorOfABinaryTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insertLevelOrder(1);
        bt.insertLevelOrder(2);
        bt.insertLevelOrder(3);
        bt.insertLevelOrder(4);
        bt.insertLevelOrder(5);
        bt.insertLevelOrder(6);
        bt.insertLevelOrder(7);
        MirrorOfABinaryTree mirror = new MirrorOfABinaryTree();
        TreeTraversal tt=new TreeTraversal();
        tt.levelOrderTraversal(bt.root);
        System.out.println("\nMirror of the above tree");
        mirror.mirrorOfATree(bt.root);
        tt.levelOrderTraversal(bt.root);
    }

    private void mirrorOfATree(Node root) {
        if(root==null)
            return;
        mirrorOfATree(root.left);
        mirrorOfATree(root.right);
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
}
