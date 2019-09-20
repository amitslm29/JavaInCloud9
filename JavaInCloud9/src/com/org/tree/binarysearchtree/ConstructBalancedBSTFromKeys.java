package com.org.tree.binarysearchtree;

import java.util.Arrays;
import com.org.tree.binarysearchtree.BalancedBSTFromKeys.Node;

public class ConstructBalancedBSTFromKeys {

	public static void main(String[] args) {
		int[] arr = {15, 10, 20, 8, 12, 16, 25};
		
		BalancedBSTFromKeys tree = new BalancedBSTFromKeys();
		Node root = tree.convertToBalancedBST(arr, 0, arr.length-1);
		tree.inOrder(root);
	}
}

class BalancedBSTFromKeys {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public Node convertToBalancedBST(int[] arr, int start, int end){
		Arrays.sort(arr);
		Node node = null;
	
		if(start <= end){
			int mid = (start+end)/2;
			node = new Node(arr[mid]);
			node.left = convertToBalancedBST(arr, start, mid-1);
			node.right = convertToBalancedBST(arr, mid+1, end);
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
