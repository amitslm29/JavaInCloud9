package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.org.tree.BinaryTreeConvertToMirror.Node;

public class ConvertToMirrorImage {

	public static void main(String[] args) {
		BinaryTreeConvertToMirror tree = new BinaryTreeConvertToMirror();

		Node root = new Node(1);	
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		System.out.print("Original Tree - ");
		tree.print(root);

		System.out.println();
		tree.convertToMirrorImage(root);
		System.out.print("Mirror Image of Tree - ");
		tree.print(root);
	}
}

class BinaryTreeConvertToMirror {

	Node root;

	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}

	public void convertToMirrorImage(Node node){
		if(node == null)
			return;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		
		while(!queue.isEmpty()){
			Node current = queue.remove();
			swap(current);
			if(current.left != null)
				queue.add(current.left);
			if(current.right != null)
				queue.add(current.right);
		}
	}


	public void convertToMirrorImageUsingRecursion(Node node){
		if(node == null)
			return;

		swap(node);
		
		convertToMirrorImageUsingRecursion(node.left);
		convertToMirrorImageUsingRecursion(node.right);
	}
	
	public void swap(Node node){
		Node temp = node.left;
		node.left = node.right;
		node.right = temp;
	}

	public void print(Node node) {
		if(node == null)
			return;
		print(node.left);
		System.out.print(node.data + " ");
		print(node.right);
	}
}
