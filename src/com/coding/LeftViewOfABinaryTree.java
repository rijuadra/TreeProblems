package com.coding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static com.coding.BinaryTree.*;

public class LeftViewOfABinaryTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insertLevelOrder(1);
        bt.insertLevelOrder(2);
        bt.insertLevelOrder(3);
        bt.insertLevelOrder(4);
        bt.insertLevelOrder(5);
        bt.insertLevelOrder(6);
        bt.insertLevelOrder(7);
        LeftViewOfABinaryTree lv = new LeftViewOfABinaryTree();
        List<Integer> leftViewNodes=lv.leftView(bt.root);
        System.out.println(leftViewNodes);
    }

    private List<Integer> leftView(Node root) {
        List<Integer> leftNodes = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                if (i == 0)
                    leftNodes.add(temp.data);
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);

            }
        }
        return leftNodes;
    }
}
