package com.coding;

import java.util.LinkedList;
import java.util.Queue;

import static com.coding.BinaryTree.*;

public class LevelWiseMaxSum {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insertLevelOrder(1);
        bt.insertLevelOrder(2);
        bt.insertLevelOrder(3);
        bt.insertLevelOrder(4);
        bt.insertLevelOrder(5);
        bt.insertLevelOrder(6);
        bt.insertLevelOrder(7);
        bt.insertLevelOrder(8);
        bt.insertLevelOrder(20);
        LevelWiseMaxSum lms = new LevelWiseMaxSum();
        int maxSum = lms.getMaxSum(bt.root);
        System.out.println(maxSum);
    }

    private int getMaxSum(Node root) {
        int maxSum = Integer.MIN_VALUE;
        if (root == null)
            return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSum=0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                levelSum +=temp.data;
                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);
            }
            if(levelSum>maxSum)
                maxSum=levelSum;
        }
        return maxSum;
    }
}
