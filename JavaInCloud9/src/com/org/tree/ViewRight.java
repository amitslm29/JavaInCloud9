package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.org.tree.RightViewBinaryTree.Node;

/*
 * This problem can be solved using Level order traversal concept.
 */
public class ViewRight {

	public static void main(String[] args) {
		RightViewBinaryTree tree = new RightViewBinaryTree();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("Right View of Given Tree - ");
		tree.rightView(root);
	}

}

class RightViewBinaryTree {
	
	Node root;

	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}

	public void rightView(Node node){
		if(node == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		queue.add(node);

		while(!queue.isEmpty()){
			int size = queue.size();

			for(int i=0 ; i<size ; i++){
				Node current = queue.remove();
				if(i == size-1)
					System.out.print(current.data + " ");

				if(current.left != null)
					queue.add(current.left);
				if(current.right != null)
					queue.add(current.right);
			}
		}	
	}
}
