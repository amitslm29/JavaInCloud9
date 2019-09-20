package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;
import com.org.tree.BinaryTreeIdentical.Node;

/*
 * Here we check whether two trees are identical or not
 * using iterative solution. Idea here is to traverse both
 * the tree using level order and compare the data when we
 * remove it from the queue.
 */
public class IsIdentical {
	
	public static void main(String[] args) {
		Node root1 = new Node(1);
		Node root2 = new Node(1);
		
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);
		root1.right.left = new Node(6);
		root1.right.right = new Node(7);
		
		root2.left = new Node(2);
		root2.right = new Node(3);
		root2.left.left = new Node(4);
		root2.left.right = new Node(5);
		root2.right.left = new Node(6);
		root2.right.right = new Node(7);
		
		BinaryTreeIdentical tree = new BinaryTreeIdentical();
		System.out.println("Is Both Tree Identical - " + tree.isIdenticalUsingRecursion(root1, root2));
	}
}

class BinaryTreeIdentical {
	
	Node root1;
	Node root2;
	
	static class Node{
		int data;
		Node left, right;
		public Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public boolean isIdentical(Node node1, Node node2){
		
		if(node1 == null && node2 == null)
			return true;
		
		if(node1 == null || node2 == null)
			return false;
		
		Queue<Node> queue1 = new LinkedList<>();
		Queue<Node> queue2 = new LinkedList<>();
		queue1.add(node1);
		queue2.add(node2);
		
		while(!queue1.isEmpty() && !queue2.isEmpty()){
			
			Node current1 = queue1.remove();
			Node current2 = queue2.remove();
			
			if(current1.data != current2.data)
				return false;
			
			if(current1.left != null && current2.left != null){
				queue1.add(current1.left);
				queue2.add(current2.left);
			}
			else if(current1.left != null || current2.left != null){
				return false;
			}
			
			if(current1.right != null && current2.right != null){
				queue1.add(current1.right);
				queue2.add(current2.right);
			}
			else if(current1.right != null || current2.right != null){
				return false;
			}
		}
		return true;
	}
	
	public boolean isIdenticalUsingRecursion(Node node1, Node node2){
		
		if(node1 == null && node2 == null)
			return true;
		
		if(node1 == null || node2 == null)
			return false;
		
		if(node1.data == node2.data){
			if(isIdenticalUsingRecursion(node1.left, node2.left) &&
				isIdenticalUsingRecursion(node1.right, node2.right)){
				return true;
			}
		}
		return false;
	}
}
