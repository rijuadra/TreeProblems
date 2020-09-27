package com.coding;

import java.util.LinkedList;
import java.util.Queue;

import static com.coding.BinaryTree.*;

public class FindAnyElement {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insertLevelOrder(1);
        bt.insertLevelOrder(2);
        bt.insertLevelOrder(3);
        bt.insertLevelOrder(4);
        bt.insertLevelOrder(5);
        bt.insertLevelOrder(6);
        bt.insertLevelOrder(7);

        FindAnyElement findAnyElement=new FindAnyElement();
        System.out.println("Is 6 available? "+findAnyElement.find(bt.root,6));
        System.out.println("Is 12 available? "+findAnyElement.find(bt.root,12));
    }
    private boolean find(Node root,int data){
        if (root == null)
            return false;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                if(temp.data==data)
                    return true;
                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);
            }
        }
        return false;
    }
}
