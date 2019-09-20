package com.org.tree;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

import com.org.tree.BinaryTreeVerticalOrderRecursion.Node;

public class TraverseTreeVerticalOrderUsingRecursion {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
		root.right.right.left = new Node(10);
		root.right.right.right = new Node(9);
		root.right.right.left.right = new Node(11);
		root.right.right.left.right.right = new Node(12);
		
		BinaryTreeVerticalOrderRecursion tree = new BinaryTreeVerticalOrderRecursion();
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
		tree.verticalOrder(root, 0, map);
		tree.print(map);
	}
}

class BinaryTreeVerticalOrderRecursion {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public void verticalOrder(Node node, int level, TreeMap<Integer, ArrayList<Integer>> map) {
		
		if(node == null)
			return;
		
		if(map.containsKey(level)){
			ArrayList<Integer> list = map.get(level);
			list.add(node.data);
			map.put(level, list);
		} else{
			ArrayList<Integer> list = new ArrayList<>();
			list.add(node.data);
			map.put(level, list);
		}
		
		verticalOrder(node.left, level-1, map);
		verticalOrder(node.right, level+1, map);
	}
	
	public void print(TreeMap<Integer, ArrayList<Integer>> map){
		Set<Integer> set = map.keySet();
		for(int key : set){
			System.out.println(map.get(key));
		}
	}
}
