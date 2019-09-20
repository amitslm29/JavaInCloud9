package com.org.tree.binarysearchtree;

public class ConstructBST {
	
	public static void main(String[] args) {
		
		ConstructBinarySearchTree tree = new ConstructBinarySearchTree();
		
		int[] arr = {10,5,1,7,40,50};
		tree.construct(arr);
		tree.inOrder();
	}

}

class ConstructBinarySearchTree {
	
	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	Node root;
	public ConstructBinarySearchTree(){
		root = null;
	}
	
	public void construct(int[] arr){
		
		Node node = new Node(arr[0]);
		//node.data = arr[0];
		int size = arr.length;
		
		for(int i=1 ; i < size ; i++){
			//int temp = arr[i];
			Node temp = new Node(arr[i]);
			Node current = node;
			
			while(current != null){
				if(temp.data < current.data){
					if(current.left == null){
						current.left = temp;
					}
					else
						current = current.left;
				}
				else if(temp.data > current.data) {
					if(current.right == null)
						current.right = temp;
					else
						current = current.right;
				}
			}
		}
	}
	
	public void inOrder(){
		inOrder(root);
	}
	
	public void inOrder(Node node){
		if(node == null)
			return;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);	
	}
}
