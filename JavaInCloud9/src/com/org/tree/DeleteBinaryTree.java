package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;
import com.org.tree.BinaryTreeDeletion.Node;

/*
 * The program should de-allocate every single node present in the tree,
 * not just change reference of the root node to null.
 * In iterative version, we perform level order traversal of the tree. The
 * idea is to delete each node in the queue one by one after pushing their children
 * to the queue. Note that we are deleting a parent here before deleting its
 * children as we are pushing them into the queue and they will be processed and
 * deleted afterwards.
 * https://www.techiedelight.com/delete-given-binary-tree-iterative-recursive/
 */
public class DeleteBinaryTree {

	public static void main(String[] args) {
		BinaryTreeDeletion tree = new BinaryTreeDeletion();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		System.out.print("Before Deletion - ");
		tree.print(tree.root);
		tree.deleteBinaryTree();
		System.out.println();
		System.out.print("After Deletion - ");
		tree.print(tree.root);
	}
}

class BinaryTreeDeletion {

	Node root;

	static class Node{
		int data;
		Node left, right;
		public Node(int data){
			this.data = data;
			left = right = null;
		}
	}

	public void deleteBinaryTree(){

		if(root == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty()){
			Node current = queue.remove();
			if(current.left != null)
				queue.add(current.left);
			if(current.right != null)
				queue.add(current.right);
		}
		root = null;
	}

	public void print(Node node) {
		if(node == null)
			return;
		print(node.left);
		System.out.print(node.data + " ");
		print(node.right);
	}
}
