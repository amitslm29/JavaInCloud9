package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.org.tree.BinaryTreeMinimumDepth.Node;

/*
 * The minimum depth is the number of nodes along the shortest path 
 * from root node down to the nearest leaf node
 */
public class MinimumDepthOfBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		BinaryTreeMinimumDepth tree = new BinaryTreeMinimumDepth();
		System.out.print("Minimum Depth of given Tree - " + tree.minimumDepth(root));
	}
}

class BinaryTreeMinimumDepth {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		public Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public int minimumDepth(Node node){
		if(node == null)
			return 0;
		
		if(node.left == null && node.right == null)
			return 1;
		
		return Math.min(minimumDepth(node.left), minimumDepth(node.right)) + 1;
	}
	
	/*public int minimumDepth(Node node){
		
		if(node == null)
			return 0;
		
		Queue<Node> queue = new LinkedList<>();
		Queue<Integer> counts = new LinkedList<>();
		queue.add(node);
		counts.add(1);
		
		while(!queue.isEmpty()){
			Node current = queue.remove();
			int count = counts.remove();
			
			if(current.left == null || current.right == null)
				return count;
			
			if(current.left != null){
				queue.add(current.left);
				counts.add(count+1);
			}
			if(current.right != null){
				queue.add(current.right);
				counts.add(count+1);
			}
		}
		
		return -1;
	}*/
	
}
