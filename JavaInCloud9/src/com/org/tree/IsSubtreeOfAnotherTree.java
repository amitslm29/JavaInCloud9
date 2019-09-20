package com.org.tree;

import com.org.tree.BinaryTreeIsSubTree.Node;

/*
 * Iterative Solution
 * We know that inorder and preorder traversal or inorder and postorder
 * traversal identify a tree uniquely. The idea is store inorder and postorder
 * traversal of both trees in separate arrays. Then, for a given tree X
 * to be subset of another binary tree Y, the inorder traversal of X should be
 * subset of inorder traversal of Y. Similarly the postorder traversal of X
 * should be subset of postorder traversal of Y. We can also perform preorder
 * traversal instead of postorder traversal.
 * https://www.techiedelight.com/determine-given-binary-tree-is-subtree-of-another-binary-tree-not/
 */
public class IsSubtreeOfAnotherTree {

	public static void main(String[] args) {
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);
		root1.right.left = new Node(6);
		root1.right.right = new Node(7);
		
		Node root2 = new Node(3);
		root2.left = new Node(6);
		root2.right = new Node(7);
		
		BinaryTreeIsSubTree tree = new BinaryTreeIsSubTree();
		System.out.println("Is second tree is a subtree of first tree : " + tree.isSubtree(root1, root2));
	}
}


class BinaryTreeIsSubTree {

	Node root;

	static class Node{
		int data;
		Node left, right;
		public Node(int data){
			this.data = data;
			left = right = null;
		}
	}

	//Method to store in-order traversal in StringBuffer
	public void inOrder(Node node, StringBuffer sb) {
		if(node == null)
			return;
		inOrder(node.left, sb);
		sb.append(String.valueOf(node.data));
		inOrder(node.right, sb);
	}

	//Method to store post-order traversal in StringBuffer
	public void postOrder(Node node, StringBuffer sb) {
		if(node == null)
			return;
		postOrder(node.left, sb);
		postOrder(node.right, sb);
		sb.append(String.valueOf(node.data));
	}

	public boolean isSubtree(Node treeNode, Node subtreeNode){

		//Base case - If subtree is null, it is always a subtree of Tree
		if(subtreeNode == null)
			return true;
		
		//Base case - If Tree is null, return false
		if(treeNode == null)
			return false;

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();

		inOrder(treeNode, sb1);
		inOrder(subtreeNode, sb2);

		if(!sb1.toString().contains(sb2.toString()))
			return false;

		sb1 = new StringBuffer();
		sb2 = new StringBuffer();

		postOrder(treeNode, sb1);
		postOrder(subtreeNode, sb2);

		if(!sb1.toString().contains(sb2.toString()))
			return false;
		
		return true;
	}
}