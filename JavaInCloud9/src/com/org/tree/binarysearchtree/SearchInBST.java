package com.org.tree.binarysearchtree;

import com.org.tree.binarysearchtree.BSTSearch.Node;

public class SearchInBST {
	
	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(10);
		root.right = new Node(30);
		root.left.left = new Node(5);
		root.left.right = new Node(15);
		root.right.left = new Node(25);
		root.right.right = new Node(35);
		
		BSTSearch tree = new BSTSearch();
		Node result = tree.search(root, 15);
		if(result == null)
			System.out.println("Search data is not found !!!");
		else
			System.out.println("Search data is found !!!");
	}
}

class BSTSearch {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public Node search(Node node, int searchData){
		if(node == null)
			return null;
		
		Node current = node;
		while(current != null){
			if(searchData == current.data) 
				return current;
			if(searchData < current.data)
				current = current.left;
			else
				current = current.right;
		}
		return null;
	}
	
	public Node searchUsingRecursion(Node node, int searchData){
		if(node == null)
			return null;
		if(searchData == node.data)
			return node;
		else if(searchData < node.data)
			return searchUsingRecursion(node.left, searchData);
		else
			return searchUsingRecursion(node.right, searchData);
		
	}
}
