package com.org.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.org.test.BinaryTree.Node;

public class TreeCommon {

	public static void main(String[] args) {
		
		/*Node root = new Node(1);
		root.left = new Node(75);
		root.right = new Node(25);
		root.left.left = new Node(125);
		root.left.right = new Node(100);
		root.right.left = new Node(150);
		root.right.right = new Node(175);
		
		
		BinaryTree tree = new BinaryTree();
		tree.print(root);
		
		Set<Integer> set = new TreeSet<>();
		
		tree.print(root);
		tree.extract(root, set);
		tree.constructBST(root, set.iterator());
		tree.print(root);*/
	}
}


class BinaryTree {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	
	
	
	
	
	
	public Node insert(Node node, int element){
		if(node == null)
			node = new Node(element);
		
		Node current = node;
		Node parent = null;
		
		while(current != null){
			parent = current;
			if(element < current.data)
				current = current.left;
			else
				current = current.right;
		}
		
		if(element < parent.data)
			parent.left = new Node(element);
		else
			parent.right = new Node(element);
		return node;
	}
	
	
	
	
	
	
	
	
	public Node construct(int[] arr, int start, int end){
		Arrays.sort(arr);
		Node node = null;
		if(start > end)
			return node;
		
		int mid = (start+end)/2;
		
		node = new Node(arr[mid]);
		node.left = construct(arr, start, mid-1);
		node.right = construct(arr, mid+1, end);
		return node;
	}
	
	
	
	
	
	
	
	
	
	public boolean isBST(Node node, int min, int max) {
		if(node == null) return true;
		if(node.data < min || node.data > max) return false;
		return isBST(node.left, min, node.data) && isBST(node.right, node.data, max);
	}
	
	
	public void extract(Node node, Set<Integer> set) {
		if(node == null) return;
		extract(node.left, set);
		set.add(node.data);
		extract(node.right, set);
	}
	
	public void constructBST(Node node, Iterator<Integer> it){
		if(node == null) return;
		constructBST(node.left, it);
		node.data = it.next();
		constructBST(node.right, it);
	}
	
	public void print(Node node){
		if(node == null) return;
		print(node.left);
		System.out.print(node.data + " ");
		print(node.right);
	}
}

