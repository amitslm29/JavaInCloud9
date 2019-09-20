package com.org.tree.binarysearchtree;

/*
 * Case-1 : Deleting a node with no children
 * Simply remove the node from the tree
 * Case-2 : Deleting a node with one children
 * Remove the node and replace it with its child
 * Case-3 : Deleting a node with two children
 * Find the in-order successor of the node and then replace
 * the node with in-order successor and then delete the
 * in-order successor
 * https://www.techiedelight.com/deletion-from-bst/
 */
public class DeletionInBST {
	
	public static void main(String[] args) {
		
	}

}

class BSTDeletion {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		public Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public Node delete(Node node, int deleteData){
		
		//Base case
		if(node == null)
			return null;	
		
		Node current = node;
		Node parent = null;
		
		while(current != null && current.data != deleteData){
			parent = current;
			if(deleteData < current.data)
				current = current.left;
			else
				current = current.right;
		}
		
		//Return null if key is not found in the tree
		if(current == null)
			return null;
		
		//Case-1 : Node to be deleted has no children, i.e. it is a leaf node.
		if(current.left == null && current.right == null){
			
			//If tree has only root node, delete it and set root to null
			if(current == node){
				node = null;
			}
			else{
				if(parent.left == current)
					parent.left = null;
				else
					parent.right = null;
			}
		}
		
		//Case-2 : Node to be deleted has two children
		else if(current.left != null && current.right != null){
			
			//Find its in-order successor node
			Node successor = findMinimum(current.right);
			int value = successor.data;
			delete(node, successor.data);
			current.data = value;
		}
		
		//Case-3 : Node to be deleted has one children
		else{
			Node child = (current.left != null) ? current.left : current.right;
			
			//If node to be deleted is root node, then set the root to child
			if(current == node){
				node = child;
			}
			else{
				if(parent.left == current)
					parent.left = child;
				else
					parent.right = child;
			}
		}
		return node;
	}
	
	public Node findMinimum(Node current){
		while(current.left != null)
			current = current.left;
		return current;
	}
}
