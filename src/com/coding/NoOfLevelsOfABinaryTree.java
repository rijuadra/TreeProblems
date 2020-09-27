package com.coding;
import java.util.LinkedList;
import java.util.Queue;

import static com.coding.BinaryTree.*;
public class NoOfLevelsOfABinaryTree {
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
        NoOfLevelsOfABinaryTree nt=new NoOfLevelsOfABinaryTree();
        int noOfLevels = nt.findNoOfLevels(bt.root);
        System.out.println("Total no of levels are: "+noOfLevels);
    }

    private int findNoOfLevels(Node root) {
        int noOfLevels=0;
        if(root==null)
            return noOfLevels;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            noOfLevels++;
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node temp=queue.poll();
                if(temp.left!=null)
                    queue.offer(temp.left);
                if(temp.right!=null)
                    queue.offer(temp.right);
            }
        }
        return noOfLevels;
    }
}
