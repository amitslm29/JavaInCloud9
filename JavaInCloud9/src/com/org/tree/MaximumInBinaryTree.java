package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.org.tree.BinaryTreeMaximum.Node;

public class MaximumInBinaryTree {
	
	public static void main(String[] args) {
		BinaryTreeMaximum tree = new BinaryTreeMaximum();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.print("Maximum Value in Tree - " + tree.findMaximum(root));
	}

}

class BinaryTreeMaximum {
	
	Node root;
	
	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public int findMaximum(Node node){
		if(node == null)
			return Integer.MIN_VALUE;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		int maximum = Integer.MIN_VALUE;
		
		while(!queue.isEmpty()){
			Node current = queue.remove();
			
			if(current.data > maximum)
				maximum = current.data;
			
			if(current.left != null)
				queue.add(current.left);
			if(current.right != null)
				queue.add(current.right);
		}
		return maximum;
	}
	
	public int findMaximumUsingRecursion(Node node){
		if(node == null)
			return Integer.MIN_VALUE;
		
		int maximum = node.data;
		int leftMaximum = findMaximumUsingRecursion(node.left);
		int rightMaximum = findMaximumUsingRecursion(node.right);
		
		if(leftMaximum > maximum)
			maximum = leftMaximum;
		if(rightMaximum > maximum)
			maximum = rightMaximum;
		
		return maximum;
	}
}
