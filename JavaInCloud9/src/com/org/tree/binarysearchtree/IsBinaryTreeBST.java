package com.org.tree.binarysearchtree;

import com.org.tree.binarysearchtree.BinaryTreeBST.Node;

/*
 * https://www.techiedelight.com/determine-given-binary-tree-is-a-bst-or-not/
 * Another approach, where we can use in-order traversal to solve this.
 * In-order traversal of a BST returns the node in sorted order.
 */
public class IsBinaryTreeBST {

	public static void main(String[] args) {
		Node root = new Node(100);
		root.left = new Node(50);
		root.right = new Node(150);
		root.left.left = new Node(25);
		root.left.right = new Node(75);
		root.right.left = new Node(125);
		root.right.right = new Node(175);
		
		BinaryTreeBST tree = new BinaryTreeBST();
		System.out.println("Is given tree is BST - " 
				+ tree.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
}

class BinaryTreeBST {
	
	Node root;
	
	static class Node {
		int data;
		Node left, right;
		public Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public boolean isBST(Node node, int minValue, int maxValue){
		
		if(node == null)
			return true;
		
		if(node.data < minValue || node.data > maxValue)
			return false;
		
		return isBST(node.left, minValue, node.data)
				&& isBST(node.right, node.data, maxValue);
	}
}
