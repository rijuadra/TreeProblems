package com.coding;

import java.util.LinkedList;
import java.util.Queue;

import static com.coding.BinaryTree.*;

public class FindMinimumInABT {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insertLevelOrder(10);
        bt.insertLevelOrder(2);
        bt.insertLevelOrder(3);
        bt.insertLevelOrder(4);
        bt.insertLevelOrder(5);
        bt.insertLevelOrder(6);
        bt.insertLevelOrder(7);
        FindMinimumInABT findMinimumInABT = new FindMinimumInABT();
        System.out.println("Minimum element in a BT "+findMinimumInABT.findMin(bt.root));
    }

    private int findMin(Node root) {
        int min=Integer.MAX_VALUE;
        if (root == null)
            return min;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                if(temp.data<min)
                    min=temp.data;
                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);
            }
        }
        return min;
    }
}
