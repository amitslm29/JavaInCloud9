package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;
import com.org.tree.BinaryTreeDiagonal.Node;

public class TraverseTreeDiagonal {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		BinaryTreeDiagonal tree = new BinaryTreeDiagonal();
		tree.diagonal(root);;
	}
}

class BinaryTreeDiagonal {

	Node root;

	static class Node {
		int data;
		Node left, right;
		public Node(int data){
			this.data = data;
			left = right = null;
		}
	}

	public void diagonal(Node node){

		if(node == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		queue.add(node);

		while(!queue.isEmpty()){
			Node current = queue.remove();
			while(current != null){
				System.out.print(current.data + " ");
				if(current.left != null)
					queue.add(current.left);
				current = current.right;
			}
		}
	}

	public void diagonalLineByLine(Node node){

		if(node == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		queue.add(null);

		while(!queue.isEmpty()){
			Node current = queue.remove();
			if(current == null){
				if(!queue.isEmpty()){
					queue.add(null);
					System.out.println();
				}
			}
			else{
				while(current != null){
					System.out.print(current.data + " ");
					if(current.left != null)
						queue.add(current.left);
					current = current.right;
				}
			}
		}
	}
}
