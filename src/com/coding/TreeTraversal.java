package com.coding;
import java.util.LinkedList;
import java.util.Queue;

import static com.coding.BinaryTree.*;
public class TreeTraversal {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insertLevelOrder(1);
        bt.insertLevelOrder(2);
        bt.insertLevelOrder(3);
        bt.insertLevelOrder(4);
        bt.insertLevelOrder(5);
        bt.insertLevelOrder(6);
        bt.insertLevelOrder(7);

        TreeTraversal tt=new TreeTraversal();

        System.out.println("Pre Order Traversal");
        tt.preOrderTraversal(bt.root);

        System.out.println("\nIn Order Traversal");
        tt.inOrderTraversal(bt.root);

        System.out.println("\nPost Order Traversal");
        tt.postOrderTraversal(bt.root);

        System.out.println("\nLevel Order Traversal");
        tt.levelOrderTraversal(bt.root);
    }

    public void levelOrderTraversal(Node root) {
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
           Node temp= queue.poll();
            System.out.print(temp.data+" ");
           if(temp.left!=null)
               queue.offer(temp.left);
           if(temp.right!=null)
               queue.offer(temp.right);
        }
    }

    public void preOrderTraversal(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    public void inOrderTraversal(Node root){
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.print(root.data+" ");
            inOrderTraversal(root.right);
        }
    }
    public void postOrderTraversal(Node root){
        if(root!=null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data+" ");
        }
    }

}
