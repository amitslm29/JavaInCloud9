package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.org.tree.BinaryTreeMinimum.Node;

public class MinimumInBinaryTree {

	public static void main(String[] args) {
		BinaryTreeMinimum tree = new BinaryTreeMinimum();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.print("Minimum Value in Tree - " + tree.findMinimum(root));
	}
	
}

class BinaryTreeMinimum {

	Node root;
	
	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public int findMinimum(Node node){
		if(node == null)
			return Integer.MIN_VALUE;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		int minimum = Integer.MAX_VALUE;
		
		while(!queue.isEmpty()){
			Node current = queue.remove();
			
			if(current.data < minimum)
				minimum = current.data;
			
			if(current.left != null)
				queue.add(current.left);
			if(current.right != null)
				queue.add(current.right);
		}
		return minimum;
	}

	public int findMinimumUsingRecursion(Node node){
		
		if(node == null)
			return Integer.MAX_VALUE;
		
		int minimum = node.data;
		int leftMinimum = findMinimumUsingRecursion(node.left);
		int rightMinimum = findMinimumUsingRecursion(node.right);
		
		if(leftMinimum < minimum)
			minimum = leftMinimum;
		if(rightMinimum < minimum)
			minimum = rightMinimum;
		
		return minimum;
	}

}
