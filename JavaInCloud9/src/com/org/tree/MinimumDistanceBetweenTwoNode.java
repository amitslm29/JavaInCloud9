package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.org.tree.BinaryTreeMinimumDistance.Node;

/*
 * Approach -
 * Find LCA of both the node
 * Find distance of each node from LCA
 * Add both the distance
 */
public class MinimumDistanceBetweenTwoNode {
	
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
		
		BinaryTreeMinimumDistance tree = new BinaryTreeMinimumDistance();
		int minimumDistance = tree.minimumDistanceBetweenTwoNodes(root, 8, 1);
		System.out.println("Minimum Distance between given two nodes - " + minimumDistance);
	}

}

class BinaryTreeMinimumDistance {
	
	Node root;
	
	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	//Minimum distance between two nodes
	public int minimumDistanceBetweenTwoNodes(Node node, int first, int second){
		Node lca = lowestCommonAncestor(node, first, second);
		int distanceOfFirstNode = distanceFromLCA(lca, first);
		int distanceOfSecondNode = distanceFromLCA(lca, second);
		return distanceOfFirstNode + distanceOfSecondNode;
	}
	
	//LCA of two given nodes
	public Node lowestCommonAncestor(Node node, int first, int second){
		if(node == null)
			return null;
		if(node.data == first || node.data == second)
			return node;
		
		Node leftLCA = lowestCommonAncestor(node.left, first, second);
		Node rightLCA = lowestCommonAncestor(node.right, first, second);
		
		if(leftLCA != null && rightLCA != null)
			return node;
		else if(leftLCA == null && rightLCA == null)
			return null;
		else
			return leftLCA == null ? rightLCA : leftLCA;
	}
	
	//Distance of a node from LCA node
	public int distanceFromLCA(Node lca, int element){
		
		if(lca == null)
			return -1;
		
		if(lca.data == element)
			return 0;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(lca);
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