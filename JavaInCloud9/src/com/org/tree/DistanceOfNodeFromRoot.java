package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.org.tree.BinaryTreeDistanceOfNode.Node;

public class DistanceOfNodeFromRoot {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);

		BinaryTreeDistanceOfNode tree = new BinaryTreeDistanceOfNode();
		int distance = tree.distance(root, 2);
		System.out.println("Distance of given Node from Root - " + distance);
	}

}

class BinaryTreeDistanceOfNode {

	Node root;

	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}

	public int distance(Node rootNode, int element){

		if(rootNode == null)
			return -1;

		if(rootNode.data == element)
			return 0;

		Queue<Node> queue = new LinkedList<>();
		queue.add(rootNode);
		queue.add(null);
		int distance = 0;

		while(!queue.isEmpty()){
			Node current = queue.remove();
			if(current == null){
				if(!queue.isEmpty()){
					queue.add(null);
					distance++;
				}
			}
			else{
				if(current.data == element)
					return distance;
				if(current.left != null)
					queue.add(current.left);
				if(current.right != null)
					queue.add(current.right);

			}
		}
		return distance;
	}
}












