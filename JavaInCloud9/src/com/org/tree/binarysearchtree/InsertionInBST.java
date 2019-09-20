package com.org.tree.binarysearchtree;

import com.org.tree.binarysearchtree.BSTInsertion.Node;

/*
 * A new key always inserted at leaf
 * in Binary Search Tree
 */
public class InsertionInBST {

	public static void main(String[] args) {
		
		Node root = new Node(20);
		root.left = new Node(10);
		root.right = new Node(30);
		root.left.left = new Node(5);
		root.left.right = new Node(15);
		root.right.left = new Node(25);
		root.right.right = new Node(35);
		
		BSTInsertion tree = new BSTInsertion();
		
		System.out.print("Before inserting new node : ");
		tree.inOrder(root);
		
		tree.insert(root, 40);
		System.out.println();
		
		System.out.print("After inserting new node : ");
		tree.inOrder(root);
	}
}

class BSTInsertion {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	public Node insert(Node node, int insertData){
		
		if(node == null)
			node = new Node(insertData);
		
		Node current = node;
		Node parent = null;
		
		while(current != null){
			parent = current;
			if(insertData < current.data)
				current = current.left;
			else
				current = current.right;
		}
		
		if(insertData < parent.data)
			parent.left = new Node(insertData);
		else
			parent.right = new Node(insertData);
		
		return node;
	}
	
	
	public Node insertUsingRecursion(Node node, int insertData){
		if(node == null){
			node = new Node(insertData);
		}
		else if(insertData < node.data) {
			node.left = insertUsingRecursion(node.left, insertData);
		}
		else if(insertData > node.data) {
			node.right = insertUsingRecursion(node.right, insertData);
		}
		return node;
	}
	
	public void inOrder(Node node){
		if(node == null)
			return;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);	
	}
}
