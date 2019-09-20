package com.org.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import com.org.tree.BinaryTreeVerticalOrder.Node;

public class TraverseTreeVerticalOrder {
	
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
		
		BinaryTreeVerticalOrder tree = new BinaryTreeVerticalOrder();
		tree.verticalOrder(root);
	}
}

class BinaryTreeVerticalOrder {
	
	Node root;
	
	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
		
		public String toString(){
			return String.valueOf(data);
		}
	}
	
	static class Obj {
		Node node;
		int level;
		public Obj(Node node, int level){
			this.node = node;
			this.level = level;
		}
	}
	
	public void verticalOrder(Node node) {
		
		if(node == null)
			return;
		
		TreeMap<Integer, ArrayList<Node>> map = new TreeMap<>();
		Queue<Obj> queue = new LinkedList<>();
		queue.add(new Obj(node, 0));
		
		while(!queue.isEmpty()){
			Obj current = queue.remove();
			if(map.containsKey(current.level)){
				ArrayList<Node> list = map.get(current.level);
				list.add(current.node);
				map.put(current.level, list);
			}
			else{
				ArrayList<Node> list = new ArrayList<>();
				list.add(current.node);
				map.put(current.level, list);
			}
			
			if(current.node.left != null)
				queue.add(new Obj(current.node.left, current.level-1));
			if(current.node.right != null)
				queue.add(new Obj(current.node.right, current.level+1));
		}
		
		Set<Integer> set = map.keySet();
		for(int key : set){
			System.out.println(map.get(key));
		}
	}
}