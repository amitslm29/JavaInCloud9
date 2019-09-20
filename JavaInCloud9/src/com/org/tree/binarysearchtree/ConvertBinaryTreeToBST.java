package com.org.tree.binarysearchtree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.org.tree.binarysearchtree.BinaryTreeToBST.Node;

/*
 * Convert a Binary Tree into BST by maintaining its original structure
 * 
 * Traverse the Binary tree and store its data in a treeset. We know that 
 * an in-order traversal of a BST returns the node in a sorted order, so we 
 * traverse the tree again in in-order fashion and put back the keys present
 * in the set (in sorted order) back to their correct position in BST.
 * 
 * The advantage of using Treeset over array is, we no need to sort the Treeset
 * explicitly.
 */
public class ConvertBinaryTreeToBST {
	
	public static void main(String[] args) {
		
		Node root = new Node(50);
		root.left = new Node(75);
		root.right = new Node(25);
		root.left.left = new Node(125);
		root.left.right = new Node(100);
		root.right.left = new Node(150);
		root.right.right = new Node(175);
		
		BinaryTreeToBST tree = new BinaryTreeToBST();
		Set<Integer> set = new TreeSet<>();
		
		System.out.print("Binary Tree - ");
		tree.inOrder(root);
		System.out.println();
		
		System.out.print("Binary Search Tree - ");
		tree.extractData(root, set);
		tree.convertToBST(root, set.iterator());
		tree.inOrder(root);
	}

}

class BinaryTreeToBST {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		public Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	//Method to traverse Binary tree and store its data in a set
	public void extractData(Node node, Set<Integer> set){
		if(node == null)
			return;
		extractData(node.left, set);
		set.add(node.data);
		extractData(node.right, set);
	}
	
	//Method to construct BST by using data from set in in-order fashion
	public void convertToBST(Node node, Iterator<Integer> it){
		if(node == null)
			return;
		convertToBST(node.left, it);
		node.data = it.next();
		convertToBST(node.right, it);
	}
	
	public void inOrder(Node node){
		if(node == null)
			return;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
	
}