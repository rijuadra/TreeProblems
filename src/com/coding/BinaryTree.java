package com.coding;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root=null;
    public Node insertLevelOrder(int data){
        if(root==null)
            root=new Node(data);
        else{
            Queue<Node> list=new LinkedList<>();
            list.offer(root);
            while(!list.isEmpty()){
                Node temp=list.poll();
                if(temp.left!=null){
                    list.offer(temp.left);
                }else{
                    temp.setLeft(new Node(data));
                    return root;
                }
                if(temp.right!=null){
                    list.offer(temp.right);
                }else{
                    temp.setRight(new Node(data));
                    return root;
                }
            }
        }
        return root;
    }
   static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }


}
