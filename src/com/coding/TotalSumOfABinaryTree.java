package com.coding;
import java.util.LinkedList;
import java.util.Queue;

import static com.coding.BinaryTree.*;

public class TotalSumOfABinaryTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insertLevelOrder(1);
        bt.insertLevelOrder(2);
        bt.insertLevelOrder(3);
        bt.insertLevelOrder(4);
        bt.insertLevelOrder(5);
        bt.insertLevelOrder(6);
        bt.insertLevelOrder(7);

        TotalSumOfABinaryTree lms = new TotalSumOfABinaryTree();
        int totalSum = lms.getTotalSum(bt.root);
        System.out.println(totalSum);
    }
    private int getTotalSum(Node root) {
        int totalSum =0;
        if (root == null)
            return totalSum;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                totalSum +=temp.data;
                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);
            }
        }
        return totalSum;
    }
}
