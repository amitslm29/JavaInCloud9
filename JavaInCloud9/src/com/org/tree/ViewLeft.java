package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;
import com.org.tree.LeftViewBinaryTree.Node;

/*
 * This problem can be solved using Level order traversal concept.
 */
public class ViewLeft {
	
	public static void main(String[] args) {
		LeftViewBinaryTree tree = new LeftViewBinaryTree();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("Left View of Given Tree - ");
		tree.leftView(root);
	}
}

class LeftViewBinaryTree {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public void leftView(Node node){
		if(node == null)
			return;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			
			for(int i=0 ; i<size ; i++){
				Node current = queue.remove();
				if(i == 0)
					System.out.print(current.data + " ");
				
				if(current.left != null)
					queue.add(current.left);
				if(current.right != null)
					queue.add(current.right);
			}
		}
		
		/*Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		queue.add(null);
		
		boolean flag = true;
		
		while(!queue.isEmpty()){
			Node current = queue.remove();
			if(current == null){
				flag = true;
				queue.add(null);
			}
			else {
				if(flag == true){
					System.out.print(current.data + " ");
					flag = false;
				}
				
				if(current.left != null)
					queue.add(current.left);
				if(current.right != null)
					queue.add(current.right);
			}
		}*/
	}
}
