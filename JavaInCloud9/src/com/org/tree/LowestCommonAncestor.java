package com.org.tree;

import com.org.tree.BinaryTreeLowestCommonAncestor.Node;

/*
 * https://www.youtube.com/watch?v=F-_1sbnPbWQ
 */
public class LowestCommonAncestor {
	
	public static void main(String[] args) {
		BinaryTreeLowestCommonAncestor tree = new BinaryTreeLowestCommonAncestor();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.right.left.left = new Node(10);
		root.right.left.right = new Node(11);
		root.right.right.right = new Node(12);
		
		Node result = tree.lowestCommonAncestor(root, root.right.left.left, root.right.right.right);
		System.out.println("Lowest Common Ancestor between two given node is - " + result.data);
	}
}

class BinaryTreeLowestCommonAncestor {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public Node lowestCommonAncestor(Node node, Node first, Node second){
		if(node == null)
			return null;
		if(node == first || node == second)
			return node;
		
		Node leftLCA = lowestCommonAncestor(node.left, first, second);
		Node rightLCA = lowestCommonAncestor(node.right, first, second);
		
		if(leftLCA != null && rightLCA != null)
			return node;
		else if(leftLCA == null && rightLCA == null)
			return null;
		else
			return leftLCA == null ? rightLCA : leftLCA;
		
	}
}
