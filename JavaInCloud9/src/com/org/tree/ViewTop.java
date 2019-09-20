package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import com.org.tree.TopViewBinaryTree.Node;

/*
 * We can find top view using vertical order traversal and
 * level order traversal.
 */
public class ViewTop {
	
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
		
		System.out.print("Top View of given Binary Tree : ");
		TopViewBinaryTree tree = new TopViewBinaryTree();
		tree.topView(root);
	}
}

class TopViewBinaryTree {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	static class Obj{
		Node node;
		int level;
		public Obj(Node node, int level){
			this.node = node;
			this.level = level;
		}
	}
	
	public void topView(Node node){
		if(node == null)
			return;
		
		TreeMap<Integer, Node> map = new TreeMap<>();
		Queue<Obj> queue = new LinkedList<>();
		queue.add(new Obj(node, 0));
		
		while(!queue.isEmpty()) {
			Obj current = queue.remove();
			if(!map.containsKey(current.level)){
				map.put(current.level, current.node);
			}
			if(current.node.left != null)
				queue.add(new Obj(current.node.left, current.level-1));
			if(current.node.right != null)
				queue.add(new Obj(current.node.right, current.level+1));
		}
		
		Set<Integer> set = map.keySet();
		for(int i : set) {
			System.out.print(map.get(i).data + " ");
		}
	}
}
