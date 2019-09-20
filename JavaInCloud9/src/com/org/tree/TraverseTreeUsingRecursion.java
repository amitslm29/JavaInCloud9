package com.org.tree;

import com.org.tree.BinaryTreeTraversal.Node;

public class TraverseTreeUsingRecursion {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right = new Node(5);
		root.right.right = new Node(6);
		
		BinaryTreeTraversal tree = new BinaryTreeTraversal();
		
		System.out.print("Preorder - ");
		tree.preOrder(root);
		System.out.println();
		
		System.out.print("Inorder - ");
		tree.inOrder(root);
		System.out.println();
		
		System.out.print("Postorder - ");
		tree.postOrder(root);
		System.out.println();	
	}
}

class BinaryTreeTraversal {
	
	Node root;
	
	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}

	public void preOrder(Node node){
		if(node == null)
			return;
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);	
	}

	public void inOrder(Node node){
		if(node == null)
			return;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);	
	}

	public void postOrder(Node node){
		if(node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);	
		System.out.print(node.data + " ");
	}
}
